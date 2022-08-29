package day31_timeFormatter_varargs;

public class C02_Varargs {
    // 2.methodda  parantez icine  int... (int hemen sonra 3 nokta yazarsak )
    // istedigimiz kadar int sayi ekleyebiliriz intelij sorun yapmaz
    // int...  ----->>> Varargs demektir
    // degisken sayidaki argüment demetirk VARARGS
    // VARARGS----> variable number of arguments
    /*
    int... sayi bu gosterim integer variable'lardan olusan bir varargs demektir
    varargs array alt yapisini kullanir


     */

    public static void main(String[] args) {
        // verilen 2 int'i toplayip sonucu yazdiran bir method olusturun
        int sayi1=10;
        int sayi2=20;
        int sayi3=30;
        int sayi4=40;
        toplaYazdir(sayi1,sayi2,sayi3,sayi4);
    }
    public static void toplaYazdir(int sayi1, int sayi2, int sayi3, int sayi4) {
        System.out.println("Verilen dort sayinin toplami : " + (sayi1+sayi2+sayi3+sayi4));
   // }
   // public static void toplaYazdir(int sayi1, int sayi2, int sayi3) {
      //  System.out.println("Verilen uc sayinin toplami : " + (sayi1+sayi2+sayi3));
  //  }
   // public static void toplaYazdir(int sayi1, int sayi2) {
     //   System.out.println("Verilen iki sayinin toplami : " + (sayi1+sayi2));
    }
}
