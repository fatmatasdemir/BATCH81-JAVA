package day24_arrayLists_ForEachloop;

import java.util.ArrayList;
import java.util.List;

public class C06_ForeachLoop {
    public static void main(String[] args) {

        int[] arr ={2,3,4,6,23,6,8,9,1};
        List<Integer> liste=new ArrayList<>();

        // array'deki tum elemanlari iceleyelim, tek sayi olanlari list'e atayalim
        for (int each: arr      // gelecek datalarin turu,
                               // loop icinde ne isim verdigim, neren aldigim
        ) {
            if (each%2==0){ // cift sayilari bulmak icin ==0 yazalim  [2, 4, 6, 6, 8]
                liste.add(each);
            }
        }
        System.out.println(liste); // [3, 23, 9, 1]














    }








}
