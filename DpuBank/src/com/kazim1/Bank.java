package com.kazim1;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Bank {
    Scanner scan = new Scanner(System.in);
    public Account accounts;
    public List<Account> accountList;
    public List<Account> accountSpecialList;
    public int minShort = 1000;
    public int minLong = 1500;
    public int minSpecial;
    public int amount;
    Account currentTerm1 = new CurrentTerm("Barış Barik ", 100000, 1);
    Account currentTerm2 = new CurrentTerm("Kadir Çağlayan ", 2000000, 2);
    Account shortTerm1 = new ShortTerm("Tarık Akan", 13435, 3);
    Account shortTerm2 = new ShortTerm("Kemal Sunal  ", 24535, 4);
    Account longTerm1 = new LongTerm("Ferhan Şensoy", 14545, 5);
    Account longTerm2 = new LongTerm("Polat Alemdar ", 245435, 6);
    Account specialTerm1 = new SpecialTerm("Özel Hesap Hüsnü Çoban", 145435, 10);
    Account specialTerm2 = new SpecialTerm("Özel Hesap Angelina Jolie ", 245435, 11);


    public Bank() {
        this.accountList = new ArrayList<>();
        this.accountSpecialList= new ArrayList<>();
        this.accountList.add(currentTerm1);this.accountList.add(currentTerm2);
        this.accountList.add(shortTerm1);this.accountList.add(shortTerm2);
        this.accountSpecialList.add(specialTerm1);this.accountSpecialList.add(specialTerm2);
        this.accountList.add(longTerm1);this.accountList.add(longTerm2);

    }


    public void accountControl(int desicion, int amount) {
        if (desicion == 1) {
            System.out.print("Adınızı Giriniz : ");
            String name = scan.nextLine();
            //         System.out.print("İlk Açılış Bakiyenizi Giriniz : ");
            if (amount > minShort) {
                Account initialAccount = new ShortTerm(name, amount, accountList.size()+1);
                this.accountList.add(initialAccount);
                this.accounts = initialAccount;
                System.out.println("Hesap Oluşturuldu");


            } else {
                System.out.println("İlk Açılış Bakiyesi " + minShort + "TL'den Küçük Olamaz");
            }

        } else if (desicion == 2) {
            System.out.print("Adınızı Giriniz : ");
            String name = scan.nextLine();
            //         System.out.print("İlk Açılış Bakiyenizi Giriniz : ");
            if (amount > minShort) {
                Account initialAccount = new LongTerm(name, amount, accountList.size()+1);
                this.accountList.add(initialAccount);
                this.accounts = initialAccount;
                System.out.println("Hesap Oluşturuldu");
            } else {
                System.out.println("İlk Açılış Bakiyesi " + minLong + "TL'den Küçük Olamaz");
            }
        } else if (desicion == 3) {
            System.out.print("Adınızı Giriniz : ");
            String name = scan.nextLine();
            //         System.out.print("İlk Açılış Bakiyenizi Giriniz : ");
            if (amount > minShort) {
                Account initialAccount = new SpecialTerm(name, amount, accountList.size()+6);
                this.accountList.add(initialAccount);
                this.accounts = initialAccount;
                System.out.println("Hesap Oluşturuldu");

            } else {
                System.out.println("İlk Açılış Bakiyesi " + minSpecial + "TL'den Küçük Olamaz");
            }
        } else if (desicion == 4) {
            System.out.print("Adınızı Giriniz : ");
            String name = scan.nextLine();
            //         System.out.print("İlk Açılış Bakiyenizi Giriniz : ");
            if (amount > minShort) {
                Account initialAccount = new CurrentTerm(name, amount, accountList.size()+1);
                this.accountList.add(initialAccount);
                this.accounts = initialAccount;
                System.out.println("Hesap Oluşturuldu");

            }

        } else if (desicion == 5) {
            for (Account account : accountList) {
                System.out.println(account);

            }
            for (Account account : accountSpecialList) {
                System.out.println(account);
            }
        }else{
            System.out.println("Hatalı Giriş Yaptınız ...");
        }

    }
}
