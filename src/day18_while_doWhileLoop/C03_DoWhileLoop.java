package day18_while_doWhileLoop;

public class C03_DoWhileLoop {
    public static void main(String[] args) {
    /*
    while loopda once kontrol edip sonra islem yaptigimiz icin
    islem bitiikten sonra loOp'un KIRILMASI ICIN BIR kez daha basa donmemmiz gerekiyor
    bu durumda fazladan BIR ISLEM YAPILIYOR



     */

        int sayi=7;

        while (sayi<10){

            System.out.println(sayi); // 7  8 9

            sayi++;




        }

     /*
      do_WHILE loop ile calistigimizda bu dezavantaj ortadan kalkar


      */

        sayi=7;

        do {
            System.out.println(sayi);


            sayi++;

        }while (sayi<10); // 7  8  9






    }









}
