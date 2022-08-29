package day05_matemtikselIslemler;

import java.util.Scanner;

public class C03_RakamlarToplami {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in); // 5267

        System.out.println("Lutfen  4  basamakli pozitif bir tamsayi giriniz");

        int sayi= scan.nextInt();

        int birlerBasamagi=0;

        int rakamlarToplami=0;

        int ilkGirilenSayi=sayi;

        //       5   2  6  7


        birlerBasamagi=sayi % 10;// 7
        rakamlarToplami+=birlerBasamagi;
         sayi/=10;// 7 gider


      // 5 2 6
        birlerBasamagi=sayi % 10;
        rakamlarToplami+=birlerBasamagi;
        sayi/=10;


        birlerBasamagi=sayi % 10;
        rakamlarToplami+=birlerBasamagi;
        sayi/=10;


        birlerBasamagi=sayi % 10;
        rakamlarToplami+=birlerBasamagi;
        sayi/=10;





        System.out.println(ilkGirilenSayi + "  sayinin rakamlar toplami:  " + rakamlarToplami);





    }
}
