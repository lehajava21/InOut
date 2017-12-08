import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class InOut {

    public static final String EXIT = "-1";
    public static AtomicInteger version = new AtomicInteger(0);
    public static String fileName = "";

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        while (true){
            if(fileName.isEmpty()){
                System.out.println("Input file name or '-1' to exit:");
            }else {
                System.out.println("Input text or '-1' to exit:");
            }
            String inp = scanner.nextLine();
            if(inp.equals(EXIT)){
                return;
            }
            if(inp.isEmpty() && fileName.isEmpty()){
                continue;
            }
            if(fileName.isEmpty() && !inp.isEmpty()){
                fileName = inp;
                continue;
            }
            if(!fileName.isEmpty()){
                new NewFile(inp);
            }
        }
    }

}
