package day28_staticBlock;

public class C03_PassByValue {

    public static void main(String[] args) {


        // JAVA PASS BY VALUE dir

        /*

        %25 indirimli fiyati hesaplayip bize donduren bir method olusturun

         */

        double satisFiyati=100;
        double indirimOrani=60;

        // burada tanimlanan asaidaki methoda da tanimlandi
        //public static double indirimliFiyatHesapla(double satisFiyati) {
        double indirimliFiyat= indirimliFiyatHesapla(satisFiyati,indirimOrani);
        System.out.println("indirimli fiyat : " + indirimliFiyat);
        System.out.println("satis Fiyati : " + satisFiyati);

        System.out.println("******");

        System.out.println("indirimli fiyat : " + indirimliFiyat);
        System.out.println("satis Fiyati : " + satisFiyati);




    }

    public static double indirimliFiyatHesapla(double satisFiyati, double indirimOrani) {

        //java burada satisFiyati gormez degeri(value)gorur

        // yani 100 gorur
        // public static double indirimliFiyatHesapla(double satisFiyati)
        // bu yukardakinin icine satisFiyati yerine herhangi birsey yazsak degisen birsey yok
        // ornek xyz dersek kod yine calisir konsolda 75.0 yazar
        // orginal variable yerine ayni degere sahip kopya bir variable olusuturu ve method
        // icerisinde kopya variable uzerinden islem yapilir



        double indirimliFiyat=satisFiyati*0.75;

        return indirimliFiyat;



    }


}
