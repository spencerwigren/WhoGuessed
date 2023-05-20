import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import java.util.HashMap;
import java.util.Random;

public class App {

    public static void getNames(Integer numberNames,
        HashMap<String, Integer> namesMap,
        Random rand ) {

        for (int i = 0; i < numberNames; i++) {
            System.out.print("What is name " + (i+1) + ": ");
            String name = System.console().readLine();

            namesMap.put(name, rand.nextInt(10));

        }
    }


    public static void main(String[] args) throws Exception{

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
            
            System.out.print("How many names do you want to guess? (1-10) ");
            String numNames = System.console().readLine();
            try {
                // Sets numNames to an interger numberNames
                int numberNames = Integer.parseInt(numNames);
                
                // Set hashmap to the number of names
                // along with a random number of 1-10
                getNames(numberNames, namesMap, rand);


                System.out.print("Do you want to play again? (Y/N) ");
                String GameQuit = System.console().readLine();

                // Exit game
                if (GameQuit.toUpperCase().equals("N")){
                    fileHandler.main(2, namesMap, pw);
                    fileHandler.main(1,namesMap, pw);

                    gameHandler = false;
                }




            } catch (NumberFormatException e) {
                System.out.println("The input was not a number\nplease try again");
            }  
        }

    }
}
