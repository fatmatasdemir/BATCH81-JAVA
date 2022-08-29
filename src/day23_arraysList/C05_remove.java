package day23_arraysList;

import java.util.ArrayList;
import java.util.List;

public class C05_remove {
    public static void main(String[] args) {

        List<Integer> sayilar1 = new ArrayList<>();

        sayilar1.add(5);
        sayilar1.add(3);
        sayilar1.add(2);
        sayilar1.add(1);

        System.out.println(sayilar1);  // [5, 3, 2,1 ]


         sayilar1.remove(1); // 3 siler
         /*
         sayilardan olusan bir liste varsa
         java remove methodunda sayi yazdigimizda direk index olarak kabul eder

          */

    //    System.out.println(sayilar1.remove(1));
        System.out.println(sayilar1); //[ 5, 2, 1]  yukarida index 1 sil dedi o da 3 oluyor




        // illa da 5 i silsin
        // silinecek objeyi bir variable a tanimlayabiliriz

        Integer sil=5; // [5,2,1]
        sayilar1.remove(sil);
        System.out.println(sayilar1); // [2,1]


        // veya indexOf methodundan yardim alabilirim

        sayilar1.remove(sayilar1.indexOf(2));  // // [2,1]

        System.out.println(sayilar1); // [1]


    }
















}
