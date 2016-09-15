import java.util.Scanner;

/**
 * Created by michaelplott on 9/14/16.
 */
public class ATM {

    static Scanner scanner = new Scanner(System.in);
    static String userName;
    static String password;

    public static void main(String[] args) throws Exception {


        //Welcome message and name prompt.
        System.out.println("Welcome to the ATM!");
        User user = new User();
        user.userRegistration();
        System.out.println("Please enter your username");
        user.userValidation();
        System.out.println("Please enter your password.");
        user.passValidation();
        System.out.println(User.users);
        System.out.println(User.pass);
            //System.out.println(User.users);
            //User user = new User();
            //user.name = scanner.nextLine();
            //System.out.println("Please enter your username");
            //uName = scanner.nextLine();
            boolean stillRun = true;
            while (stillRun) {
                Options options = new Options();
                options.makeSelection();

            }

        System.out.println("Have a nice day!");
//        String userName = scanner.nextLine();
//        user.name = userName;
//        User.users.get(user.name);
//            if (User.users.get(user.name) == null) {
//                System.out.println("Username does not exist would you like to register? enter y or n");
//                if (scanner.nextLine().equalsIgnoreCase("n")) {
//                    System.out.println("Have a nice day!");
//                    System.exit(0);
//                } else {
//                    User.users.put("1", user.name);
//                    System.out.println(user.name + " Registered!");
//                    System.out.println("Now please enter your password.");
//                    user.passWord = scanner.nextLine();
//                    User.pass.put("1", user.passWord);
//                    System.out.println(User.users);
//                    System.out.println(User.pass);
//                }
//            }
//        System.out.println("Please enter username");
//        user.name = scanner.nextLine();
//        User.users.get(user.name);
//            if (User.users.get(user.name) != null) {
//                System.out.println("Unknown user.");
//                System.exit(0);
//            }
//        System.out.println("Please enter password");
//        user.passWord = scanner.nextLine();
//        User.users.get(user.passWord);
//            if (User.users.get(user.passWord) != null) {
//                System.out.println("Incorrect password");
//            }
//        //User user = new User();
//        user.name = userName;
//        System.out.println("Welcome " + user.name);
        }
    }


