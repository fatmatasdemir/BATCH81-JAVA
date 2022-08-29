package day35_inheritancedaConstructorKullanma;

public class Matematikciler extends  LOgretmen {

    Matematikciler(){ //5   burada super (); var gorunmuyor
  // 6
        System.out.println("Matematik parametresiz cons"); //10


    } //11


   Matematikciler(String isim){  //3

        this();  // 4
       System.out.println("Matematik parametreli cons ");  //12
   } //13

    public static void main(String[] args) {  //1

        Matematikciler obj1=new Matematikciler("Tugba"); // 2   // 14 burasi

        /*

        LOgretmen parametresiz cons
        Matematik parametresiz cons
         Matematik parametreli cons
*/


    } // 15 burasi ve biter


 /*
     this() constructor call, icinde bulunulan class'daki constructorlari,
     super() ise parent class'da bulunan constructorlari cagirir
     this() veya super() parametre yapisina uygun bir constructor bulamzsa ?
     Java CTE verir
     constructor konusunda gordugumuz this.
     o class'daki instance variable'lari refere ediyordu
     inheritance'da da super. vardir
     super. parent class'daki instance'lari refere eder
     */






}
