package edu.dosw.lab.test.reto4;

/**
 * Main class that exposes basic functionalities of the banking system.
 * Acts as a facade to interact with the account manager.
 */
public class Bankify {

    /**
     * Instance of the account manager that handles internal logic.
     */
    private final AccountManager accountManager = new AccountManager();

    /**
     * Creates a new account for the specified user in the given bank.
     *
     * @param user User to whom the account will be assigned.
     * @param bankId Bank identifier (e.g., "01" for Bancolombia).
     * @return The created account if successful, or null if it fails.
     */
    public Account createAccount(User user, String bankId){
        return accountManager.createAccount(user, bankId);
    }

    /**
     * Checks the available balance of a specific account.
     *
     * @param accountId ID of the account to check.
     * @return Current balance of the account.
     */
    public double checkBalance(String accountId){
        return  accountManager.getBalance(accountId);
    }

    /**
     * Makes a deposit into the specified account, validating the amount.
     *
     * @param accountId ID of the destination account.
     * @param amount Amount to deposit.
     */
    public void makeDeposit(String accountId, double amount){
        accountManager.makeDeposit(accountId, amount );
    }
}
