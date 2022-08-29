package day36_inheritanceDataTypeKullanimi;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class DIsci extends BMuhasebe {

    protected int saatUcreti = 11;
    protected int gunlukMesai = 7;
    protected void maasIsci(){
        System.out.println("Isciler : " + (30*saatUcreti*gunlukMesai)+ " maas alir");
    }
    protected void ozelSigortaIsci(){
        System.out.println("Isciler %70 indirimli ozel sigorta yaptirabilir");
    }
    public static <APersonel> void main(String[] args) {

        BMuhasebe isc1 = new DIsci();
        /*
          Bir obje olusturulurken
          Data turu ve constructor ayni class'dan ise
          direk o class'a gidiyorduk
          Eger data turu ve cons. farkli ise
          Obje constructor'in oldugu class'in objesidir
          ancak, bizden istenen
          Isci class'indaki spesifik ozellikler degil
          Bir iscinin muhasebe classindaki
          tum calisanlarla beraber sahip oldugu
          genel ozellikleri yazdirir
         */// ISCI MUHASEBE CLASSINDA BUTUN CALISANLAR ILE OLAN ORTAK ÖZELLIKLERI GÖRMEK ISTIYOR
        System.out.println(isc1.gunlukMesai); // MUHASEBE  gider    8
        System.out.println(isc1.saatUcreti); // MUHASEBE  gider  10
        isc1.maas(); // Muhaebeden  Personel minumum : 2400 maas alir
        isc1.ozelSigorta(); // Muhasebeden  Isteyen calisanlara %50 indirimli ozel sigorta yapilir
        isc1.sigorta(); // Personel class Tum personelimiz sigorta yapilir
        System.out.println(isc1.isim); // Personel Isim belirtilmedi
        System.out.println(isc1.soyisim); // Personel Soyisim belirtilmedi
        System.out.println(isc1.departmant);// Personel departman belirtilmedi


        System.out.println("****************************************");
        APersonal  isc2=new DIsci();

        //System.out.println(isc2.gunlukMesai);
        //System.out.println(isc2.saatUcreti);
        //isc2.ozelSigorta();
        isc2.sigorta(); // PERSONEL Tum personelimiz sigorta yapilir
        System.out.println(isc2.isim); // PERSONEL Isim belirtilmedi
        System.out.println(isc2.soyisim); // Personel Soyisim belirtilmedi
        System.out.println(isc2.departmant);// Personel  departman belirtilmedi
        /*
         Eger Data turu olan class'da aradigimiz ozellik yoksa
          onun parent'ina gidebilir
         ama child'a donus olmaz
         Aradigi ozelligi bulamazsa CTE  complie time eror verir
         */
        List<String> list1 = new LinkedList<>();// babanin kiz cocugu
        Deque<String> list2= new LinkedList<>();//kiz kardes
        Queue<String> list3= new LinkedList<>();// hala (merve onegi)
        /*
        Hepsi LinkedList olsa da
        list1 List gibi davranir
        list2 Deque gibi davranir
        List3 Queue gibi davranir
         */

    }
}
































    































