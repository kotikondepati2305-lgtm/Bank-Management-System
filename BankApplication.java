
import java.util.Scanner;

public class BankApplication {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Bank Name: ");
        String bankName = sc.nextLine();
        System.out.println("Enter User ID: ");
        int userId = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter User Name: ");
        String userName = sc.nextLine();
        System.out.println("Enter Account Number: ");
        long accountNumber = sc.nextLong();
        sc.nextLine();
        System.out.println("Enter Account Type: ");
        String accountType = sc.nextLine();
        System.out.println("Enter Balance: ");
        double balance = sc.nextDouble();

        Bank b1 = new Bank(bankName, userId, userName, accountNumber, accountType, balance);
        b1.displayBankDetails();
        b1.displayUserDetails();
        b1.displayAccountDetails();
        String account = b1.createAccountSummary();
        System.out.println("Account Summary:\n " + account);
        System.out.println("Enter Minimum Balance: ");
        double minimumBalance = sc.nextDouble();
        boolean MinimumBalance = b1.hasMinumumBalance(minimumBalance);
        if (MinimumBalance == true) {
            System.out.println("Minimum Balance is maintained");
        } else {
            System.out.println("Minimum Balance is not maintained");
        }
        sc.close();

    }
}
