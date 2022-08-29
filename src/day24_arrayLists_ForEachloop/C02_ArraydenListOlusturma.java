package day24_arrayLists_ForEachloop;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class C02_ArraydenListOlusturma {
    public static void main(String[] args) {



  /*
        icinde 200 tane 1000'den kucuk pozitif tamsayi olan bir list olusturun
        kullanicidan bir sayi isteyip
        listede var olup olmadigini kullaniciya yazalim
         */

        Random rnd = new Random(); // random ozelligi 0--1 arasinda sayi uretir

        int sayi = 0;

        List<Integer> sayiListesi = new ArrayList<>();
        while (sayiListesi.size() < 200) {
            sayi = rnd.nextInt(1000); // random bound ise istedigimiz kadar sayi uretir
                                                 // bu nedenle burada random bound kullaniyoruz

            if (!sayiListesi.contains(sayi)) {
                sayiListesi.add(sayi);
            }
        }
      //  System.out.println(sayiListesi); yazdirirken konsolda gorunmesin diye boyle yaptim


        boolean bildiMi = false; // while kontrol etmek icin boolen olusturuyoruz
        int tahminSayisi = 1;

        Scanner scan = new Scanner(System.in);


        while (!bildiMi) { // bildiMi==false

            System.out.println("Lutfen bir sayi tahmininde bulunun");

            sayi=scan.nextInt();

            if (sayiListesi.contains(sayi)){

                System.out.println("Tebrikler " + tahminSayisi+ "adet tahminde listeden bir sayi buldunuz");

                bildiMi=true;


            }else {

                System.out.println(tahminSayisi+ "adet sayi soylediniz ama hicbiri listede yok");

                tahminSayisi++;
            }








        }


    }


}