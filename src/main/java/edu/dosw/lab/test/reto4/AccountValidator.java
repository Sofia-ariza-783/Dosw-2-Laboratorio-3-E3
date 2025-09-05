package edu.dosw.lab.test.reto4;

import java.util.Arrays;

/**
 * Class responsible for validating whether a bank account meets the required criteria.
 * Checks that the account ID has the correct format and belongs to an authorized bank.
 */
public class AccountValidator {
    public static final String[] AVAILABLE_BANKS = {Bank.BANCOLOMBIA, Bank.DAVIVIENDA};

    /**
     * Validates whether an account is valid based on its length and issuing bank.
     *
     * @param account ID of the account to validate.
     * @return true if the account is valid, false otherwise.
     */
    public static boolean isValidAccount(String account) {
        if (account.length() != 10) {
            return false;
        }
        return Arrays.stream(AVAILABLE_BANKS).anyMatch(account::startsWith);
    }
}
