package day21_Arrays;

public class C02_EnUzunVeKisaKelime {
    public static void main(String[] args) {

       //
        // Soru 2- Verilen String bir array’de en uzun ve
        // en kisa String’leri yazdiran bir method olusturun


        String[] isimler={"Erdal", "Onur", "Mehmet", "Hayrullah", "Mihrican"};

        enUzunVeKisaKelime(isimler);


    }

   public static void enUzunVeKisaKelime(String[] isimler) {

        String enUzunKelime=isimler[0];
        String enKisaKelime=isimler[0];


       for (int i = 1; i <isimler.length ; i++) {

         if (isimler[i].length()>= enUzunKelime.length()){ // eger buraya >=
             // koyarsak en son ki uzun kelimeyi alir
             enUzunKelime=isimler[i];

         }
           if (isimler[i].length()<enKisaKelime.length()){
              // length le arrayin degil i'nci indexindeki

           // stringin uzunlugunu aliyoruz

               enKisaKelime=isimler[i];

           }


       }

       System.out.println("Arraydeki en uzun kelime : " + enUzunKelime);
       System.out.println("Arraydeki en kisa kelime : " + enKisaKelime);

    }


}
