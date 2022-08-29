package day08_ifStatements;

import java.util.Scanner;

public class C01_IfElseStatements {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir gun ismini giriniz");
        String gun = scan.nextLine().toLowerCase();

        if (gun.equals("pazartesi")) { // PAZARTESI buyuk harfle yazarsan litfen gcerli bir gun ismi giriniz diyor
            System.out.println("Paz");

        } else if (gun.equals("sali")) { // SALIDA AYNI YUKARDAKI GIBI
            System.out.println("sal");

        } else if (gun.equals("carsamba")) { // CARSAMBA buyuk harfle yazsan bile Car yazdiriyor

            System.out.println("Car");

        } else if (gun.equals("persembe")) { // PERSEMBE buyuk harf kabul ediyor per yaziyor
            System.out.println("per");

        } else if (gun.equals("cuma")) {
            System.out.println("cum");

        } else if (gun.equals("Cumartesi")) {
            System.out.println("Cum");

        } else if (gun.equals("pazar")) {
            System.out.println("Paz");
        } else {
            System.out.println("Lutfen gecerli bir gun ismi giriniz");

        }
    }
}