/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package slangword;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 84399
 */
public class SlangWord {
    private TreeMap<String, List<String>> map = new TreeMap<>(); // Khởi tạo treemap với slag là 1 String và meaning là list string
    int sizeMap; // Độ dài
    private String File_SlangWord = "SlangWord.txt";
    private String File_History = "SlangWord_History.txt";
    private String File_Original = "SlangWord_1.txt";

    public SlangWord() {
        try {
            String Path_root = new java.io.File(".").getCanonicalPath();
            File_History = Path_root + "\\" + File_History;
            File_Original = Path_root + "\\" + File_Original;
            File_SlangWord = Path_root + "\\" + File_SlangWord;
            ReadFile(File_SlangWord);
        } catch (IOException ex) {
            Logger.getLogger(SlangWord.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    void ReadFile(String file) throws FileNotFoundException {
        map.clear();
        Scanner scanner = new Scanner(new File(file));
        scanner.useDelimiter("`");
        scanner.next();
        String temp = scanner.next();
        String[] part = temp.split("\n");
        String slag = null;
        sizeMap = 0;
        while(scanner.hasNext()) {
            List<String> meaning = new ArrayList<>();
            slag = part[1].trim();
            temp = scanner.next();
            part = temp.split("\n");
            if(map.containsKey(slag)) {
                meaning = map.get(slag); // Lấy value cảu key muốốn tìm kiếm
            }
            if(part[0].contains("|")) {
                System.out.println(part[0]);
                String[] tmp = part[0].split("\\|");
                Collections.addAll(meaning,tmp);
                sizeMap += tmp.length - 1;
            } else {
                meaning.add(part[0]);
            }
            map.put(slag.trim(),meaning);
            sizeMap++;
        }
        scanner.close();
    }
    
    public void saveFile(String file) {
        try {
            PrintWriter printWriter = new PrintWriter(new File(file));
            StringBuilder stringBuilder = new StringBuilder();
            
            stringBuilder.append("Slag`Meaning\n");
            String[][] s = new String[map.size()][3];
            Set<String> keySet = map.keySet();
            Object[] keyArray = keySet.toArray();
            for(int i=0;i<map.size();i++) {
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
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SlangWord.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public String[][] getData() {
        String[][] s = new String[sizeMap][3];
        Set<String> slagList_set = map.keySet();
        Object[] slagList_array = slagList_set.toArray();
        int index=0;
        for(int i=0; i < sizeMap; i++) {
            s[i][0] = String.valueOf(i); // Lưu trữ số thứ tự
            s[i][1] = (String) slagList_array[index]; // Lưu trữ lag
            List<String> meaning = map.get(slagList_array[index]);
            s[i][2] = meaning.get(0);
            
            for(int j=1;j<meaning.size();j++) {
                if(i<sizeMap) i++;
                s[i][0] = String.valueOf(i); // Lưu trữ số thứ tự
                s[i][1] = (String) slagList_array[index]; // Lưu trữ lag
                s[i][2] = meaning.get(j);
            }
            index++;
        }
        return s;
    }
    
    public String[][] getMeaning(String slag) {
        List<String> List_Meaning = map.get(slag);
        if(List_Meaning == null) {
            return null;
        }
        String[][] s = new String[List_Meaning.size()][3];
        for(int i=0;i<List_Meaning.size();i++) {
            s[i][0] = String.valueOf(i);
            s[i][1] = slag;
            s[i][2] = List_Meaning.get(i);
        }
        return s;
    }
    
    public void delete(String slagString,String value) {
        List<String> Meaning_List = map.get(slagString);
        int index = Meaning_List.indexOf(value);
        if(Meaning_List.size()==1) {
            map.remove(slagString);
        } else {
            Meaning_List.remove(index);
            map.put(slagString, Meaning_List);
        }
        sizeMap--;
        
    }
    
    
    public static void main(String[] args) {
        SlangWord slangword = new SlangWord();
        System.out.println(slangword);
    }
    
}
