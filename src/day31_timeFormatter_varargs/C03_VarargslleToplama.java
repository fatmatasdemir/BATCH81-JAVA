package day31_timeFormatter_varargs;

public class C03_VarargslleToplama {

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
        // verilen kac 2 int olursa olsun
        // hepsini toplayip sonucu yazdiran bir method olusturun
        int sayi1=10;
        int sayi2=20;
        int sayi3=30;
        int sayi4=40;
        int sayi5=50;
        toplaYazdir(sayi1,sayi2,sayi3,sayi4,sayi5);
        toplaYazdir(sayi1,sayi2,sayi3,sayi4);
        toplaYazdir(sayi1,sayi2,sayi3);
        toplaYazdir(sayi1,sayi2);
    }
    public static void toplaYazdir(int... sayi){
        /*
        int... sayi  bu gosterim integer variable'lardan olusan bir varargs demektir
        varargs array alt yapisini kullanir





         */
        int toplam=0;
        int sayiAdedi= sayi.length;
        for (int each: sayi
        ) {
            toplam+=each;
        }
        System.out.println("Girilen "+sayiAdedi+" adet sayinin toplami : " + toplam);
    }
































}
