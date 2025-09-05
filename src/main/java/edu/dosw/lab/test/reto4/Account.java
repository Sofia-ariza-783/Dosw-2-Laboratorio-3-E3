package edu.dosw.lab.test.reto4;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a bank account associated with a user.
 * Allows managing the balance and recording financial movements.
 */
public class Account {
    private User user;
    private String id;
    private double balance;
    private List<Movement> movements;

    /**
     * Constructs an Account instance.
     *
     * @param user The user who owns the account.
     * @param id Unique identifier for the account.
     */
    public Account(User user, String id) {
        this.id = id;
        this.user = user;
        this.balance = 0;
        this.movements = new ArrayList<>();
        this.user.addAccount(this);
    }

    /**
     * Adds money to the account and records the movement.
     *
     * @param money Amount to be added to the balance.
     */
    public void addMoney(double money){
        this.balance += money;
        movements.add(new Movement(money));
    }

    /**
     * Returns the current balance of the account.
     *
     * @return Available balance.
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Returns the unique identifier of the account.
     *
     * @return Account ID.
     */
    public String getId() {
        return id;
    }
}
