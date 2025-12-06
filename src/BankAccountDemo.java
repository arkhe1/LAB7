import java.util.Scanner;

public class BankAccountDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        BankAccount a1 = new BankAccount("A1001", 500);
        BankAccount a2 = new BankAccount("A2001", 1000);

        int choice = 0;

        while(choice != 4) {
            System.out.println("\n--- Banking Menu ---");
            System.out.println("1 -> Deposit");
            System.out.println("2 -> Withdraw");
            System.out.println("3 -> Account Details");
            System.out.println("4 -> Exit");
            System.out.print("Choice: ");
            choice = sc.nextInt();

            if(choice == 1) {
                System.out.print("Select account (1 or 2): ");
                int acc = sc.nextInt();

                System.out.print("Amount: ");
                double amount = sc.nextDouble();

                if(acc == 1) a1.deposit(amount);
                else if(acc == 2) a2.deposit(amount);

            } else if(choice == 2) {
                System.out.print("Select account (1 or 2): ");
                int acc = sc.nextInt();

                System.out.print("Amount: ");
                double amount = sc.nextDouble();

                if(acc == 1) a1.withdraw(amount);
                else if(acc == 2) a2.withdraw(amount);

            } else if(choice == 3) {
                System.out.print("Select account (1 or 2): ");
                int acc = sc.nextInt();

                if(acc == 1) a1.accountDetails();
                else if(acc == 2) a2.accountDetails();
            }
        }

        System.out.println("\n--- Change Account ID ---");
        System.out.println("Old ID: " + a1.getAccountID());
        a1.setAccountID("NEW123");
        System.out.println("New ID: " + a1.getAccountID());
    }
}
