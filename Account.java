package com.example.accountapp.logic;

import com.example.accountapp.ui.OutputInterface;

/**
 * This file defines the Account class.  It provides the basis for a
 * series of improvements you'll need to make as you progress through
 * the lessons in Module 6.
 */
public class Account {
    /**
     * This is the variable that stores our OutputInterface instance.
     * <p/>
     * This is how we will interact with the User Interface
     * [MainActivity.java].
     * </p>
     * This was renamed to 'mOut' from 'out', as it is in the video
     * lessons, to better match Android/Java naming guidelines.
     */
    final OutputInterface mOut;

    /**
     * Name of the account holder.
     */
    private String name;

    /**
     * Number of the account.
     */
    private int number;

    /**
     * Current balance in the account.
     */
    private double balance;
    /**
     * Constructor initializes the field
     */
    //public Account(OutputInterface out) {
       // mOut = out;
    //}

    // Important note on constructors...
    // Each constructor that you add should take an OutputInterface parameter that
    // is used to initialize mOut (similar to the constuctor above).
    // Please remember to add that parameter to the code that you see in the lectures.
    public Account(String n, int num, OutputInterface out){
        name=n;
        number=num;
        balance=0.0;
        mOut=out;
    }
    public Account(String n, int num, double bal, OutputInterface out){
        this(n, num, out);
        balance=bal;
    }
    /**
     * Deposit @a amount into the account.
     */
    public void deposit(double amount) {
        balance += amount;
    }

    /**
     * Withdraw @a amount from the account.  Prints "Insufficient
     * Funds" if there's not enough money in the account.
     */
    public void withdrawal(double amount) {
        if (balance > amount)
            balance -= amount;
        else 
            mOut.println("Insufficient Funds");
    }

    /**
     * Display the current @a amount in the account.
     */
    public void displayBalance() {
        mOut.println("The balance on account " 
                     + number
                     + " is " 
                     + balance);
    }

    public String getName(){
        return name;
    }
    public int getNumber(){
        return number;
    }
    public double getBalance(){
        return balance;
    }
    public void setName(String newName){
        name=newName;
    }
    public void setNumber(int newNumber){
        number=newNumber;
    }

    @Override
    public String toString(){
        return "Account holder: "+this.getName()+", "+this.getNumber();
    }

    @Override
    public boolean equals(Object o){
        if(!(o instanceof Account)){
            return false;
        }
        Account otherAcc = (Account) o;
        return number==otherAcc.number;
    }
}
