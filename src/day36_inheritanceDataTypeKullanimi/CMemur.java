package day36_inheritanceDataTypeKullanimi;

public class CMemur  extends  BMuhasebe{


    protected int saatUcreti = 12;
    protected int gunlukMesai = 9;
    protected void maas(){
        System.out.println("Memurlar : " + (30*saatUcreti*gunlukMesai)+ " maas alir");
    }
    protected void ozelSigorta(){
        System.out.println("Memurlar %60 indirimli ozel sigorta yaptirabilir");
    }

    public static void main(String[] args) {
        CMemur mmr1=new CMemur();
        System.out.println(mmr1.gunlukMesai); // 9

        System.out.println(mmr1.saatUcreti); // 12

        mmr1.maas(); // Memurlar : 3240 maas alir --->bunu icinde bulundugumuz Class dan aldi (30*12*9)

        mmr1.ozelSigorta(); // Memurlar %60 indirimli ozel sigorta yaptirabilir ---> bu CLASS dan aldi

        mmr1.sigorta(); // Tum personelimiz sigorta yapilir  ---> PERSONEL CLASS

        System.out.println(mmr1.isim); // Isim belirtilmedi    ----> PERSONEL CLASS

        System.out.println(mmr1.soyisim); //Soyisim belirtilmedi  ----> Personel CLASS

        System.out.println(mmr1.departmant);//  departman belirtilmedi ------> Personel CLASS

        BMuhasebe mhsb1= new BMuhasebe();
        /*
        Her ne kadar Memur class'inin icinde olsak da
        olusturdugumuz obje Muhasebe class'indan
        cunku data turu ve constructor BMuhasebe
        String str="Murat";
        ArrayList<Integer> list=new ArrayList<>();
        Integer sayi=20;
        BMuhasebe class'i da obje olusturulabilen bir class'dir yanidata turudur
    */
        System.out.println(mhsb1.gunlukMesai); // 8  Muhasebe CLASSI
        System.out.println(mhsb1.saatUcreti); // 10 Muhasebe CLASSI

        mhsb1.maas(); // Muhasebe Personel minumum : 2400 maas alir    ---->  (30*10*8)
        mhsb1.ozelSigorta(); // Muhasebe Isteyen calisanlara %50 indirimli ozel sigorta yapilir
        mhsb1.sigorta(); // Personel Tum personelimiz sigorta yapilir
        //MUHASEBE CLASSINDA SIGORTA OLMADIGI ICIN GICIP PERSONEL CLASSI CALISIR VE ASAGIDAKILERDE ÖYLE
        System.out.println(mhsb1.isim); // Personel
        System.out.println(mhsb1.soyisim); // Personel
        System.out.println(mhsb1.departmant);//Personel
    }
}

