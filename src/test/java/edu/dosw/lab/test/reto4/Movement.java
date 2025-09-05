package edu.dosw.lab.test.reto4;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

public class Movement {
    private String id;
    private LocalDateTime date;
    private double amount;
    public Movement(double amount) {
        this.date = LocalDateTime.now();
        this.amount = amount;
        this.id = UUID.randomUUID().toString();
    }

    public double getAmount() {
        return amount;
    }
}
