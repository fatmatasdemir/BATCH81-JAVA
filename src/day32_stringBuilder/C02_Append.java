package day32_stringBuilder;

public class C02_Append {

    public static void main(String[] args) {

        StringBuilder sb=new StringBuilder("Java daha ne yapsin");

        sb.append("?");

        System.out.println(sb); // Java daha ne yapsin?

         // append istedigimiz Stringi en sona ekler


        sb.append("Java" , 2 ,4);
        System.out.println(sb);
        /*

        16.satirda  Java   2,4 (4dahil degil)
        VA ---> ALIP CUMLENIN SONUNA EKLER


     */

        /*
        sb.insert bir cumlenin icine birsey eklemek istersek insert kullaniriz
        once yer sayisi yazilir sinra tirnak icinde yaziyi yazar  sout yapariz

         */

        sb.insert(4," her seyi dusunmus,");
        System.out.println(sb); // Java her seyi dusunmus, daha ne yapsin?

          // araya ekleme yapmak istedigimizde append degil insert kullanmaliyiz



        sb.insert(22,"valla valla",5,11);
        System.out.println(sb);
        // Java her seyi dusunmus valla, daha ne yapsin?
        // yukarida 2 valla valla yazdik sout icine ise tek valla
        // yazdirmak icin baslama bitis yerlerinin indexini yazdik
        // 22.index ten sonra valla yerlestirmek istedik

    }
}
