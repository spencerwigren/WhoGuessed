import java.io.IOException;

public class fileHandler {
    public static void readFile() throws IOException {
        System.out.println("IN readFile method");
    }


    public static void writeFile() throws IOException {
        System.out.println("IN writeFile method");
    }

    
    public static void main(int ReadWrite) throws IOException{
        switch (ReadWrite) {
            case 1:
                readFile();
                break;
            case 2:
                writeFile();
                break;
        }
    }
}