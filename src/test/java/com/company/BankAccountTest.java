package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {


    @Test
    void deposit() {
        assertEquals(150,new BankAccount(100).deposit(50));
        assertEquals(200, new BankAccount(200).deposit(5001));
    }

    @Test
    void withdraw() {
        assertEquals(150,new BankAccount(500).withdraw(350));
        assertEquals(20,new BankAccount(20).withdraw(1000));
    }
}