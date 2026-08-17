
public class Bank {

    String bankName;
    int userId;
    String userName;
    long accountNumber;
    String accountType;
    double balance;

    Bank(String bankName, int userId, String userName, long accountNumber, String accountType, double balance) {

        this.bankName = bankName;
        this.userId = userId;
        this.userName = userName;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = balance;
    }

    void displayBankDetails() {
        System.out.println("Bank name: " + bankName);
    }

    void displayUserDetails() {
        System.out.println("User ID: " + userId);
        System.out.println("User Name: " + userName);
    }

    void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Type: " + accountType);
        System.out.println("Current Balance: " + balance);
    }

    String createAccountSummary() {
        String accountSummary = "Bank Name: " + bankName + "\nUser Name: " + userName + "\nAccount Number: " + accountNumber
                + "\nAccount Type: " + accountType + "\nCurrent Balance: " + balance;
        return accountSummary;
    }

    boolean hasMinumumBalance(double minimumBalance) {
        boolean result = false;
        if (balance >= minimumBalance) {
            result = true;
        }
        return result;
    }

}
