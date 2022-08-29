package day22_multiDimensionalArrays;

import java.util.ArrayList;
import java.util.List;

public class C06_List {
    public static void main(String[] args) {

        /*

        arrayi array yapan sembo [] idi
         arrayList de ise <>  diamond (elmas) kullaniriz
*/


           List<String> isimler=new ArrayList< >();

        System.out.println(isimler); //  [] bos bir liste yazdiracak


        // bir list'e eleman eklemek istersek

         isimler.add("Basak");


       System.out.println(isimler.add("Ayse")); // true doner
        System.out.println(isimler.add("Fatma")); // true

        /*
        String'de bir method calistirdigimizda
        assign yapmazsak String degismiyordu

        String isim="Suleyman
        isim.toUpperCase(); // SULEYMAN
        sout(isim) --> Suleyman



         */

        System.out.println(isimler);

   /* List'in tek kotu tarafi array alt yapisini kullandigi icin
    elemanlari birer birer eklemek zorunda olmamizdir
    */





    }




}
