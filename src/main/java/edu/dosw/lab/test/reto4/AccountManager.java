package edu.dosw.lab.test.reto4;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Class responsible for managing multiple bank accounts.
 * Allows creating accounts, checking balances, making deposits,
 * and accessing the collection of registered accounts.
 */
public class AccountManager {
    private Map<String,Account> accounts;

    /**
     * Constructor that initializes the account manager with an empty map.
     */
    public AccountManager() {
        accounts = new HashMap<>();
    }

    /**
     * Creates a new account for a user, generating a unique ID
     * based on the bank identifier. Validates the ID before registering the account.
     *
     * @param user The user to whom the account will be assigned.
     * @param bankId Bank identifier used as a prefix for the account ID.
     * @return The created account if the ID is valid, or null otherwise.
     */
    public Account createAccount(User user, String bankId){
        String id = "";
        while (id.isEmpty() || accounts.containsKey(id)){
            id = bankId + new Random()
                    .ints(8, 0, 10)
                    .mapToObj(String::valueOf)
                    .collect(Collectors.joining());
        }

        if(AccountValidator.isValidAccount(id))
        {
            Account newAccount = new  Account(user, id);
            accounts.put(newAccount.getId(), newAccount);
            return newAccount;
        }
        else{
            System.out.println("Invalid bank");
            return null;
        }
    }

    /**
     * Retrieves the balance of a specific account.
     *
     * @param accountId ID of the account to check.
     * @return The current balance if the account exists, or 0 if it's invalid.
     */
    public double getBalance(String accountId){
        if (accounts.containsKey(accountId)){
            return  accounts.get(accountId).getBalance();
        }
        else{
            System.out.println("Invalid account");
            return 0;
        }
    }

    /**
     * Makes a deposit into an existing account, validating the amount.
     *
     * @param accountId ID of the destination account.
     * @param amount Amount to deposit.
     */
    public void makeDeposit(String accountId,  double amount){
        if (amount<=0){
            System.out.println("Invalid amount");
            return;
        }

        if(accounts.containsKey(accountId)){
            accounts.get(accountId).addMoney(amount);
        }
        else{
            System.out.println("Invalid account");
        }
    }

    /**
     * Returns the complete map of managed accounts.
     *
     * @return Map with account IDs as keys and Account objects as values.
     */
    public Map<String,Account> getAccounts(){
        return accounts;
    }
}
