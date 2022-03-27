/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package slangword;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
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
    
    
    public static void main(String[] args) {
        SlangWord slangword = new SlangWord();
        System.out.println(slangword);
    }
    
}
