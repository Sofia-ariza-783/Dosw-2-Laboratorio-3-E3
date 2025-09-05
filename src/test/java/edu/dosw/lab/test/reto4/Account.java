package edu.dosw.lab.test.reto4;

import java.util.ArrayList;
import java.util.List;

public class Account {
    private User user;
    private String id;
    private double balance;
    private List<Movement> movements;
    public Account(User user, String id) {
        this.id = id;
        this.user = user;
        this.balance = 0;
        this.movements = new ArrayList<>();
        this.user.addAccount(this);
    }

    public void addMoney(double money){
        this.balance += money;
        movements.add(new Movement(money));
    }

    public double getBalance() {
        return balance;
    }

    public String getId() {
        return id;
    }
}
