package day29_passByValue_immutable;

public class C05_Immutable {
    public static void main(String[] args) {

        String isim="Mine";

        isim=isim.toUpperCase();

        System.out.println(isim); // MINE

        isim="Mevlut";

        System.out.println(isim); // Mevlut

          // ilk atanan Mine
        // SONRA toUpperCase ile MINE yaptik
        // java icinde ilk Mine disinda 2.obje olusus ve icine buyuk harfle  MINE yazar
        //buyuk MINE cope gidecek sekilde hazir bekler ve hafizada gereksiz yer isgal eder
        // isim="Mevlut" ; yazsak yazarken  ----> Mevlut yazar MINE cope gider


        for (int i = 0; i <100 ; i++) { // mevlut isminin yanina 100 tane ....nokta yazdirmak istedik

            isim+=" .";
        }

        System.out.println(isim);
   //Mevlut . . . . . . . . . . . . . . . . . . . . . . . . . . . . (100 TANE NOKTA YAZDIRIR)









    }






}
