import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.HashMap;

public class App {
    public static void main(String[] args) throws Exception {

        String FileName = "src/scores.txt";

        File file = new File(FileName);

        FileWriter writer = new FileWriter(file);

        PrintWriter pw = new PrintWriter(writer);


        Boolean gameHandler = true;
        while (gameHandler) {
            
            System.out.print("What is your name: ");
            String name = System.console().readLine();

            System.out.print("Do you want to play again? (Y/N) ");
            String GameQuit = System.console().readLine();

            // Exit game
            if (GameQuit.toUpperCase().equals("N")){
                gameHandler = false;
            }
        }

    }
}
