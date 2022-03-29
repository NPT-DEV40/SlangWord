/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package slangword;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author 84399
 */
public class SlangWord {
    private TreeMap<String, List<String>> map = new TreeMap<>();
    private static SlangWord obj = new SlangWord();
    int sizeMap;
    private String File_SlangWord = "SlangWord.txt";
    private String File_ORIGINAL = "SlangWord_1.txt";
    private String File_History = "History.txt";
    
    SlangWord() {
        try {
            String current = new java.io.File(".").getCanonicalPath();
            System.out.println("Current dir:" + current);
            File_SlangWord = current + "\\" + File_SlangWord;
            File_ORIGINAL = current + "\\" + File_ORIGINAL;
            File_History = current + "\\" + File_History;
            readFile(File_SlangWord);
        } catch (Exception e) {
                e.printStackTrace();
        }
    }
    
    public static SlangWord getInstance() {
        if (obj == null) {
                synchronized (SlangWord.class) { 
                        if (obj == null) {
                                obj = new SlangWord();
                        }
                }
        }
        return obj;
    }
    
    void saveFile(String file) {
		try {
			PrintWriter printWriter = new PrintWriter(new File(file));
			StringBuilder stringBuilder = new StringBuilder();

			stringBuilder.append("Slag`Meaning\n");
			String s[][] = new String[map.size()][3];
			Set<String> keySet = map.keySet();
			Object[] keyArray = keySet.toArray();
			for (int i = 0; i < map.size(); i++) {
				Integer in = i + 1;
				s[i][0] = in.toString();
				s[i][1] = (String) keyArray[i];
				List<String> meaning = map.get(keyArray[i]);
				stringBuilder.append(s[i][1] + "`" + meaning.get(0));
				for (int j = 1; j < meaning.size(); j++) {
					stringBuilder.append("|" + meaning.get(j));
				}
				stringBuilder.append("\n");
			}
			printWriter.write(stringBuilder.toString());
			printWriter.close();

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	void readFile(String file) throws Exception {
		map.clear();
		String slag = null;
		Scanner scanner = new Scanner(new File(file));
		scanner.useDelimiter("`");
		scanner.next();
		String temp = scanner.next();
		String[] part = temp.split("\n");
		int i = 0;
		int flag = 0;
		sizeMap = 0;
		while (scanner.hasNext()) {
			List<String> meaning = new ArrayList<String>();
			slag = part[1].trim();
			temp = scanner.next();
			part = temp.split("\n");
			if (map.containsKey(slag)) {
				meaning = map.get(slag);
			}
			if (part[0].contains("|")) {
				String[] d = (part[0]).split("\\|");

				Collections.addAll(meaning, d);
				sizeMap += d.length - 1;
			} else {
				meaning.add(part[0]);
			}
			map.put(slag.trim(), meaning);
			i++;
			sizeMap++;
		}
		scanner.close();
	}
        
        

	public String[][] getData() {
		String s[][] = new String[sizeMap][3];
		Set<String> slagListSet = map.keySet();
		Object[] slagList = slagListSet.toArray();
		int index = 0;
		for (int i = 0; i < sizeMap; i++) {
			s[i][0] = String.valueOf(i);
			s[i][1] = (String) slagList[index];
			List<String> meaning = map.get(slagList[index]);
			s[i][2] = meaning.get(0);			
			for (int j = 1; j < meaning.size(); j++) {
				if (i < sizeMap)
					i++;
				s[i][0] = String.valueOf(i);
				s[i][1] = (String) slagList[index];
				s[i][2] = meaning.get(j);
			}
			index++;
		}
		return s;
	}

	public String[][] getMeaning(String key) {
		List<String> listMeaning = map.get(key);
		if (listMeaning == null)
			return null;
		int size = listMeaning.size();
		String s[][] = new String[size][3];
		for (int i = 0; i < size; i++) {
			s[i][0] = String.valueOf(i);
			s[i][1] = key;
			s[i][2] = listMeaning.get(i);
		}
		return s;
	}

	public void set(String slag, String oldValue, String newValue) {
		System.out.println(oldValue + "\t" + newValue);
		List<String> meaning = map.get(slag);
		int index = meaning.indexOf(oldValue);
		meaning.set(index, newValue);
		this.saveFile(File_SlangWord);
		System.out.println("Size of map: " + sizeMap);
	}

	public void saveHistory(String slag, String meaning) throws Exception {
		File file1 = new File(File_History);
		FileWriter fr = new FileWriter(file1, true);
		fr.write(slag + "`" + meaning + "\n");
		fr.close();
	}

	public String[][] readHistory() {
		List<String> historySlag = new ArrayList<>();
		List<String> historyDefinition = new ArrayList<>();
		try {
			Scanner scanner = new Scanner(new File(File_History));
			scanner.useDelimiter("`");
			String temp = scanner.next();
			String[] part = scanner.next().split("\n");
			historySlag.add(temp);
			historyDefinition.add(part[0]);
			while (scanner.hasNext()) {
				temp = part[1];
				part = scanner.next().split("\n");
				historySlag.add(temp);
				historyDefinition.add(part[0]);
			}
			scanner.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		int size = historySlag.size();
		String s[][] = new String[size][3];
		for (int i = 0; i < size; i++) {
			s[size - i - 1][0] = String.valueOf(size - i);
			s[size - i - 1][1] = historySlag.get(i);
			s[size - i - 1][2] = historyDefinition.get(i);
		}
		return s;
	}

	public String[][] findDefinition(String query) {
		List<String> keyList = new ArrayList<>();
		List<String> meaningList = new ArrayList<>();
		for (Entry<String, List<String>> entry : map.entrySet()) {
			List<String> meaning = entry.getValue();
			for (int i = 0; i < meaning.size(); i++) {
				if (meaning.get(i).toLowerCase().contains(query.toLowerCase())) {
					keyList.add(entry.getKey());
					meaningList.add(meaning.get(i));
				}
			}
		}
		int size = keyList.size();
		String s[][] = new String[size][3];

		for (int i = 0; i < size; i++) {
			s[i][0] = String.valueOf(i);
			s[i][1] = keyList.get(i);
			s[i][2] = meaningList.get(i);
		}
		return s;
	}

	public void reset() {
		try {
			readFile(File_ORIGINAL);
			this.saveFile(File_SlangWord);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void delete(String slag, String value) {
		List<String> meaningList = map.get(slag);
		int index = meaningList.indexOf(value);
		if (meaningList.size() == 1) {
			map.remove(slag);
		} else {
			meaningList.remove(index);
			map.put(slag, meaningList);
		}
		sizeMap--;
		this.saveFile(File_SlangWord);
	}

	public void addNew(String slag, String meaning) {
		List<String> meaningList = new ArrayList<>();
		meaningList.add(meaning);
		sizeMap++;
		map.put(slag, meaningList);
		this.saveFile(File_SlangWord);
	}

	public void addDuplicate(String slag, String meaning) {
		List<String> meaningList = map.get(slag);
		meaningList.add(meaning);
		sizeMap++;
		map.put(slag, meaningList);
		this.saveFile(File_SlangWord);
	}

	public void addOverwrite(String slag, String meaning) {
		List<String> meaningList = map.get(slag);
		meaningList.set(0, meaning);
		map.put(slag, meaningList);
		this.saveFile(File_SlangWord);
	}

	public boolean checkSlang(String slag) {
		for (String keyString : map.keySet()) {
			if (keyString.equals(slag))
				return true;
		}
		return false;
	}
        
        public static int randInt(int minimum, int maximum) {
		return (minimum + (int) (Math.random() * maximum));
	}

	public String[] random() {
		int min = 0;
		int max = map.size() - 1;
		int rand = randInt(min, max);
		String s[] = new String[2];
		int index = 0;
		for (String key : map.keySet()) {
			if (index == rand) {
				s[0] = key;
				s[1] = map.get(key).get(0);
				break;
			}
			index++;
		}
		return s;
	}


	public String[] quiz(int type) {
		String s[] = new String[6];
		if (type == 1) {
			String[] slangRandom = this.random();
			s[0] = slangRandom[0];
			int rand = randInt(1, 4);
			s[rand] = slangRandom[1];
			s[5] = slangRandom[1];
			for (int i = 1; i <= 4; i++) {
				if (rand == i)
					continue;
				else {
					String[] slangRand = this.random();
					while (slangRand[0] == s[0]) {
						slangRand = this.random();
					}
					s[i] = slangRand[1];
				}
			}
		} else {
			String[] slangRandom = this.random();
			s[0] = slangRandom[1];
			int rand = randInt(1, 4);
			s[rand] = slangRandom[0];
			s[5] = slangRandom[0];
			for (int i = 1; i <= 4; i++) {
				if (rand == i)
					continue;
				else {
					String[] slangRand = this.random();
					while (slangRand[0] == s[0]) {
						slangRand = this.random();
					}
					s[i] = slangRand[0];
				}
			}
		}

		return s;
	}
            
}
