package edu.dosw.lab.test.reto4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

public class TestBankify {
    private String validAccount;
    private Bankify bankify;
    private User user;
    private String bank;

    @BeforeEach
    public void setUp() {
        bankify = new Bankify();
        Random rand = new Random();
        validAccount = "01"+ rand.nextInt(10000000,99999999);
        user = new User();
        bank = "01";
        bankify = new Bankify();

    }

    @Test
    public void testIsValidAccountShouldValidateAValidAccount(){
        assertTrue(AccountValidator.isValidAccount(validAccount));
    }

    @Test
    public void testIsValidAccountShouldNotValidateAnInvalidAccountWhenBankDoesNotExist(){
        String invalidAccount = "9910101010";
        assertFalse(AccountValidator.isValidAccount(invalidAccount));
    }

    @Test
    public void testIsValidAccountShouldNotValidateAnInvalidAccountWhenAccountLengthDoesNotMatch(){
        String invalidAccount = "011010";
        assertFalse(AccountValidator.isValidAccount(invalidAccount));
    }

    @Test
    public void testCreateAccountShouldGenerateAValidAccountNumberAccordingToTheBank(){
        Account account = bankify.createAccount(user,bank);

        assertTrue(AccountValidator.isValidAccount(account.getId()));
    }

    @Test
    public void testCreateAccountShouldNotGenerateAnyAccountWhenBankDoesNotExist(){
        String bank = "InvalidBank";
        Account account = bankify.createAccount(user,bank);
        assertTrue(account == null);
    }

    @Test
    public void testDepositMoneyShouldDepositMoneyInAccount(){
        Account account = bankify.createAccount(user, bank);
        bankify.makeDeposit(account.getId(), 1000);

        assertEquals(1000, bankify.checkBalance(account.getId()));
    }

    @Test
    public void testDepositMoneyShouldNotDepositMoneyInAccountWhenAccountDoesNotExist() {
        String account = "InvalidAccount";
        bankify.makeDeposit(account, 1000);
    }

    @Test
    public void testDepositMoneyShouldNotDepositMoneyInAccountWhenAmountIsNegative() {
        Account account = bankify.createAccount(user, bank);
        bankify.makeDeposit(account.getId(), -1000);
        assertEquals(0, bankify.checkBalance(account.getId()));
    }

    @Test
    public void testGetBalanceShouldReturnTheBalanceOfTheAccount() {
        Account account = bankify.createAccount(user, bank);
        bankify.makeDeposit(account.getId(), 1000);
        assertEquals(1000, bankify.checkBalance(account.getId()));
    }

    @Test
    public void testGetBalanceShouldReturnZeroWhenAccountIsBarelyCreated() {
        Account account = bankify.createAccount(user, bank);
        assertEquals(0, bankify.checkBalance(account.getId()));
    }

    @Test
    public void testGetBalanceShouldReturnZeroWhenAccountDoesNotExist() {
        String account = "InvalidAccount";
        assertEquals(0, bankify.checkBalance(account));
    }

}
