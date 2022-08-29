package day25_constructor;

public class C03 {

    /*
    proje olustururken bazi classlar run etmek icin degil
    variable ve method olusturup bunlari baska classlardan kullanmak icin olusturulur

     */



    /*


    Default constructor parametresizdir
    goremezsek bile ihtiyac oldugunda calisir

    Class icersinde parametreli veya parametresiz
    herhangi bir constructor olusturursak
    java default constructor'i siler


     */



    C03(){


    }
    /*

    yukarida olusturdugumuz parametresiz bu constructor
    Default constrictor ile 1-1 aynidir.
  ama biz olusturdugumuz icin  buna default constructor demeyiz
  parametresiz constructor deriz .

     */

    String isim="Etka";

    public void  method01(){

        System.out.println("C03 method calisti ");



    }



}
