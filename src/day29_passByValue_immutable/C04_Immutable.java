package day29_passByValue_immutable;

public class C04_Immutable {
    public static void main(String[] args) {

        /* Benim notlarim
        Yildiz Bank
        gecici olarak tamamini buyuk harf yaptik YILDIZ BANK
        bu bir kopya gorevi goruyor
        str.toLowerCase(); yapsak normalde hepsini ----> yildiz bank olarak kucuk yapmasini beklerdik
        yazdirinca ilk atadigimz konsolda yazar ----->Yildiz Bank
        String  Immutable dir yani degistirilemez
        */




 /*
         Immutable : degistirilemez
         mutable   : degistirilebilir
         en meshur immutable class : String
         */
        String str= "Yildiz Bank";
        System.out.println(str.toUpperCase()); // YILDIZ BANK
        str.toLowerCase();
        System.out.println(str); // Yildiz Bank
        str.substring(3,5); // sout olmadigindan yazdirmaz, di
        System.out.println(str); // Yildiz Bank
        // Java'da String gibi metin ifadelerde kullanabilecegimiz
        // mutable StringBuilder class'i da vardir
        StringBuilder sb=new StringBuilder("Java Bank");
        System.out.println(sb); // Java Bank
        sb.reverse();
        System.out.println(sb); // knaB avaJ
        sb.append(".");
        System.out.println(sb); // knaB avaJ.
    }
}


























