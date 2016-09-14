import java.util.Scanner;

/**
 * Created by michaelplott on 9/14/16.
 */
public class ATM {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        boolean stillRun = true;

        //Welcome message and name prompt.
        System.out.println("Welcome to the ATM!");
        User user = new User();
        user.namePrompt();
        while (stillRun) {
            Options options = new Options();
            options.makeSelection();
            System.out.println("Transaction complete!");
            System.out.println("Another transaction? type y or n");
            String myChoice = scanner.nextLine();
            if (myChoice.equalsIgnoreCase("n")) {
                stillRun = false;
            }
            System.out.println("Have a nice day!");
        }
    }
}
