package day04_dataCasting;

public class C04_ExplicitNarrowing {


    public static void main(String[] args) {


        int sayi1=130; // 130  yazarsak sonuc -126 yazar cunku sayilar  -128 ile +127 arasi
        // 127 den sonra  -128 sayi alir oyle yazar   130-127=3    -128-3= -126 olur

        byte sayi2= (byte) sayi1;

        System.out.println(sayi2); //  -126



















    }
}
