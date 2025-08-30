package edu.dosw.lab.test.reto4;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Movement {
    private String id;
    private LocalDateTime date;
    private double amount;
    public Movement() {
        this.date = LocalDateTime.now();
        this.amount = 0;
    }

    public double getAmount() {
        return amount;
    }
}
