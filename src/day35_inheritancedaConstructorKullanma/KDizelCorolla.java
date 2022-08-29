package day35_inheritancedaConstructorKullanma;

public class KDizelCorolla extends HCorolla{


    KDizelCorolla(){

        System.out.println("KDizelCorolla parametresiz cons ");
    }



    KDizelCorolla(String isim){


        super(isim);
        System.out.println("KDizelCorolla parametreli cons ");

    }


    public static void main(String[] args) {

        KDizelCorolla obj1=new KDizelCorolla("Hasan"); // ======>>> PARAMETRELI YAZDIK
        /*
          GToyota parametreli cons
          HCorolla parametreli cons
          KDizelCorolla parametreli cons
       */


             //    PARAMETRSIZ YAPINCA        //
        //KDizelCorolla obj1=new KDizelCorolla();
        // YUKARDAKI gibi parametresiz yazarsak asagdaki cikti olusur
        // GToyota parametresiz cons
        //  HCorolla parametresiz cons
        // KDizelCorolla parametresiz cons










    }










}
