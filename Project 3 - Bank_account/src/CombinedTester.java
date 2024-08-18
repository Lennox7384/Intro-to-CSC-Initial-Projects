

/**
 * This will test the elements of both BankAccountClass and the MoneyMarketAccountClass.
 * @author lmagak
 */

public class CombinedTester {

    /**
     * The main method calls some methods of the BankAccount and MoneyMarketAccount classes
     * to see whether they are working properly.
     * @param args the command line arguments
     */

    public static void main(String[] args) {

        /**
         * Here we will test the creation of bank accounts.
         * Lets create 4 bank accounts; two with initial balance,
         * other two with zero balance.
         */

        // zero balance
        BankAccount lennoxAccount = new BankAccount("Lennox");
        BankAccount victorAccount = new BankAccount("Victor");

        // some initial balance
        BankAccount winnyAccount = new BankAccount("Winny", 500);
        BankAccount tonyAccount = new BankAccount("Tony", 900);

        /*
         * Testing deposits and withdrawals
         * to and from these accounts.
         * Balances and number of transactions should adjust accordingly
         */

        // deposits
        lennoxAccount.deposit(1370);
        winnyAccount.deposit(1600);

        victorAccount.deposit(760);
        tonyAccount.deposit(370);

        // check to see whether account balances get updated when deposits are made.
        System.out.println(lennoxAccount.getAccountName() + " has $" + lennoxAccount.getBalance());
        System.out.println("Lennox ought to have $1370");

        System.out.println(winnyAccount.getAccountName() + " has $" + winnyAccount.getBalance());
        System.out.println("Winny ought to have $2100");

        System.out.println(victorAccount.getAccountName() + " has $" + victorAccount.getBalance());
        System.out.println("Victor ought to have $760");

        System.out.println(tonyAccount.getAccountName() + " has $" + tonyAccount.getBalance());
        System.out.println("Tony ought to have $1270");


        /**
         * deposit method,getbalance method and getAccountName method
         * used above all appear to work as expected.
        */ 


        // withdrawals
        lennoxAccount.withdraw(482);
        winnyAccount.withdraw(369);

        victorAccount.withdraw(420);
        tonyAccount.withdraw(82);

        // check to see whether account balances get updated when withdrawals are made.
        System.out.println(lennoxAccount.getAccountName() + " has $" + lennoxAccount.getBalance());
        System.out.println("Lennox ought to have $888");

        System.out.println(winnyAccount.getAccountName() + " has $" + winnyAccount.getBalance());
        System.out.println("Winny ought to have $1731");

        System.out.println(victorAccount.getAccountName() + " has $" + victorAccount.getBalance());
        System.out.println("Victor ought to have $340");

        System.out.println(tonyAccount.getAccountName() + " has $" + tonyAccount.getBalance());
        System.out.println("Tony ought to have $1188");


        // Number of transactions check for Tonny
        System.out.println(
                tonyAccount.getAccountName() + " has made " + tonyAccount.getnoOftransactions() + " transactions only");
        System.out.println("Tonny should have 2 transactions, the deposit and the withdrawal");

        /**
         * Interest addition test. Remember the default interest here is 2%,
         * does it work?
         */

        winnyAccount.interest();
        double winnysNewBalance = winnyAccount.getBalance();
        System.out.println(winnysNewBalance);
        System.out.println("balance above should be 1765.62");

        /**
         * Money transfer from one bank account to another.
         * Lennox to Winny in this case.
         * We will still continue to check whether balances
         * and number of transactions adjust accordingly.
         */

        winnyAccount.deposit(lennoxAccount.transfer(360));



        System.out.println(winnyAccount.getAccountName() + " has made " + winnyAccount.getnoOftransactions()
                + " transactions only");
        System.out.println(
                "Winny should have 3 transactions, the deposit, the withdrawal, and the just received from Lennox");

        System.out.println(lennoxAccount.getAccountName() + " has made " + lennoxAccount.getnoOftransactions()
                + " transactions only");
        System.out.println("Lennox should have 3 transactions, the deposit, the withdrawal and the just sent to Winny");




        // what about their balances. Winny should have increament. Lennox Should have
        // reduction.
        System.out.println(lennoxAccount.getAccountName() + " has $" + lennoxAccount.getBalance());
        System.out.println("Lennox ought to have $528");

        System.out.println(winnyAccount.getAccountName() + " has $" + winnyAccount.getBalance());
        System.out.println("Winny ought to have $2125");

        

        // now lets turn to MoneyMarketAccounts and test the same.

        /**most varibales and methods used here have a distinctive "m_"
        as part of their name to help differentiate them from their BankAccount counterparts
        */


        /**
         * We will test the creation of MoneyMarketAccounts first.
         * Lets create 4 accounts; two with initial balance,
         * other two with zero balance.
         */

        // zero balance
        MoneyMarketAccount andrewAccount = new MoneyMarketAccount("Andrew");
        MoneyMarketAccount moriceAccount = new MoneyMarketAccount("Morice");

        // some initial balance
        MoneyMarketAccount lenardAccount = new MoneyMarketAccount("Lenard", 3000);
        MoneyMarketAccount smithAccount = new MoneyMarketAccount("Smith", 9000);

        /*
         * Testing deposits and withdrawals
         * to and from these accounts
         */

        // deposits
        andrewAccount.deposit(4370);
        moriceAccount.deposit(3600);

        lenardAccount.deposit(960);
        smithAccount.deposit(3870);

        // check to see whether account balances get updated when deposits are made.
        System.out.println(andrewAccount.getm_AccountName() + " has $" + andrewAccount.getm_Balance());
        System.out.println("Andrew ought to have $4370");

        System.out.println(moriceAccount.getm_AccountName() + " has $" + moriceAccount.getm_Balance());
        System.out.println("morice ought to have $3600");

        System.out.println(lenardAccount.getm_AccountName() + " has $" + lenardAccount.getm_Balance());
        System.out.println("Lenard ought to have $3960");

        System.out.println(smithAccount.getm_AccountName() + " has $" + smithAccount.getm_Balance());
        System.out.println("Smith ought to have $12870");

        // deposit method,getbalance method and getAccountName method used above all
        // work correctly

        // withdrawals
        andrewAccount.withdraw(450);
        moriceAccount.withdraw(300);

        lenardAccount.withdraw(500);
        smithAccount.withdraw(80);

        // check to see whether account balances get updated when withdrawals are made.
        // (remember the withdrawal fee of $5 which must be carefully considered)

        System.out.println(andrewAccount.getm_AccountName() + " has $" + andrewAccount.getm_Balance());
        System.out.println("Andrew ought to have $3915");

        System.out.println(moriceAccount.getm_AccountName() + " has $" + moriceAccount.getm_Balance());
        System.out.println("Morice ought to have $3295");

        System.out.println(lenardAccount.getm_AccountName() + " has $" + lenardAccount.getm_Balance());
        System.out.println("lenard ought to have $3455");

        System.out.println(smithAccount.getm_AccountName() + " has $" + smithAccount.getm_Balance());
        System.out.println("Smith ought to have $12785");


        // Number of transactions check for Smith
        System.out.println(smithAccount.getm_AccountName() + " has made " + smithAccount.getm_noOftransactions()
                + " transactions only");
        System.out.println("Smith should have 2 transactions, the deposit and the withdrawal");

        /**
         * Interest addition test. Remember the default interest here is twice that of bank account
         */

        moriceAccount.m_interest(); // this method adds twice the default 2% interest to Morice's account (so that's
                                    // 4%)
        double moricesNewBalance = moriceAccount.getm_Balance();
        System.out.println(moricesNewBalance);
        System.out.println("balance above should be 3426.8");


        /**
         * Money transfer from one MoneyMarketAcoount to another
         * Andrew to Morice in this case. Process starts below.
         */


        moriceAccount.deposit(andrewAccount.m_transfer(360));

        /**
         * above, 360 dollars is transfered from andrews account to morice account.
         * morice account is credited(notice deposit method) while andrew's account is
         * debited by the same ammount
         */


        /** lets check whether both accounts are actually credited and debited respectively
         * Both should record increase in transactions by 1 and adjust balances accordingly.
         */ 
        System.out.println(moriceAccount.getm_AccountName() + " has made " + moriceAccount.getm_noOftransactions()
                + " transactions only");
        System.out.println(
                "Morice should have 3 transactions, the deposit, the withdrawal and the just received from Andrew");

        System.out.println(andrewAccount.getm_AccountName() + " has made " + andrewAccount.getm_noOftransactions()
                + " transactions only");
        System.out
                .println("Andrew should have 3 transactions, the deposit, the withdrawal and the just sent to Morice");


        // Do the balances adjust accordingly? lets see.
        System.out.println(andrewAccount.getm_AccountName() + " has $" + andrewAccount.getm_Balance());
        System.out.println("Andrew ought to have $3555");

        System.out.println(moriceAccount.getm_AccountName() + " has $" + moriceAccount.getm_Balance());
        System.out.println("morice ought to have $3786.8");



        /**
         * Here we'll attempt to transfer money from MoneyMarketAcccount to a
         * BankAccount
         * as directed by the question.
         * We will move money from Lenards account to Victor's account.
         * both balances and number of transactions should be affected as expected
         */

        victorAccount.deposit(lenardAccount.m_transfer(200));

        System.out.println(victorAccount.getAccountName() + " has $" + victorAccount.getBalance());
        System.out.println("Victor ought to have $540");

        System.out.println(lenardAccount.getm_AccountName() + " has $" + lenardAccount.getm_Balance());
        System.out.println("lenard ought to have $3255");

        System.out.println(lenardAccount.getm_AccountName() + " has made " + lenardAccount.getm_noOftransactions()
                + " transactions only");
        System.out.println(
                "Lenard should have 3 transactions, the deposit, the withdrawal and the just sent from Victor");

        System.out.println(victorAccount.getAccountName() + " has made " + victorAccount.getnoOftransactions()
                + " transactions only");
        System.out.println(
                "Victor should have 3 transactions, the deposit, the withdrawal and the just received from Lenard");

    }

    






}
