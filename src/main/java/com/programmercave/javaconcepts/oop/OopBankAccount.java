package com.programmercave.javaconcepts.oop;

import java.lang.Integer;

public class OopBankAccount {
    private Integer number;
    private Integer balance;

    public OopBankAccount(Integer number, Integer balance) {
        this.number = number;
        this.balance = balance;
    }

    public Integer getNumber() {
        return this.number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }
    
    public Integer getBalance() {
        return this.balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }

    public void deposit(Integer amount) {
        this.balance  += amount;
    }

    public void withdraw(Integer amount) {
        this.balance  += amount;
    }

    public void transfer(OopBankAccount destination, Integer amount) {
        this.withdraw(amount);
        destination.deposit(amount);
    }

}