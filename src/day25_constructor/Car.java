package day25_constructor;

public class Car {
    /*

    Bu class bizim kaliphanemiz
    bir araba olusturmak icin ihtiyacimiz olan variable ve methodlari bu classda belirleriz


    sonra farkli classlar da araba olusturmamiz gerekirse
    bu classdan bir obje olusturup
    burada belirlenen variable ve methodlara gore araba uretir.




     */

    String marka="Marka belirtilmedi";

    String model="Model belirtilmedi";

     int yil;
     public int fiyat;

     public void  benzinliArac(){

         System.out.println("Bu arac benzinli motora sahiptir");
     }


    public  void  maxHiz(int hiz){
        System.out.println("Bu araba max " + hiz +"km hiz yapar");


    }






}
