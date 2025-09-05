package edu.dosw.lab.test.reto4;

import java.util.Arrays;

public class AccountValidator {
    public static final String[] AVAILABLE_BANKS = {Bank.BANCOLOMBIA, Bank.DAVIVIENDA};
    public static boolean isValidAccount(String account) {
        if (account.length() != 10) {
            return false;
        }
        return Arrays.stream(AVAILABLE_BANKS).anyMatch(account::startsWith);
    }
}
