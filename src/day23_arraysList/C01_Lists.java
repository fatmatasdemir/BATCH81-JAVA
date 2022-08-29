package day23_arraysList;

import java.util.ArrayList;
import java.util.List;

public class C01_Lists {
    public static void main(String[] args) {
         /*
         set method'u istenen index'deki eski elementi silip,
          yerine verdigimiz yeni elementi set eder.
          eger eski elementi silmek istemiyorsak,
          add(index,deger) method'unu kullanabiliriz
          set() sildigi eski elementi de bize dondurur
         */

        List<Integer> sayilar1 = new ArrayList<>();

        sayilar1.add(5);
        sayilar1.add(3);
        sayilar1.add(2);

        System.out.println("Listenin boyutu : " + sayilar1.size()); // 3

        sayilar1.add(2);
        //.addAll(sayilar1);
  sayilar1.addAll(sayilar1);//---->bunu yazmasaydi konsol [5,3,2,2] YAZDIRIRDI

        System.out.println(sayilar1); // [5, 3, 2, 2, 5, 3, 2, 2]// 2 kere yanyana yazdirdi

        System.out.println("Listenin yeni boyutu : " + sayilar1.size()); //8

        sayilar1.set(2,8); //--> 2 indexse gidip 8 yazdirdi ordaki 2 sildi

        System.out.println(sayilar1); // [5, 3, 8, 2, 5, 3, 2, 2]

        System.out.println(sayilar1.set(0,12)); // 0 indexe gidip 12 yaz --> 5 silindi yerine 12 oldu
                                        // konsolda sildigi sayiyi dondurdu

        System.out.println(sayilar1); // [12, 3, 8, 2, 5, 3, 2, 2]

    }







    }

















