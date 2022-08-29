package day28_staticBlock;

public class C02_PassByValue {

    public static void main(String[] args) { // LOCAL SCOPE 1 //buradaki satis fiyati ile
                                               // local scope 2 deki satisfiyatiayni degildir



        double satisFiyati=100;

        System.out.println(indirimliFiyat( satisFiyati)); // 90

        System.out.println("Satis Fiyati :" + satisFiyati); //100

        System.out.println(indirimliFiyat( satisFiyati)); //90 indirim tekrar yazdirmadi
        System.out.println("Satis Fiyati :" + satisFiyati);


        // iki farkli methodda satIsFiyati isminde variable olabilir
        // Java buna itiraz etmez cunku scope lari farklidir

    }


    public  static  double indirimliFiyat(double orjinalFiyat){ // LOCAL SCOPE 2
         // methodumuz %10 indirim yapip
        // yeni fiyati main methoda dondursun

      double  satisFiyati=orjinalFiyat*0.9;

        return satisFiyati;
        /*
        90.0

      Satis Fiyati :100.0


         */


    }




}
