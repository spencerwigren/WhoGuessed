import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;
import java.io.PrintWriter;

public class fileHandler {
    public static void readFile(String FileName) {
        /*
         * Read File and output to terminal
         */
        Scanner myReader = new Scanner(FileName);
        while (myReader.hasNextLine()) {
            String fileData = myReader.nextLine();
            System.out.println(fileData);
        }
        myReader.close();
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
        pw.write("\nPlayers and their number:\n");
        
        for (String i : namesMap.keySet()) {
            pw.write(i + " " + namesMap.get(i) + "\n");
            
        }
        pw.close();
         
    }
}