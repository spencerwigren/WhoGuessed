import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

import java.util.HashMap;
import java.util.Random;
public class App {

    public static void main(String[] args) throws Exception {

        // Handles file wrting and reading logic
        String FileName = "src/scores.txt";
        File file = new File(FileName);
        FileWriter writer = new FileWriter(file);
        PrintWriter pw = new PrintWriter(writer);


        // Creates HashMap
        HashMap<String, Integer> namesMap = new HashMap<String, Integer>();

        // Create Random object
        Random rand = new Random();

        Boolean gameHandler = true;
        while (gameHandler) {
            
            System.out.print("What is your name: ");
            String name = System.console().readLine();

            namesMap.put(name, rand.nextInt(10));
            System.out.println(namesMap.get(name));

            System.out.print("Do you want to play again? (Y/N) ");
            String GameQuit = System.console().readLine();

            // Exit game
            if (GameQuit.toUpperCase().equals("N")){
                gameHandler = false;
            }
        }

    }
}
