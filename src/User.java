/**
 * Created by michaelplott on 9/14/16.
 */
public class User {
    String name;

    void namePrompt() throws Exception {

        System.out.println("Please enter your name.");
        name = ATM.scanner.nextLine();
        System.out.println("Welcome " + name + "!");
        if(name.equals("")) {
            throw new Exception("Unknown user shutting down.");
        }
    }





}
