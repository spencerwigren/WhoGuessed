import java.util.HashMap;

public class guessAverage {
    
    private static int getAverage(HashMap<String, Integer> namesMap) {
        // Finds the average of the numbers
        
        int average = 0;
        int total = 0;
        for (String i : namesMap.keySet()) {
            average += namesMap.get(i);
            total += 1;
        }

        average = average / total;

        return average;
    }

    
    public static void guessAverageNumber(HashMap<String,
        Integer> namesMap, HashMap<String, Integer> playerGuesses,
        int guesses) {
        /*
         * Logic for getting player guesses
         */
        
        int average = getAverage(namesMap);
        System.out.println(average);

        while (true){
            System.out.print("What do you think the average guess is (1-20): ");
            String guess = System.console().readLine();
            
            try {
                int guessNumber = Integer.parseInt(guess);

                playerGuesses.put("Guess "+ guesses, guessNumber);
                guesses += 1;

                if (guessNumber == average) {
                    System.out.println("Congratualtion your guess " + guessNumber + " is the correct average!!!!\n");
                    return;
                } 
                else if (guessNumber < average){
                    System.out.println("Number " + guessNumber + " is to small - try again");
                } 
                else if (guessNumber > average) {
                    System.out.println("Number" + guessNumber + " is to larger - try again");
                }

            } catch (NumberFormatException e) {
                System.out.println("The guess was not a number - please enter a number");
            }

        }
    }

}
