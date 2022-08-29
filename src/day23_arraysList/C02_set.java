package day23_arraysList;

import java.util.ArrayList;
import java.util.List;

public class C02_set {


    public static void main(String[] args){


    /*
    elimizde urunlerin bulundugu bir liste var
    urun listesindeki istenen siradaki urunu
    istedigimiz yeni urunle degistirip
    eski urunu , varolan eski urunler listesine ekleyelim


     */

        List<String> urunler=new ArrayList<>();
        urunler.add("Nutella");
        urunler.add("Ikram");
        urunler.add("Cekirdek");
        urunler.add("Cay");

        List<String>  eskiUrunler=new ArrayList<>();

        //listedeki ikramin yerine Biskrem koyalim
        // ikrami  da eski urunler listesine ekleyelim

        String yeniUrun="Biskrem";
        String silinecekUrun="Ikram";


        int temp=urunler.indexOf(silinecekUrun);
        String silinenUrun=urunler.set(temp,yeniUrun); // BURADA ikramin yerine Biskrem yerlestirdik set yaptik

        // INDEXOF = bir listede aradigimiz urun varmi bulmak icin örnek  urunler.indexOf (silinecekUrun) yazariz

         eskiUrunler.add(silinenUrun);

        System.out.println("urunler listesi : " + urunler);// urunler listesi : [Nutella, Biskrem, Cekirdek, Cay]


        System.out.println("eski urunler listesi : "  + eskiUrunler); //eski urunler listesi : [Ikram]



        yeniUrun="Kahve";
        silinecekUrun="Cay";

        temp=urunler.indexOf(silinecekUrun);

        silinenUrun=urunler.set(temp,yeniUrun); // BURADA Cay  yerine Kahve yerlestirdik set yaptik

        eskiUrunler.add(silinenUrun);

        System.out.println("urunler listesi : " + urunler); // urunler listesi : [Nutella, Biskrem, Cekirdek, Kahve]

        System.out.println("eski urunler listesi : "  + eskiUrunler);//eski urunler listesi : [Ikram, Cay



        yeniUrun="Kabak";
        silinecekUrun="Cekirdek";

        temp=urunler.indexOf(silinecekUrun);

        silinenUrun=urunler.set(temp,yeniUrun); // BURADA Cekirdek yerine KABAK yerlestirdik set yaptik


        eskiUrunler.add(silinenUrun);

        System.out.println("urunler listesi : " + urunler);//urunler listesi : [Nutella, Biskrem, Kabak, Kahve]

        System.out.println("eski urunler listesi : "  + eskiUrunler);//eski urunler listesi : [Ikram, Cay, Cekirdek]

















    }



































}
