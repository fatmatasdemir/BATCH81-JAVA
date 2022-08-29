package day15_overloading_forLoop;

public class C03_Overloading  {
    public static void main(String[] args) {

        topla(5,7); // 12   int+int
        topla(5.2, 3); // 8.2  double+int
        topla(3.4,6.1); // 9.5   double+double

    }
    public static void topla(int sayi1, int sayi2){
        System.out.println("Iki integer'in toplami :" + (sayi1+sayi2));  //12

    }
     /*
     bir classda parametre sayisi ve parametre data
     turleri ayni olan 2 method olusturamayiz.

    public static void topla(int sayi3, int sayi4){
         System.out.println("Iki integerin toplami : " + (sayi3+sayi4));


         }
    */

    public static void topla(double sayi1, int sayi2){
        System.out.println("bir double ve bir integer'in toplami : " + (sayi1+sayi2)); // 8.2
    }

    //public static void topla(int sayi1, double sayi2){
      //  System.out.println("bir integer ve bir double'in toplami : " + (sayi1+sayi2)); //
   // }

    public static void topla(double sayi1, double sayi2){
        System.out.println("Iki double'in toplami : " + (sayi1+sayi2)); // 9.5
    }



}








