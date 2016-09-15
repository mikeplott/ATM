import com.sun.tools.javah.Util;

public class Options {
    String choice1;
    int withdraw;

    User user = new User();
    void makeSelection() {
        System.out.println("Please select an option below.");
        System.out.println("1: Check balance");
        System.out.println("2: Make withdrawal");
        System.out.println("3: Logout");
        System.out.println("4: Quit");
        choice1 = ATM.scanner.nextLine();
        if(choice1.equalsIgnoreCase("1")) {
            checkBalance();
        }
        else if(choice1.equalsIgnoreCase("2")) {
            makeWithdrawal();
        }
        else if(choice1.equalsIgnoreCase("3")) {
            logOut();
        }
        else if(choice1.equals("4")) {
            cancel();
        }
        else {
            System.out.println("You had 3 options...why you do this to me!!!!");
            makeSelection();
            //throw new Exception("djsalkfhasjlfdlsjdlfjasdlfj;");
        }

    }

    void checkBalance() {
        System.out.println("Your balance is: " + "$"+ User.balance);
        if(User.balance < 50) {
            System.out.println("That's a bummer...");
        }
        transactionMessage();
    }

    void makeWithdrawal() {
        System.out.println("How much would you like to withdrawal?");
        withdraw = ATM.scanner.nextInt();
        if (withdraw > 100) {
            System.out.println("Withdrawal exceeds your balance, please select a different amount");
            makeWithdrawal();
           // throw new Exception("Withdrawal exceeds your balance, cannot complete the transaction");
        } else {
            System.out.println("Please take your money.");
            int x = User.balance - withdraw;
            User.balance = x;
            System.out.println("Your new balance is: $" + User.balance);
            transactionMessage();
            ATM.scanner.nextLine();

        }
    }
    void logOut() {
        System.out.println("Welcome to the ATM!");
        user.userRegistration();
        System.out.println("Please enter your username");
        user.userValidation();
        System.out.println("Please enter your password");
        user.passValidation();
    }

    void cancel() {
        System.out.println("Thank you and please come again!");
        System.exit(0);
    }
    void transactionMessage() {
        System.out.println("Transaction complete!");
        System.out.println("Another transaction? type y or n");
        ATM.scanner.nextLine();

    }

}
