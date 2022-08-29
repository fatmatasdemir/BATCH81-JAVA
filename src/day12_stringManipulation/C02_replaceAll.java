package day12_stringManipulation;

public class C02_replaceAll {
    public static void main(String[] args) {

        String str="1Bu2gu3n Ja*va- cok g3uz/el";

        str=str.replace(" ", "qazwsx"); // ---> parantez icindekini ekledik
        System.out.println(str);              // 1Bu2gu3nqazwsxJa*va-qazwsxcokqazwsxg3uz/el

    str=str.replaceAll("\\W",""); // -----> sayi ve harf disindakileri cikardik
          System.out.println(str); // 1Bu2gu3nqazwsxJavaqazwsxcokqazwsxg3uzel

    str=str.replaceAll("\\d", ""); //----> SAYILARI CIKARDIK


    str= str.replace("qazwsx", " ");  // ----> anlamsiz olan kelimeyicikardik

        System.out.println(str);  // Bugun Java cok guzel


    }





}
