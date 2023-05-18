package com.kazim1;

import java.util.Scanner;

public class LongTerm extends Account {
Scanner scan = new Scanner(System.in);
    public  LongTerm(String customerName ,int balance,  int customerId ){
        this.customerName=customerName;
        this.customerId=customerId;
        this.balance=balance;
    }
    @Override
    public void deposit(int amount) {
        balance = balance + amount;
        System.out.println("Güncel Bakiye : "+ balance+"TL"+" Yatırılan Tutar : "+amount+" TL");
    }

    @Override
    public void withdraw(int amount) {
        if(amount>balance){
            System.out.println("Hesap Bakiyeniz Bu İşlem İçin Yetersizdir");
        }else{
            balance = balance-amount;
            System.out.println("Güncel Bakiye : "+ balance+"TL"+" Çekilen Tutar : "+amount+" TL");
        }

    }
    public void getBalance(){
        System.out.println("Güncel Bakiye : " + balance+"TL");
    }

    @Override
    public void getId() {
        System.out.println("Uzun Vadeli Hesap Müşteri Numaranız : "+customerId);
    }
    public void LongTerm1(){
        System.out.println("Hoşgeldiniz " + customerName);
        System.out.println("Uzun Dönem Vadeli Hesabınız ...");
        System.out.println("=*=*=*=*==*=*=*=*==*=*=*=*==*=*=*=*==*=*=*=*==*=*=*=*==*=*=*=*==*=*=*=*==*=*=*=*==*=*=*=*=");
        System.out.print("Para Yatırmak  İçin 1 \nPara Çekmek için 2 \nHesap Bakiyenizi Öğrenmek İçin 3\n" +
                "Müşteri Numaranızı Öğrenmek İçin 4'ü Tuşlayınız : ");
        int desicion = scan.nextInt();
        switch (desicion){
            case 1 :
                System.out.print("Yatırmak İstediğiniz Para Miktarı : "); int amount = scan.nextInt();
                deposit(amount);
                break;
            case 2 :
                System.out.print("Çekmek İstediğiniz Para Miktarı : "); int kamount= scan.nextInt();
                withdraw(kamount);
                break;
            case 3 :getBalance();
                break;
            case 4 :getId();
                break;
            default:
                System.out.println("Hatalı Giriş Yaptınız ");
                break;

        }
    }
}
