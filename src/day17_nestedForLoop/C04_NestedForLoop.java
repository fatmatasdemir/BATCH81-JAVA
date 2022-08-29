package day17_nestedForLoop;

import java.util.Scanner;

public class C04_NestedForLoop {
    public static void main(String[] args) {
        /*
        verilen inputa gore *'lardan olusan bir ucgen olusturun
        ornek   input =4  ise

        *   --->i=1 outer loop
        * * ----> i=2
        * * * ----> i=3
        * * * * ---> i=4

        */


           //int input=4; ilk boyle yaptik
        // sonra SCANNER yazdik iki turlu de olur

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen ucgenin kac satir olacagini girin");


        int input= scan.nextInt();

        for (int i = 1; i <=input ; i++) { ///


            for (int j = 1; j <=input ; j++) {

                System.out.print("* ");
            }
            System.out.println("");
        }










    }












}
