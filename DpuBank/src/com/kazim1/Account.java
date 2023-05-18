package com.kazim1;

import java.util.Scanner;

public abstract class Account {
    int balance;
    String customerName;
    int customerId;

    public void deposit(int amount){
    }
    public abstract void withdraw(int amount);
    public void getBalance(){


    }
    public void getId(){

    }
    public void getBenefit(){

    }

    @Override
    public String toString() {
        return "Hesabınız...{" +
                "Güncel Bakiye=" + balance +
                ", Müşteri Adı='" + customerName + '\'' +
                ", Müşteri Numarası=" + customerId +
                '}';
    }
}
