import java.io.IOException;
import java.util.HashMap;

import java.io.PrintWriter;

public class fileHandler {
    public static void readFile() throws IOException {
        System.out.println("IN READFILE METHOD");
    }


    public static void writefile(HashMap<String, Integer> playerGuesses,
     PrintWriter pw) throws IOException {
     
        pw.write("Player Guesses:\n");

        for (String i : playerGuesses.keySet()) {
            pw.write(i + " " + playerGuesses.get(i) + "\n");
        }
        pw.write("\nPlayers and their number:\n");
    }


    public static void writeMapFile(HashMap<String, Integer> namesMap,
        PrintWriter pw) throws IOException {
        
        // write hashmap data to file
        for (String i : namesMap.keySet()) {
            pw.write(i + " " + namesMap.get(i) + "\n");
            
        }
        pw.close();
         
    }
}