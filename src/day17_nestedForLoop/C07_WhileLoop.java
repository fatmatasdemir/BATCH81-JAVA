package day17_nestedForLoop;

public class C07_WhileLoop {
    public static void main(String[] args) {

        // 20'den 50'ye kadar (sinirlar dahil) cift sayilari yazdiralim

        // for Loop ILE yapalim



        int bas=20;
        int bitis=50;

        for (int i = bas; i <=bitis ; i++) {

            if (i%2==0){

                System.out.print(i    + " ");
            }
        }

        System.out.println("");



         int temp=bas;
        while (temp<=bitis){

            if (temp%2==0){

                System.out.print(temp + " ");

            }

            temp++;
        }



        /*
        20 22 24 26 28 30 32 34 36 38 40 42 44 46 48 50

        20 22 24 26 28 30 32 34 36 38 40 42 44 46 48 50





         */

    }








}
