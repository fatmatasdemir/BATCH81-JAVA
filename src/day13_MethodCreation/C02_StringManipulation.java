package day13_MethodCreation;

import java.util.Scanner;

public class C02_StringManipulation {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sifre giriniz");

        String sifre = scan.nextLine();

        int kontrol = 0;


        if (sifre.charAt(0) >= 'A' && sifre.charAt(0) <= 'Z') {

            kontrol++;

        } else {
            System.out.println("Ilk harf buyuk harf olmali");
        }

        if (sifre.charAt(sifre.length() - 1) >= 'a' && sifre.charAt(sifre.length() - 1) <= 'z') {
            kontrol++;

        } else {
            System.out.println("Son harf kucuk harf olmali");
        }

        if (sifre.contains(" ")) {
            System.out.println("Sifre bosluk icermemeli");

        } else {
            kontrol++;
        }

        if (sifre.length() >= 8) {
            kontrol++;

        } else {
            System.out.println("Sifre en az 8 karakter olmali");
        }

        if (kontrol==4){
            System.out.println("Sifre basari ile tanimlandi");
        }else {
            System.out.println("Islem basarisiz, Lutfen yeni bir yifre giriniz");
        }

    }
}