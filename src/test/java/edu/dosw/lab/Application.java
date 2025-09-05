package edu.dosw.lab;

import edu.dosw.lab.test.reto4.TestBankify;

public class Application {
    public static void main(String[] args){
        System.out.println("Proyecto Maven configurado y corriendo correctamente");
        TestBankify testBankify = new TestBankify();
        testBankify.testCreateAccountShouldNotGenerateAnyAccountWhenBankDoesNotExist();
    }
}