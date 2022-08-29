package day43_interfaces_iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class M03_Iterator {
    public static void main(String[] args) {

        List<Integer> liste = new ArrayList<>();

        liste.add(10);
        liste.add(20);
        liste.add(30);

        System.out.println(liste); // [10,20,30]


        // Listedeki tum elementleri INDEX KULLANMADAN 3 artirin

        for (Integer each:liste
             ) {
            each+=3;
            System.out.print(each +" ");
        }

        System.out.println("");   // -----> 13 23 33
        System.out.println(liste);  // atama olmadigi icin orjinal haline geri doner  [10, 20, 30]

        /*
        Java index yapisi olmaya collectionlardaki elementlere
        ulasmak veya degistirmek icin
        Iterator interface'ini olusturmustur
      Iterator  interface oldugundan ondan obje uretmemiz mumkun degildir.
      Bunun yerine bize iterator döndüren liste.iterator () methodunu kullaniyoruz


         */


        System.out.println(liste); // [10,20,30]


        Iterator it1=liste.iterator();

        System.out.println(it1.next()); // 10  ----> [10,20,30]  ilk siradaki 10 alip saga kaydiriyor 20 yaklastiriyor

        System.out.println(it1.next()); // 20 ---> ustunden atlamalar yaparak saga kayiyor

        System.out.println(it1.next());// 30 --> iterator da GERI DÖNÜS YOK ileri gider

      //  System.out.println(it1.next());//Exception in thread "main" java.util.NoSuchElementException
        // 30'dan sonra element kalmadigindan next() RTE verir


        /*
        Iterator da geri dönüs yok, adim adim sona ulastiktan sonra
        basa gelmek isterseniz yeniden bir iterator olusturmaniz lazim
         */


        // [10,20,30]
        Iterator it2=liste.iterator();
        // YENI it2 yi kullanmak listenin tum elementlerini silelim
        // ILK it2.next();  yazariz sonra it2.remove(); yazariz sirayla sayilari
        // NEXT ile alir ardindan remove ile sayiyi siler

         it2.next();
        it2.remove();  //  ----->[20, 30]     10 silmis oluruz

       it2.next();
        it2.remove(); //-----> [30]     20 silmis oluruz

        it2.next();
        it2.remove(); //    []  ici bos olur   30 silmis oluruz

        // 20 silmek icin  doldur bosalt yapacagiz sout asagi alacagiz

        System.out.println(liste);  // iterator ile elementleri gezip, remove yapinca
        // liste kalici olarak degisti


        liste.add(10);
        liste.add(20);
        liste.add(30);
        System.out.println("yeniden liste : "+liste);
        Iterator it3= liste.iterator();
        while(it3.hasNext()){
            it3.next();
            it3.remove();
        }
        System.out.println("loop'dan sonra liste : "+liste);
        /*
         Goruldugu gibi Iterator kullanarak yapabildigim
         1- tum collection elementlerini yazdirmak
         2- tum collection elementlerini silmek
         Bu da bize yetmez
         */


    }
}
