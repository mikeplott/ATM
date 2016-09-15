import java.util.HashMap;

/**
 * Created by michaelplott on 9/14/16.
 */
public class User {
    String name;
    String passWord;
    static int balance = 100;
    static HashMap<String, Object> users = new HashMap<>();
    static HashMap<String, Object> pass = new HashMap<>();

    String getName() {
        return name;
    }
    void userRegistration() {
        System.out.println("Please enter your username");
        name = ATM.scanner.nextLine();
        if (name.equalsIgnoreCase("")) {
            System.out.println("Invalid username");
            userRegistration();
        }
        if (User.users.get(name) == null) {
            System.out.println("Username does not exist, would you like to register? Press y or n");
            String choice = ATM.scanner.nextLine();
            if (choice.equalsIgnoreCase("y")) {
                System.out.println("Username registered successfully!");
                //ATM.userName = name;
                System.out.println("Enter a password for your account.");
                passWord = ATM.scanner.nextLine();
                //ATM.password = pWord;
                User user = new User();
                //user.name = ATM.userName;
                //user.passWord = pWord;
                User.users.put(name, user);
                User.pass.put(passWord, user);
            } else {
                System.out.println("Have a nice day!");
                System.exit(0);
            }
        }
    }

    void userValidation() {
        // System.out.println("Please enter your username.");
        name = ATM.scanner.nextLine();
        if (User.users.get(name) == null) {
            System.out.println("Username incorrect.");
            System.out.println("Please try again.");
            userValidation();
        }
    }

    void passValidation() {
        //System.out.println("Please enter your password.");
        passWord = ATM.scanner.nextLine();
        if (User.pass.get(passWord) != null) {
            System.out.println("Welcome " + name + "!");
        } else {
            System.out.println("Password incorrect...");
            System.out.println("Please try again.");
            passValidation();
        }
    }
}




    /*
    void checkUserName() throws Exception {

        //System.out.println("Please enter your name.");
        //name = ATM.userName;
       // users.get(name);
//        if(name == null) {
//            users.put(name, user);
//            System.out.println(users);
//
//        }



        System.out.println("Welcome " + name + "!");
       // if(name.equals("")) {
         //   throw new Exception("Unknown user shutting down.");
        }
    }
*/
