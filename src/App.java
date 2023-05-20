import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

import java.util.HashMap;
import java.util.Random;

public class App {

    public static void getNames(Integer numberNames,
        HashMap<String, Integer> namesMap,
        Random rand ) {
        /**
        * Add names
        * Add random number of 1-10 for each name
        */

        for (int i = 0; i < numberNames; i++) {
            System.out.print("What is name " + (i+1) + ": ");
            String name = System.console().readLine();

            namesMap.put(name, rand.nextInt(20));

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

        // instructions
        System.out.println("You will input a number for how many names you want to add");
        System.out.println("Then they will generate an number from 1-20");
        System.out.println("After that you will try to guess the avergae\n");


        Boolean gameHandler = true;
        while (gameHandler) {
            
            System.out.print("How many name do you want to guess? (1-10) ");
            String numNames = System.console().readLine();
            try {
                // Sets numNames to an interger numberNames
                int numberNames = Integer.parseInt(numNames);
                
                // sets hashmap
                getNames(numberNames, namesMap, rand);
                
                // Has player guss the average of the number
                guessAverage.guessAverageNumber(namesMap);


                System.out.print("Do you want to add more names and guess again? (Y/N) ");
                String GameQuit = System.console().readLine();

                // Exit game
                if (GameQuit.toUpperCase().equals("N")){
                    fileHandler.writefile();
                    fileHandler.writeMapFile(namesMap, pw);
                    fileHandler.readFile();

                    gameHandler = false;
                }

            } catch (NumberFormatException e) {
                System.out.println("The input was not a number\nplease try again");
            }  
        }

    }



}
