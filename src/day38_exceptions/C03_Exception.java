package day38_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C03_Exception {

    public static void main(String[] args) {
        /*
          Marketteki tum urunleri bir array'de tuttugumuzu varsayalim
          Kullaniciya index sorup, o index'deki urunu yazdiran bir
          program hazirlayalim
          Kullanici urun sayisindan buyuk bir index girerse
          exception vermesinin onune gecelim

          /*
         catch blogunun onundeki parantezde
         exception class'inin ismi ve yaninda
         yakalanan exception'i atadigimiz variable'in ismi olur (e)
         Eger yakalanan exception ile ilgili bilgileri
         kullaniciya vermek isterseniz
         bu objeyi kullanabilirsiniz
         eger exception ile ilgili kullaniciya bilgi verme ihtiyaci yoksa
         e kullanilmasa da kod calisir
         */



        String[] urunler={"Nutella","Cokokrem","Sut","Cay","Findik"};
        Scanner scan = new Scanner(System.in);
        System.out.println("Istediginiz urunun sira nosunu giriniz");
        int istenenSira=0;
        try {
            istenenSira =scan.nextInt();
        } catch (InputMismatchException deneme) {
            System.out.println("Urun indexi icin bir tam sayi girmeniz gerekli");
            System.out.println(deneme);
        }

        try {
            System.out.println("Aradiginiz urun : " + urunler[istenenSira-1] );
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Girdiginiz sira listemizde bulunmuyor" +
                    "\nSira numarasi en fazla : " + urunler.length  + " olabilir" );
        }
    }
}















// deneme.getMessage(); ----> sout icine yazdir


            /*  System.out.println("hata mesaji :" +deneme.getMessage());    -----> hata mesaji:null
            elma
            Urun indexi icin bir tamsayi girmeniz gerekli
           hata mesaji :null
            program calismaya devam ediyor
            *

           // deneme.printStackTrace();






/*
    armut --------> yazdim altakiler cikti
Exception in thread "main" java.util.InputMismatchException
	at java.base/java.util.Scanner.throwFor(Scanner.java:939)
	at java.base/java.util.Scanner.next(Scanner.java:1594)
	at java.base/java.util.Scanner.nextInt(Scanner.java:2258)
	at java.base/java.util.Scanner.nextInt(Scanner.java:2212)
	at day38_exceptions.C03_Exception.main(C03_Exception.java:22)




 */