package day03_scanner;

import java.util.Scanner;

public class C09_DikdortgenHesaplama {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("dikdortgenin uzun kenarini giriniz");
        double a= scan.nextDouble();

        System.out.println("dikdortgenin kisa kenarini giriniz");
        double b= scan.nextDouble();

        System.out.println("Dikdortgenin yuksekligini giriniz");
        double c= scan.nextDouble();

        System.out.println("Diktortgenin hacmi:" + a*b*c);













    }
}
