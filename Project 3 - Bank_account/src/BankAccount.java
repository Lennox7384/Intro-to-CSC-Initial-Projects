/**
 * Objects of this class simulate a bank account.
 * 
 * @author lmagak
 */
public class BankAccount {
    /*
     * instance variables here include the balance, number of transactions,
     * and the name of the owner of the account.
     * Essentially, each account must have these three things, balance, transactions
     * and
     * an owner with a name. Zero balance and Zero transactions still perfectly
     * count.
     */

    private double balance;
    private int noOftransactions;
    private String ownerName;

    /**
     * @param rate declares default rate for the class BankAccount
     */
    public static double rate = 0.02; // the variable belongs to the class.

    /**
     * Constructs a bank account and gets the instance variables initialised.
     * 
     * @param name the name of the person who owns the
     *             BankAccount just about to be constructed
     */
    public BankAccount(String name) {
        balance = 0;
        noOftransactions = 0;
        ownerName = name;
    }

    /**
     * Constructs a bank account with a given balance
     * 
     * @param initialBalance the initial balance
     */
    public BankAccount(String name, double initialBalance) {
        balance = initialBalance;
        noOftransactions = 0;
        ownerName = name;
    }

    /**
     * Deposits a given amount into the account.
     * 
     * @param amount the amount to be deposited
     */
    public void deposit(double amount) {
        balance = balance + amount;
        noOftransactions = noOftransactions + 1;

    }

    /**
     * Withdraws a given amount from the account.
     * 
     * @param amount the amount to withdraw
     */
    public void withdraw(double amount) {
        balance = balance - amount;
        noOftransactions = noOftransactions + 1;
    }

    /**
     * Returns the current balance of the account.
     * 
     * @return balance: the current balance
     */

    public double getBalance() {
        return balance;
    }

    /**
     * returns the number of transactions so far
     * 
     * @return the current number of trnsactions on an account
     */
    public int getnoOftransactions() {
        return noOftransactions;
    }

    /**
     * adds default interest rate to an account when invoked
     */
    public void interest() {

        balance = balance + (rate * balance);
    }

    /**
     * retuns the decleared name of the account owner
     * 
     * @return the name of the owner of the account
     */
    public String getAccountName() {
        return ownerName;

    }

    /**
     * enables money to be transfered between accounts when invoked
     * 
     * @param transferAmount the ammount to be transfered in dollars
     * @param amountsent     local variable storing the transfer amount
     * @return method returns the amount sent when invoked
     */
    public double transfer(double transferAmount) {
        balance = balance - transferAmount;
        noOftransactions = noOftransactions + 1;
        double amountsent = transferAmount;
        return amountsent;
    }

}
