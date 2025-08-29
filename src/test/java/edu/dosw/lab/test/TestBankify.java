package edu.dosw.lab.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestBankify {
    private String validAccount;
    private Bankify bankify;
    @BeforeEach
    public void setUp() {
        Random rand = new Random();
        validAccount = "01"+ rand.nextInt(10000000,99999999);
    }

    @Test
    public void testIsValidAccountShouldValidateAValidAccount(){
        assertTrue(bankify.IsValidAccount(validAccount));
    }

    @Test
    public void testIsValidAccountShouldNotValidateAnInvalidAccountWhenBankDoesNotExist(){
        String invalidAccount = "9910101010";
        assertFalse(bankify.IsValidAccount(invalidAccount));
    }

    @Test
    public void testIsValidAccountShouldNotValidateAnInvalidAccountWhenAccountLengthDoesNotMatch(){
        String invalidAccount = "011010";
        assertFalse(bankify.IsValidAccount(invalidAccount));
    }

    @Test
    public void testCreateAccountShouldGenerateAValidAccountNumberAccordingToTheBank(){
        String bank = "Bancolombia";
        String account = bankify.CreateAccount(bank);

        assertTrue(bankify.IsValidAccount(account));
    }

    @Test
    public void testCreateAccountShouldNotGenerateAnyAccountWhenBankDoesNotExist(){
        String bank = "Banco de la Republica";
        String account = bankify.CreateAccount(bank);

        assertTrue(account == null);
    }






}
