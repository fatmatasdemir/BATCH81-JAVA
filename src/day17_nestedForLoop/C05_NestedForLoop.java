package day17_nestedForLoop;

public class C05_NestedForLoop {
    public static void main(String[] args) {
        /*

       verilen inputa gore
       *'lardan olusan asagidaki sekli olusturun
       input=4
          *
          * *
          * * *
          * * * *
          * * *
          * *
          *

      */
        // artan kismi nested forloop ile yapalim


        int input=4; // sayiyi artiabiliriz bu dinamik oldugu icin

        for (int i = 1; i <=input ; i++) {
            for (int j = 1; j <=i ; j++) {  // ucgen oldugu icin 1 den baslayip i ye gidiyor

                System.out.print("* ");

            }
            System.out.println(""); // inner outer
        }

        for (int i = input-1; i >=1 ; i--) {
            for (int j = i; j >=1 ; j--) {
                System.out.print("* ");

            }
            System.out.println("");
        }



    }







}
