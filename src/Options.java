import com.sun.tools.javah.Util;

public class Options {
    String choice1;
    int balance = 100;
    String withdraw;

    void makeSelection() {
        System.out.println("Please select an option below.");
        System.out.println("1: Check balance");
        System.out.println("2: Make withdrawal");
        System.out.println("3: Cancel");
        choice1 = ATM.scanner.nextLine();
        if(choice1.equalsIgnoreCase("1")) {
            checkBalance();
        }
        else if(choice1.equalsIgnoreCase("2")) {
            makeWithdrawal();
        }
        else if(choice1.equalsIgnoreCase("3")) {
            cancel();
        }
        else {
            System.out.println("You had 3 options...why you do this to me!!!!");
            makeSelection();
            //throw new Exception("djsalkfhasjlfdlsjdlfjasdlfj;");
        }

    }

    void checkBalance() {
        System.out.println("Your balance is: " + "$"+ balance);
        if(balance < 50) {
            System.out.println("That's a bummer...");
        }
    }

    void makeWithdrawal() {
        System.out.println("How much would you like to withdrawal?");
        withdraw = ATM.scanner.nextLine();
        if (Integer.parseInt(withdraw) > 100) {
            System.out.println("Withdrawal exceeds your balance, please select a different amount");
            makeWithdrawal();
           // throw new Exception("Withdrawal exceeds your balance, cannot complete the transaction");
        } else {
            System.out.println("Please take your money.");
            balance -= Integer.parseInt(withdraw);
            System.out.println("Your new balance is: $" + balance);

        }
    }

    void cancel() {
        System.out.println("Thank you and please come again!");
        System.exit(0);
    }

}
