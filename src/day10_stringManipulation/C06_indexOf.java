package day10_stringManipulation;

public class C06_indexOf {
    public static void main(String[] args) {

        String str="Java ogrenmek cok guzel";

        System.out.println(str.indexOf("o")); // 5
        System.out.println(str.indexOf("g")); //6
        System.out.println(str.indexOf("t")); // bana integer donduru
        // bir deger donerse biz aranan stringin str de olmadigini anlariz
     // java -1  dondurmeyi tercih etmistir

        String str5="bjdbckj. jbcjkdcb , dc  jbcjklwkdncwödnlnb hguu";

        // str5'te p harfi kullanilmis midir?


      if (str5.indexOf("p")==-1){
          System.out.println("str5 de istenen karakter kullanilmamis");
      }else {
          System.out.println("str5'de istenen karakter kullanilmis"); // str5'de istenen karakter kullanilmis

      }







    }















}
