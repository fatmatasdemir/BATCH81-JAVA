package day15_overloading_forLoop;

public class C01_ReturnMethod {
    public static void main(String[] args) {
        // verilen iki sayiyi carpip
        // sonucu bize donduren bir method olusturun


        int sayi1=10;
        int sayi2=5;

        int sonuc=carpGetir( sayi1, sayi2);
        System.out.println("Illa da sonucu goreyim diyenlere main method icinde:" +  sonuc); //50

    }

    public static int carpGetir(int sayi1, int sayi2) {


        int sonuc2=sayi1*sayi2; // buradaki sonuc farkli sonuc



        System.out.println("Illa da sonucu göreyim diyenlere diger method icinde:" + sonuc2); //50


        return sonuc2;





    }


}
