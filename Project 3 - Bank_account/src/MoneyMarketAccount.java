
/**
 * Objects of this class simulate a MoneyMarketAccount.
 * the "m_" seen in almost all the variable names, and some methods names in this
 * class, enable us to
 * easily distinguish them, from similar functionality methods and variables
 * that belong to bank account class
 * 
 * @author lmagak
 */

public class MoneyMarketAccount {
    /*
     * instance variables include the current balance of the account,
     * number of transactions and the name of the owner of the account
     */

    private double m_balance;
    private int m_noOftransactions;
    private String m_ownerName;

    /**
     * Here the instance variables are initilised.
     * Initial balance is set to zero
     * Number of transactions zero as well.
     * 
     * @param m_name name of the owner of the MoneyMarketAccount
     */
    public MoneyMarketAccount(String m_name) {
        m_balance = 0;
        m_noOftransactions = 0;
        m_ownerName = m_name;

    }

    /**
     * Constructs a bank account with a given balance
     * 
     * @param m_initialBalance the initial balance to be entered
     * 
     * @param m_name name of the owner of account.
     */

    public MoneyMarketAccount(String m_name, double m_initialBalance) {
        m_balance = m_initialBalance;
        m_noOftransactions = 0;
        m_ownerName = m_name;
    }

    /**
     * Deposits a given amount into the account.
     * 
     * @param m_amount the amount to be deposited
     */
    public void deposit(double m_amount) {
        m_balance = m_balance + m_amount;
        m_noOftransactions = m_noOftransactions + 1;

    }

    /**
     * Withdraws a given amount from the account.
     * 
     * @param m_amount the amount to withdraw
     * @param withdrawalCharge  deducts 5 dollars everytime withdraw method is called.
     */

    public void withdraw(double m_amount) {
        double withdrawalCharge = 5.0;
        m_balance = m_balance - (m_amount + withdrawalCharge);
        m_noOftransactions = m_noOftransactions + 1;
    }

    /**
     * Returns the current balance of the account.
     * 
     * @return m_balance: the current balance.
     */
    public double getm_Balance() {
        return m_balance;
    }

    /**
     * gets the number of transactions whenener invoked on an account
     * 
     * @return brings back the number of transactions for that partucular account
     */
    public int getm_noOftransactions() {
        return m_noOftransactions;
    }

    /**
     * applies interest of 4% to MoneyMaking accounts
     * (twice that of BankAccount)
     * @param m_rate locally stores the interest rate.
     */
    public void m_interest() {
        double m_Rate = BankAccount.rate * 2;
        m_balance = m_balance + (m_Rate * m_balance);
    }

    /**
     * @return brings back the name of any person who owns a MoneyMarketAccount
     */
    public String getm_AccountName() {
        return m_ownerName;

    }

    /**
     * enables transfer of money between MoneyMarketAccounts themseves and other
     * foreign accounts (BankAccounts)
     * 
     * @param m_transferAmount ammount to be transfered.
     * 
     * @param m_confirmedTransferAmount  locally stores the amount to be transfered. 
     * @return returns the locally stored amount to be transfered.
     */
    public double m_transfer(double m_transferAmount) {
        m_balance = m_balance - m_transferAmount;
        m_noOftransactions = m_noOftransactions + 1;
        double m_confirmedTransferAmount = m_transferAmount;
        return m_confirmedTransferAmount;
    }

}
