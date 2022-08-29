package day04_dataCasting;

public class C03_AutoWidening {

    public static void main(String[] args) {

      byte sayi1=23;
      short sayi2=55;

      int sayi3=sayi1+sayi2;  // 88

      double sayi4=sayi1*sayi2; // 1265.0

      sayi4=(double) sayi2/sayi1;   //boyle yazarsak gercek sayi oartaya cikar 53.0/ 23 =2391



      // 2.391  sonuc 2.0 cunku noktadan sonra saymiyor


        // .sonra sayi4 atariz sayi4 double oldugu icin 2.0 olur



         System.out.println(sayi4);









      }



    }






