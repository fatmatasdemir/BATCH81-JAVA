package day35_inheritancedaConstructorKullanma;

public class FMemur extends EMuhasebe {

    /*
    EXTENDS keyword kullanilan classlarda ister default constructor bulunsun
    istersek de biz yeni constructor(lar) olusturalim
    Java constructor'in Ilk satirina  ---->   super(); constructor call yazar

    super (); cons. call, default  cons, benzer
    gorunmese de orada  vardir ve calisir
    ancak biz ilk satira farkli bir cons. call yazarsak Java super(); siler
    */


    FMemur(){

        System.out.println("Memur parametresiz cons");
    }

    FMemur(String isim){

        System.out.println("Memur parametreli cons");

    }

    public static void main(String[] args) {

        FMemur mmr1=new FMemur("Ali"); //Personel parametresiz cons
                                             // Muhasebe parametresiz cons
                                             //  Memur parametreli cons

    }
}
/*
       Personel parametresiz cons
       Muhasebe parametresiz cons      ========>>>>>>>FMemur mmr1=new FMemur();
        Memur parametresiz cons        PARAMETRESIZ olarak calistirirsak sol daki gibi yazdirir




 */