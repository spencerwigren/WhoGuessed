import java.io.IOException;
import java.util.HashMap;

import java.io.PrintWriter;

public class fileHandler {
    public static void readFile() throws IOException {
        System.out.println("IN READFILE METHOD");
    }


    public static void writefile() throws IOException {
        System.out.println("IN WRITEFILE METHOD");
    }


    public static void writeMapFile(HashMap<String, Integer> namesMap,
        PrintWriter pw) throws IOException {
        
        System.out.println("IN WRITEMAPFILE METHOD");

        // write hashmap data to file
        for (String i : namesMap.keySet()) {
            pw.println(i + " " + namesMap.get(i));
            
        }
        pw.close();
         
    }
}