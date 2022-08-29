package day23_arraysList;

import java.util.ArrayList;
import java.util.List;

public class C04_remove {


       /*
       remove methodu 2 sekilde kullanilir
       1= objeyi yazip silmesini istersek bize Boolen sonuc doner True / false

       2= index girersek o indexideki elemani siler ve bize silinen elemani dondurur

       remove tamamen siliyor

        */

    public static void main(String[] args) {

        List<String> urunler=new ArrayList<>();
        urunler.add("Nutella");
        urunler.add("Ikram");
        urunler.add("Cekirdek");
        urunler.add("Cay");


        System.out.println(urunler); // [Nutella, Ikram, Cekirdek, Cay]


        // 1.yontem

        System.out.println(urunler.remove("Ikram"));  // true
        System.out.println(urunler);  //  [Nutella, Cekirdek, Cay]


        System.out.println(urunler.remove("Hobby"));  // false
        System.out.println(urunler); // [Nutella, Cekirdek, Cay]


          // ikinci yontemi deneyelim yani index girelim
        System.out.println(urunler.remove(1)); // Cekirdek

        System.out.println(urunler);  // [Nutella, Cay]




        // Olmayan bir indexi silmeye calisirsak
        //System.out.println(urunler.remove(3));
        //  IndexOutOfBoundsException
        //




    }





}
