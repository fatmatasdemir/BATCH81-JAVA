package day34_inheritance;

public class Isci extends Personal{
/*
Normal hayatimizda parent cocuk sahibi olmaya karar verebilir
Java'da ise child class'lar ozelliklerini inherit etmek istedikleri
class'i kendilerine parent edinirler.

mesela isci classini olusturunca nelere ihtiyaci var diye dusunursek
Personal class'indaki tum variable ve methodlara ihtiyaci
oldugunu gorebiliriz.
bu duruma yeniden o variable ve methodlari olusturmak yerine
Personel class'ini kendimize parent ediniriz

Bir class'i parent edinmek icin extends keyword kullanmaliyiz

bir class baska bbir classi parent edindiginde
1-parent class'daki tum ozelliklere (variable+metho) otomatik olarak sahip olabilir
2-Parent classdaki ozelliklerden bazilarini kendine uyarlayabilir
3-Parent class'da olmayan bazi yeni ozellikkler olusturabilir

not: parent class'daki ozelliklerden hicbirini reddedemez ama degistirebilir

 */

    int persNO=1001;
public static void main(String[] args) {
     Isci isci1=new Isci();
    System.out.println(isci1.isim); // Isim belirtilmedi
    // kendi class'imizda isim variable yok,onun icin paret'a gideriz
    isci1.isim="Selim";

    System.out.println(isci1.persNO);// 1001 yazdirir kendi classimizda varsa onu kullanir

    isci1.maas();// Tum personelin maasi vardir

}
   public  void  maas(){

       System.out.println("Isciler minumum 15 euro saat ucreti alir");
       // Isciler minumum 15 euro saat ucreti alir  yazdirir

   }

  public void ozelSigorta(){

      System.out.println("Iscilerden isteyene %50 indirimli ozel sigorta yaptirilir");
  }



}
