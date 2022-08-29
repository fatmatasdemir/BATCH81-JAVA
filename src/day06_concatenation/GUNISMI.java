package day06_concatenation;

import java.util.Scanner;

public class GUNISMI {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen gun ismini yaziniz");
        String gunIsmi=scan.next().toLowerCase();

        if (gunIsmi.equals("pazar") || gunIsmi.equals("cumartesi")){
            System.out.println("girdiginiz gun haftasonu");
        }


        if (gunIsmi.equals("pazartesi")  || gunIsmi.equals("sali") || gunIsmi.equals("carsamba") ||
                gunIsmi.equals("persembe") || gunIsmi.equals("cuma")) {
            System.out.println("girdiginiz gun hafta ici");



        }
}









    }





