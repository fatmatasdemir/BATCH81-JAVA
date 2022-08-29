package day37_overridding;

public class DAraba {

    /*overriding tamamen methodlar ile  ilgilidir
    yakit geneldir
  bu Classda genel olanlari yazdik



*/

    private void yakit(){
        System.out.println("Tum arabalar yakit kullanir");
        /*
         Parent class'dan override edilmesini istemediginiz method'lari
         private, static veya final yapabilirsiniz
         */
    }
    void marka(){
        System.out.println("Tum arabalarin markasi vardir");
    }
    void motor(){
        System.out.println("Tum arabalarim motoru vardir");
    }








}
