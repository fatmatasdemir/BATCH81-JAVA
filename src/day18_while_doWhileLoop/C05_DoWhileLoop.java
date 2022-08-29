package day18_while_doWhileLoop;

public class C05_DoWhileLoop {


    public static void main(String[] args) {


    /*
    soru1)
    9 dan 190'e kadar 7 nin kAti olan tum tamsayilaRi ekrana yazdiriniz

     */
         int bas=9;
         int bitis=190;

         int temp=bas;

         // WHILE LOOP ILE YAPALIM


        while (temp<bitis){

            if (temp%7==0){

                System.out.print(temp + " ");
            }
            temp++;


        }

           // do-while loop ile yapalim

        System.out.println("");
        temp=bas;

        do {
            if (temp%7==0){

                System.out.print(temp +" ");

            }
            temp++;


        }while (temp<bitis);

/*
14 21 28 35 42 49 56 63 70 77 84 91 98 105 112 119 126 133 140 147 154 161 168 175 182 189
14 21 28 35 42 49 56 63 70 77 84 91 98 105 112 119 126 133 140 147 154 161 168 175 182 189


 */


    }
}
