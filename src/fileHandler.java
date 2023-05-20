import java.io.IOException;
import java.util.HashMap;

import java.io.FileWriter;
import java.io.PrintWriter;

public class fileHandler {
    public static void readFile() throws IOException {
        System.out.println("IN readFile method");
    }


    public static void writeFile(HashMap<String, Integer> namesMap,
        PrintWriter pw) throws IOException {
        
        System.out.println("IN WRITEFILE METHOD");

        for (String i : namesMap.keySet()) {
            pw.println(i + " " + namesMap.get(i));
            
        }
        pw.close();
         
    }

    
    public static void main(int ReadWrite,
        HashMap<String, Integer> namesMap,
        PrintWriter pw) throws IOException{
        
        switch (ReadWrite) {
            case 1:
                readFile();
                break;
            case 2:
                writeFile(namesMap, pw);
                break;
        }
    }
}