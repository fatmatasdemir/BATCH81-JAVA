package day35_inheritancedaConstructorKullanma;

public class LOgretmen {


   LOgretmen(){ // 7

       System.out.println("LOgretmen parametresiz cons"); // 8
   } //9 burasi calisir geldigin yere don der diger classa gider matamatikciler

    LOgretmen(String isim){

       this();
        System.out.println("LOgretmen parametreli cons ");
    }



}
