import java.util.Scanner;

 class ATM {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int  balance = 1000;

        while (true) {
            System.out.println("\n1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Choose: ");
            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.println("Balance: " + balance);
            }
            else if (choice == 2) {
                System.out.print("Enter amount: ");
                double amt = sc.nextDouble();
                balance += amt;
                System.out.println("Money Deposited!");
            }
            else if (choice == 3) {
                System.out.print("Enter amount: ");
                double amt = sc.nextDouble();
                if (amt > balance) {
                    System.out.println("Not enough balance!");
                } else {
                    balance -= amt;
                    System.out.println("Money Withdrawn!");
                }
            }
            else if (choice == 4) {
                System.out.println("Thank you!");
                break;
            }
            else {
                System.out.println("Invalid option!");
            }
        }

       
    }
}
 
