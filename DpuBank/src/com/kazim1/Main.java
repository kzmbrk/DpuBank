package com.kazim1;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {


Bank myBank = new Bank();
Scanner scan = new Scanner(System.in);


        while(true){
            System.out.println("DPU BANKASI ");
            System.out.println("=*=*=*=*==*=*=*=*==*=*=*=*==*=*=*=*==*=*=*=*==*=*=*=*==*=*=*=*==*=*=*=*==*=*=*=*==*=*=*=*=");
            System.out.println("");
            System.out.print("Hesap Açmak İçin 1'i \nMevcut Hesaplarınızla İlgili İşlem Yapmak İçin 2'yi Tuşlayınız : ");



            int desicion1=scan.nextInt();
            System.out.println("=*=*=*=*==*=*=*=*==*=*=*=*==*=*=*=*==*=*=*=*==*=*=*=*==*=*=*=*==*=*=*=*==*=*=*=*==*=*=*=*=");
            if ( desicion1==1){
                System.out.println("Lütfen Açmak İstediğiniz Hesap Türünün Belirleyiniz");
                System.out.print("Kısa Dönem Vadeli Hesaplar İçin 1 \nUzun Dönem Vadeli Hesaplar İçin 2 \nÖzel Vadeli Hesaplar" +
                        "için 3 \nVadesiz Hesaplar İçin 4 \nOluşturulan Hesapları Görüntülemek İçin 5'i Tuşlayınız :  ");
                int  accountdesicion=scan.nextInt();
                System.out.print("Bakiye Giriniz : ");
                int amount1 = scan.nextInt();
                myBank.accountControl(accountdesicion,amount1 );



            } else if (desicion1==2) {

                System.out.print("Müşteri Numaranızı Giriniz : ");
                int k = scan.nextInt();
                System.out.println("=*=*=*=*==*=*=*=*==*=*=*=*==*=*=*=*==*=*=*=*==*=*=*=*==*=*=*=*==*=*=*=*==*=*=*=*==*=*=*=*=");
                System.out.println("Lütfen İşlem Yapmak İstediğiniz Hesap Türünü Seçiniz ");
                System.out.print("Vadesiz Hesabınız için 1'i \nUzun Dönem Vadeli Hesabınız İçin 2'yi \n" +
                        "Kısa Dönem Vadeli Hesabınız İçin 3'ü \nÖzel Vadeli Hesabınız İçin 4'ü Tuşlayınız :   ");
                int karar = scan.nextInt();
                System.out.println("=*=*=*=*==*=*=*=*==*=*=*=*==*=*=*=*==*=*=*=*==*=*=*=*==*=*=*=*==*=*=*=*==*=*=*=*==*=*=*=*=");

                if (karar == 1) {
                  myBank.accountList.get(k-1).deposit(0);
                } else if (karar == 2) {
                    myBank.accountList.get(k-1).deposit(0);
                } else if (karar == 3) {
                    myBank.accountList.get(k-1).deposit(0);
                } else if (karar == 4) {
                    myBank.accountList.get(k-1).deposit(0);
                }else if(karar==5){

                }else{
                    System.out.println("Hatalı Giriş Yaptınız ...");
                }

        }
}
    }
}
