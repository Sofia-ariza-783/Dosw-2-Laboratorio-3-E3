package edu.dosw.lab.test.reto4;

import java.time.LocalDateTime;
import java.util.UUID;

/**
 * Represents a financial transaction within an account.
 * Each movement has a unique identifier, a creation date, and an associated amount.
 */
public class Movement {
    private String id;
    private LocalDateTime date;
    private double amount;

    /**
     * Creates a new movement with the specified amount.
     * Automatically assigns the current date and a unique ID.
     *
     * @param amount Amount of the movement (positive for deposits, negative for withdrawals).
     */
    public Movement(double amount) {
        this.date = LocalDateTime.now();
        this.amount = amount;
        this.id = UUID.randomUUID().toString();
    }

    /**
     * Returns the amount associated with the movement.
     *
     * @return Movement amount.
     */
    public double getAmount() {
        return amount;
    }
}
