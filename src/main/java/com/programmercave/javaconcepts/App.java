package com.programmercave.javaconcepts;

import com.programmercave.javaconcepts.oop.OopBankAccount;

import java.lang.Integer;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        OopBankAccount abhi = new OopBankAccount(100, 1);
        // abhi.setBalance(new Integer(100));
        // abhi.setNumber(new Integer(1));

        OopBankAccount bob = new OopBankAccount(200, 2);
        // bob.setBalance(new Integer(200));
        // bob.setNumber(new Integer(1));

        System.out.println("###################");

        abhi.transfer(bob, 50);

        System.out.println(abhi.getBalance());
    }
}
