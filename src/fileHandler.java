import java.io.BufferedReader;
import java.io.IOException;
import java.util.HashMap;

import java.io.PrintWriter;
import java.io.FileReader;

public class fileHandler {
    /*
     * This class will handle the writing and reading to a file
     * 
     * Methods:
     * readFile
     * writeFile
     */ 
    public static void readFile(String FileName) {
        /*
         * Will read the file
         * And display to terminal
         */
        BufferedReader br = null;
        String line;

        try {
            // crete reader
            br = new BufferedReader(new FileReader(FileName));
            
            // read a line and print to terminal
            while((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void writefile(HashMap<String, Integer> playerGuesses,
     HashMap<String, Integer> namesMap,
      PrintWriter pw) throws IOException {
        /*
        * Write to a file
        */

        pw.write("Player Guesses:\n");
        
        // Dipplays the playerguess
        for (String i : playerGuesses.keySet()) {
            pw.write(i + " " + playerGuesses.get(i) + "\n");
        }

        pw.write("\nPlayers and their number:\n");
        
        // Displays the entered names and their random value
        for (String i : namesMap.keySet()) {
            pw.write(i + " " + namesMap.get(i) + "\n"); 
        }

        pw.close(); 
    }
}