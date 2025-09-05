package edu.dosw.lab.test.reto4;

public class Bankify {
    private AccountManager accountManager = new AccountManager();
    public Account createAccount(User user, String bankId){
        return accountManager.createAccount(user, bankId);
    }

    public double checkBalance(String accountId){
        return  accountManager.getBalance(accountId);
    }

    public void makeDeposit(String accountId, double amount){
        accountManager.makeDeposit(accountId, amount );
    }
}
