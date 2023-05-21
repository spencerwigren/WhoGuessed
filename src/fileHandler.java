import java.io.BufferedReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileReader;

public class fileHandler {
    public static void readFile(String FileName) {
        BufferedReader br = null;

        String line;

        try {
            br = new BufferedReader(new FileReader(FileName));
            
            while((line = br.readLine()) != null) {
                System.out.println(line);
            }


        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    public static void writefile(HashMap<String, Integer> playerGuesses,
     PrintWriter pw) throws IOException {
        /*
        * Write to file
        */

        pw.write("Player Guesses:\n");

        for (String i : playerGuesses.keySet()) {
            pw.write(i + " " + playerGuesses.get(i) + "\n");
        }
        pw.close();
    }


    public static void writeMapFile(HashMap<String, Integer> namesMap,
        PrintWriter pw) throws IOException {
        /*
         * Write names hasmap to file
         */
        pw.write("Players and their number:");
        
        for (String i : namesMap.keySet()) {
            pw.write(i + " " + namesMap.get(i) + "\n");
            
        }
        pw.close();
         
    }
}