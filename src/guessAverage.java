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


    public static void guessAverageNumber(HashMap<String, Integer> namesMap) {
        
        
        int average = getAverage(namesMap);
        System.out.println(average);

        while (true){
            System.out.print("What do you think the average guess is (1-20): ");
            String guess = System.console().readLine();
            try {
                int guessNumber = Integer.parseInt(guess);

                if (guessNumber == average) {
                    System.out.println("Congratualtion you guess " + guessNumber + " is the correct average!!!!\n");
                    return;
                } 
                else if (guessNumber < average){
                    System.out.println("The number you guess " + guessNumber + " Is to small - try again");
                } 
                else if (guessNumber > average) {
                    System.out.println("The number you guess " + guessNumber + " Is to larger - try again");
                }
                else {
                    System.out.println("That is not the right number - try again");
                }

             

            } catch (NumberFormatException e) {
                System.out.println("The guess was not a number - please enter a number");
            }

        }
    }

}
