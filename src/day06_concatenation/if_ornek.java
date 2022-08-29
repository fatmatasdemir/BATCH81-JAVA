package day06_concatenation;

import java.util.Scanner;

public class if_ornek {

    public static void main(String[] args) {
        int a = 2;
        int b = 3;

        if (a >= b) {
            System.out.println(a + b);
        } else {
            System.out.println(a * b);
        }

        int y = 112;

        System.out.println((y > 5) ? ("inek") : ("Koyun")); // INEK


        int x = 112;
        System.out.println((y < 91) ? 9 : 11); //11


        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen bir tam sayi giriniz");

        int sayi= scan.nextInt();

        if (sayi%2 == 0) {
            System.out.println("girilen sayi cift sayidir");
        }

        if (sayi%2 != 0) {
            System.out.println("girilen  sayi tek sayi");











        }


    }
}