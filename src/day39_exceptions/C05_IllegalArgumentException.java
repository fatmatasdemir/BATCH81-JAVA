package day39_exceptions;

import java.util.Scanner;

public class C05_IllegalArgumentException {

    public static void main(String[] args) {
      //   Soru: Kullanicidan yasini girmesini isteyin.

       //  Kodunuzu kullanici sifirdan kucuk bir sayi girerse
        // Exception verecek sekilde yazin.


        Scanner scan = new Scanner(System.in);
        System.out.println("yasini giriniz");
        int yas = scan.nextInt();

        try {
            if (yas<0){
                throw  new IllegalArgumentException();

            }else{
                System.out.println("Yasiniz : " +yas);
            }
        } catch (IllegalArgumentException e) {
           // throw new RuntimeException(e);
            e.printStackTrace();
            System.out.println("Yas negativ olamaz");
        }




  /*
        yasini giriniz   34
           Yasiniz : 34

       yasini giriniz
          -25
      java.lang.IllegalArgumentException
	at day39_exceptions.C05_IllegalArgumentException.main(C05_IllegalArgumentException.java:19)
        Yas negativ olamaz ------> 24 satirin  CATCH ciktisi

         */


    }



}
