package day33_encapsulation;

public class ArabaRunner {
    public static void main(String[] args) {

        Araba arb1=new Araba();
        // arb1 objesi uzerinden marka variable'ina ulasabildim
        // degistirebildim(yazma-set) , ve yazdirabildim (okuma-get)

         arb1.marka="Toyota";
        System.out.println(arb1.marka); // Toyota




        // access modifier kullanarak marka variable'ina ulasimi
        //TAMAMNEN serbest yapabilir veya tamamnen engelleyebilirim
        // private yaptigimiz modele ise hic ulasamayiz
        // yani access modifier ya hep ya hic diyor

        // modeli degistirelim ama gormeyelim //BUNU ASAGIDA YAPIP CALISTIRDIK
        // yakiti da gorelim ama degistiremeyelim // BUNU DA

        // set ve get yetkilerini ozel olarak tanimlamak isterseniz
        //1.adim  ozel yetki tanimlayacaginiz variable lare private yaoin
        // private bir dataya baska class lardan ulasmak mumkun olmadigindan

        //2.adim set yetkisi  icin setter ,get yetkisi icin getter methodlari olusturalim
        //




        arb1.setModel("Corolla "); // model olarak Corolla  atadik --->ama yazdirmadi cunku getter yok
            // modeli yazdirma imkanimiz yok, cunku getter methodu yok
        System.out.println(arb1.getYakit()); // elektrikli bilgisini yazdirabildik

        // yakiti degistiremeyiz cunku setter methodu yok




         // getter() datayi sadece okumamiza yarar , datada degisiklik yapamaz
        //setter () baska classlardan olusturulan objeler icin data degerini degistirmemizi saglar

    }
}
