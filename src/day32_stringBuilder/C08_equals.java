package day32_stringBuilder;

public class C08_equals {
    public static void main(String[] args) {

        StringBuilder sb1=new StringBuilder("Java");

        StringBuilder sb2=new StringBuilder("Java");

        String str="Java";

        System.out.println(sb1.equals(sb2)); // false

        System.out.println(sb1.equals(sb1)); // true

        System.out.println(sb2.equals(sb1)); // BUNU BEN YAPTIM  konsolda FALSE yazar


        // StringBuilder da equals methodu ancak ayni obje olursa true doner ornek sb1 ...sb1 olursa
        // Stingdeki gibi dusunmeyin  string de icerik ayni olsaydi kabul ederdi equals methodu


        System.out.println(sb1.equals(str)); // false

        /*
        2 farkli objeyi normalde karsilastiramayiz
        sb1 ile str karsilatirinca false doner icerik ayni olsa bile
         */

        System.out.println(sb1.equals(str)); // false

        System.out.println(sb1.compareTo(sb2)); // 0

        StringBuilder sb3=new StringBuilder("Jave"); // Java ile Jave karsilastirilir

        System.out.println(sb1.compareTo(sb3)); // -4  ikisi birbiri ile ayni degil
        // ikisi arasinda -4 ascii kodlari aarasindaki farki verir

        /* COMPARETO ne demek ?
        compareTo() iki stringBuilder'i bastan baslayarak
        harf harf karsilastirir
        ilk harfler ayni ise, ikincilere gecer
           ikinciler ayni ise 3.lere gecer ve
        ilk farkli olan harfe kadar gider
      farkli olan iki harfin ascii kodlari arasindaki farki verir

        eger hic farkli harf yoksa
        sonuc olarak 0 dondurur
 */







    }
}
