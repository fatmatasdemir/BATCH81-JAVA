package day32_stringBuilder;

public class C05_indexOf_lastIndexOf {

    public static void main(String[] args) {

        StringBuilder sb=new StringBuilder("Pay attention please"); //  ---->dikkat edin lütfen(ing.turkcesi

      System.out.println(  sb.indexOf("Pay")); // 0

        System.out.println(sb);  // Pay attention please

        System.out.println(sb.indexOf("e")); // 7

        System.out.println(sb.indexOf("e" , 10)); //16
        /*
         System.out.println(sb.indexOf("e" , 10)) <------- BUNU kullandigimizda 10. harften itibaren e bul
         diyince bize e nin index olan 16 yazdirir (l YANINDAKI E)
         indexof bastan baslar sona dogru gider
         */


        System.out.println(sb.lastIndexOf("e"));  // 19 please en sondaki e index yazdirir
        System.out.println(sb.lastIndexOf("e" , 10)); // 7
        // 10 dan basla dese 10.sirada "i " var sonra sola dogru sayariz 7 index yazar
        /*
        lastIndexOf sondan basa dogru gider


         */
    }
}
