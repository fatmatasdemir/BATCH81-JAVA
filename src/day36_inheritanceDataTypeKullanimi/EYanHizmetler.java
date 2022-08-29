package day36_inheritanceDataTypeKullanimi;

public class EYanHizmetler extends  BMuhasebe {



    protected int saatUcreti = 9;
    protected int gunlukMesai = 8;
    protected void maas(){
        System.out.println("Yan Hizmetliler : " + (30*saatUcreti*gunlukMesai)+ " maas alir");
    }
    protected void issizlikSigorta(){
        System.out.println("Yan Hizmetliler %30 indirimli issizlik sigortasi yaptirabilir");
    }
    public static void main(String[] args) {
        /*
        overriding child class'daki bir method'un
        parent class'daki ayni isimdeki methodu
        etkisiz hale getirerek
        kendisinin spesifik ozelligini ortaya cikarmasidir.
        // BALIKLAR --->Solungac ile nefes alir / yuzerek hareket eder PARENT gider oradaki nefes ve hareket
        OVERRIDING YAPAR ETKISIZ HALE GETIRIRIR

        Overriding'i nerede dikkate aliyoruz?
        bir obje olusturulurken
        data turu ve constructor farkli ise------   ORNNEK  BMuhasebe isc1 = new DIsci();

        eger bir obje olusturulurken
        data turu ve constructor farkli ise----

        objenin ozelliklerini belirlerken
        3 konuya dikkat cekmeliyiz
        1- Obje constructor'in oldugu class'da olusur
        2- objenin ozelliklerini aramaya data turunun oldugu class'dan baslariz
           bu class'da aranan ozellik bulunamazsa parent class'lara bakilir
           ordada bulamazsak CTE verir
          eger aranan ozellik variable ise buldugumuz ilk degeri yazdiririz  ----> OVERRINDING özelligi yok

       3 - aranan ozellik method   degeri yazdirmadan once
        override edilmis mi diye kontrol etmemiz gerekir
        eger override edildiyse en guncel degeri yazdiriz
         */

        BMuhasebe yh1=new EYanHizmetler();

        System.out.println(yh1.gunlukMesai); // varieable old.icin Muhasebeden alir  8
        System.out.println(yh1.saatUcreti); // variable old. icin Muhasebe den  alir  10
        yh1.maas(); // YH Yan Hizmetliler : 2160 maas alir
        // maasi muhaseben bulduk ama overriding edilmis mi bakilir sonra YAN HIZMETLILER CALISTIRILIR
        // muhasebeden maas almaz overriding olmus
        yh1.ozelSigorta(); //bakar yanh.overriding yapilmismi ? hayir o yuzden MUHASEBE den yazar
        // Muhasebe    Isteyen calisanlara %50 indirimli ozel sigorta yapilir

        yh1.sigorta(); // muhasebeye bakar orada yoksa PARENT gider  Personel--> Tum personelimiz sigorta yapilir
        System.out.println(yh1.isim); // Personel  varible old. icin direk personelden yazdirir
        System.out.println(yh1.soyisim); // Personel
        System.out.println(yh1.departmant);// Personel
        // System.out.println(yh1.issizlikSigorta);  --> bulundugumuz classda var
        // Aramaya muhasebeden basladigimizdan --->parentte de yok  asagi da inemez
        // issizlikSigortasi bulamadik CTE --->

    }
}

/*
8
10
Yan Hizmetliler : 2160 maas alir
Isteyen calisanlara %50 indirimli ozel sigorta yapilir
Tum personelimiz sigorta yapilir
Isim belirtilmedi
Soyisim belirtilmedi
departman belirtilmedi













 */





























