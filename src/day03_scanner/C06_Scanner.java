package day03_scanner;

import java.util.Scanner;

public class C06_Scanner {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);  // SEYFI CAPAR 34

        System.out.println("Lutfen isminizi giriniz");
        String isim=scan.nextLine();  // ali can


        System.out.println("Lutfen soyisminizi giriniz");
        String soyisim= scan.nextLine();

        System.out.println("Lutfen yasinizi giriniz");
         double yas=scan.nextDouble();
         //  int yas= scan.nextInt();
        System.out.println("girilen bilgiler ="+isim+" "+soyisim+" "+yas);



    }
}
