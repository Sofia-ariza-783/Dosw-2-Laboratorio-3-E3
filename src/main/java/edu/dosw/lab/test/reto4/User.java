package edu.dosw.lab.test.reto4;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;

public class User {
    private String id;
    private Map<String, Account> accounts;

    public User() {
        id = id = new Random()
                .ints(8, 0, 10)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining());;
        accounts = new HashMap<>();
    }

    public String getId() {
        return id;
    }

    public void addAccount(Account account) {
        accounts.put(account.getId(), account);
    }
}
