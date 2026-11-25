import java.util.Scanner;

public class BankApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Bank Name: ");
        String bankName = sc.nextLine();

        System.out.print("Enter User ID: ");
        int userId = sc.nextInt();
        sc.nextLine(); // Consume leftover newline

        System.out.print("Enter User Name: ");
        String userName = sc.nextLine();

        System.out.print("Enter Account Number: ");
        long accountNumber = sc.nextLong();
        sc.nextLine(); // Consume leftover newline

        System.out.print("Enter Account Type: ");
        String accountType = sc.nextLine();

        System.out.print("Enter Balance: ");
        double balance = sc.nextDouble();

        Bank b1 = new Bank(bankName, userId, userName, accountNumber, accountType, balance);

        System.out.println("\n--- Details ---");
        b1.displayBankDetails();
        b1.displayUserDetails();
        b1.displayAccountDetails();

        String accountSummary = b1.createAccountSummary();
        System.out.println("\nAccount Summary:\n" + accountSummary);

        System.out.print("\nEnter Minimum Balance: ");
        double minimumBalance = sc.nextDouble();

        // Fixed typo: hasMinumumBalance -> hasMinimumBalance
        boolean isMinimumMaintained = b1.hasMinimumBalance(minimumBalance);

        if (isMinimumMaintained) {
            System.out.println("Minimum Balance is maintained");
        } else {
            System.out.println("Minimum Balance is not maintained");
        }

        sc.close();
    }
}
