package edu.dosw.lab.test.reto4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

public class TestBankify {
    private String validAccount;
    private Bankify bankify;
    private int user;
    private String bank;

    @BeforeEach
    public void setUp() {
        Random rand = new Random();
        validAccount = "01"+ rand.nextInt(10000000,99999999);
        user = 100100654;
        bank = "Bancolombia";
    }

    @Test
    public void testIsValidAccountShouldValidateAValidAccount(){
        assertTrue(bankify.isValidAccount(validAccount));
    }

    @Test
    public void testIsValidAccountShouldNotValidateAnInvalidAccountWhenBankDoesNotExist(){
        String invalidAccount = "9910101010";
        assertFalse(bankify.isValidAccount(invalidAccount));
    }

    @Test
    public void testIsValidAccountShouldNotValidateAnInvalidAccountWhenAccountLengthDoesNotMatch(){
        String invalidAccount = "011010";
        assertFalse(bankify.isValidAccount(invalidAccount));
    }

    @Test
    public void testCreateAccountShouldGenerateAValidAccountNumberAccordingToTheBank(){
        String account = bankify.createAccount(user,bank);

        assertTrue(bankify.isValidAccount(account));
    }

    @Test
    public void testCreateAccountShouldNotGenerateAnyAccountWhenBankDoesNotExist(){
        String bank = "InvalidBank";
        String account = bankify.createAccount(user,bank);
        assertTrue(account == null);
    }

    @Test
    public void testDepositMoneyShouldDepositMoneyInAccount(){
        String account = bankify.CreateAccount(user, bank);
        bankify.depositMoney(account, 1000);

        assertEquals(1000, bankify.getAccountBalance(account));
    }

    @Test
    public void testDepositMoneyShouldNotDepositMoneyInAccountWhenAccountDoesNotExist() {
        String account = "InvalidAccount";
        bankify.depositMoney(account, 1000);

    }





}
