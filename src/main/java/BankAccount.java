import java.util.Random;

/**
 * Class implementing a bank account.
 * <p>
 * Complete and document this class as part of Lab 5.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/5/">Lab 5 Description</a>
 */
public class BankAccount {

    /*
     * You may want to use this to distinguish between different kinds of accounts.
     */
    public enum BankAccountType {
        CHECKINGS,
        SAVINGS,
        STUDENT,
        WORKPLACE
    }

    private int accountNumber;
    public BankAccountType accountType;
    private double accountBalance;
    private String ownerName;
    public double interestRate;
    private double interestEarned;

    public BankAccount(final String name, final BankAccountType accountCategory) {
        /*
         * Implement this function
         */
        ownerName = name;
        accountType = accountCategory;
    }

    /*
     * Implement getters and setters as appropriate for private variables.
     */
    public void setAccountNumber(int inAccountNumber) {
        accountNumber = inAccountNumber;
    }
    public void setAccountBalance(double inAccountBalance) {
        accountBalance = inAccountBalance;
    }
    public void setOwnerName(String inOwnerName) {
        ownerName = inOwnerName;
    }
    public void setInterestEarned(double inInterestEarned) {
        interestEarned = inInterestEarned;
    }

    public int getAccountNumber() {
        return accountNumber;
    }
    public double getAccountBalance() {
        return accountBalance;
    }
    public String getOwnerName() {
        return ownerName;
    }
    public double getInterestEarned() {
        return interestEarned;
    }
}
