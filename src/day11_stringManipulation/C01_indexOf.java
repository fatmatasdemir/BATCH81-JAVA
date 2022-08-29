package day11_stringManipulation;

public class C01_indexOf {

    public static void main(String[] args) {

        String str="Java ogrenmek cok guzel";


        /* verilen bir stringde herhangi bir string veya char

        ilk kullanildigi index i bize dondurur

       */

        System.out.println(str.indexOf('g'));   // 6
        System.out.println(str.indexOf("r"));   // 7
        System.out.println(str.indexOf("j"));  //-1

        System.out.println(str.indexOf("mek"));  //  10

        /*

        aradiginiiz indexten sonrasini kontrol etmek istersek
         o zaman ayni methodu iki parametreli olarak kullanabiliriz
         */

        System.out.println(str.indexOf("g" ,  (6+1)));
        // yazilan indexden   baslar // 18


        // yukaridaki str da 2. ve 3. "e" nin indexlerini bulun
        // ikinciyi bulmak icin ilkinin index ini bilmem gerekiyor

         int ilke=str.indexOf("e");
         int ikincie=str.indexOf("e" , ilke+1);


         // eger 2. "e" varsa 3.  "e" nin olup olmadigini yazdiralim

         if (ikincie==-1){
             System.out.println("verilen str'da 2.e yok");

         }else {
             int ucuncue=str.indexOf("e" , ikincie+1);
             if (ucuncue==-1){
                 System.out.println("verilen str'de 3. e yok");

             }else{
                 System.out.println("verilen str'de 3.e'nin index'i :"+ ucuncue);



             }


         }








    }





}
