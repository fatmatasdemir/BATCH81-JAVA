package day03_scanner;

public class C01_AsciiTable {
    public static void main(String[] args) {

        int sayi=10;

        char harf='a';
      String str="banan";

        System.out.println(sayi+harf); //sayi= 10  char 'a' aski degeri 97 oldugu icin  10+97=107 olur
        System.out.println(str+harf); // string ve char kullanilirsa char'a' harf olarak doner  BANANAolur
        System.out.println(harf+2); //  aski degeri olur 97+2=99
        System.out.println(str+sayi+harf); //soldan saga calisti banan10a
        System.out.println(sayi*harf); //  970    10*97=970

        System.out.println(""+sayi+harf); // 10a

        char deger='1'; //49
        System.out.println(deger+harf); // 146 cikti  49+97=146










    }






}
