package edu.dosw.lab.test.reto4;

import java.util.*;
import java.util.stream.Collectors;

public class AccountManager {
    private Map<String,Account> accounts;
    public AccountManager() {
        accounts = new HashMap<>();
    }
    public Account createAccount(User user, String bankId){
        String id = "";
        while (id.isBlank() || !accounts.containsKey(id)){
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

    public double getBalance(String accountId){
        if (accounts.containsKey(accountId)){
            return  accounts.get(accountId).getBalance();
        }
        else{
            System.out.println("Invalid account");
            return 0;
        }
    }

    public void makeDeposit(String accountId){

    }

    public Map<String,Account> getAccounts(){
        return accounts;
    }
}
