package day27_staticKeyword;

public class C01 {


    static  int sayi=10;
    int rakam =5;


    public static void main(String[] args) {


        /*
        Class level'da iki tur variable olusturabiliriz

        static (class) variable
        instance (obje) variable

        static variable'ler tum class tan kullanilabilirken
        instance olanlar static  olmayan methodlar kullanilabilir

         instance variable'lara static method'dan ulasmak istersek
        obje olusturmamiz gerekir.

        instance variable'lar obje variable'i oldgu icin
        herhangi bir satirda instance variable'in degerinin ne oldugunu bulmak icin
        OBJE OLUSTURULAN SATIRDAN itibaren kod incelenmelidir.

        static variable'lar class variable'i oldugu icin
        herhangi bir satirda static variable'in degerini bulmak icin
       CLASSIN BASINDAN itibaren kod incelenmelidir.



     STATIC VARIABLES  ozellikleri
     1.Class yuklendiginde memoryde static variablelar olusturulur
     2.



         */


        C01 obj1=new  C01();
        System.out.println("obj1'in rakam degeri :" +obj1.rakam); // 5
        System.out.println("obj1'in sayi degeri : " + obj1.sayi); // 10  // main icinde sayi degeri atanmamis bu uzden
                                                          // class gidilir oraya bakilir orada static int=10; var


        obj1.rakam+=1; // 5+1=6
        obj1.sayi+=1; // 10+1=11


        System.out.println("1 artirdiktan sonra  obj1'in rakam degeri :" + obj1.rakam); // 6
        System.out.println("1 artirdiktan sonra  obj1'in sayi degeri :" + obj1.sayi); // 11


        // giciklik hakkimizi burada kullanacagiz altta // 2.class olusturduk


        C01 obj2=new  C01();

        System.out.println("obj1'in rakam degeri :" +obj2.rakam); // rakam instance variabledir  5 yazdirir
        System.out.println("obj1'in sayi degeri : " + obj2.sayi); //


       //sayi  static yani class variable objeden degil
        // biz gidip yukari cikar bakariz asagi dogru ineriz sayi en son 11 olmus



        obj2.rakam++; // 5 + 1=6
        obj2.sayi++; // 11 + 1 =12

        // obje1.rakam artirildi 6 olmustu
        //ama obje2.rakam yazdirilinca 5 verir
        //cunku constructor obje1 6 di obje2 gelince sifirlandi 5 geri dondu
        //bir obje icinde olan degerler diger obje leri ilgilendirmez

        // static variable lar gokteki ay gibidir herkesi aydinlatir herkes icin gecerlidir








        System.out.println("1 artirdiktan sonra  obj2'in rakam degeri :" + obj2.rakam); // 6
        System.out.println("1 artirdiktan sonra  obj2'in sayi degeri :" + obj2.sayi); // 12



        // asagidakiler benim sozlerim hocadan dinleyip donusturdum
 // RAKAM instance dir ve olusturulan objeden itibaren bakilir // C01 obj2=new C01(); itibaren bakilir
// sayi ise static yani class variable demek yukari cikilir
// asagi dogru bakilir sayi ile ilgili islem yapilmismi ona bakilir
        // sayi buradan itibaren bakilir // public static void main(String[] args) {








    }


















}
