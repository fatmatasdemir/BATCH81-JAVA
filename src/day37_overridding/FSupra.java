package day37_overridding;

public class FSupra extends EToyota {

    /*
    FSupra nin babasindan ve dedesinden farki vardir (DAraaba ve EToyota da)
    void yakit(){}  ---->benzin kullanir yazdik  --->Bir özellestirme var
    ayni isimde method olusturduk sol tarafta override olur
    uzerine yazma etkisiz haline getirme DAraba ile
    Daraba classinda ok isareti asagi dogru olur



     */


    void yakit() {  // DAraba clasindaki  yakit PRIVATE  yazdik sonradan bu yuzden bu cu yakit override olmuyor
        System.out.println("Supra benzin kullanir");


        /*
        Private methodlar override edilemez
        Eger child class da parent class'daki private method ile ayni signature da bir method olusturursaniz
        bu overridding method OLMAZ.

         */

    }

    @Override
    void motor() {


        //void motor otomatik olusturunca Override kendiliginde yazilir
        /*
          @Override notasyonu Javaya bir gorev verir
          Java, bu notasyonla birbirine bagli olan iki method'u
          surekli kontrol eder
          Eger parent class'daki overridden method'u silerseniz
          CTE verir

          @Override notasyonu kullanmak mecburi degildir ----> OTOMATIK YAZINCA GELIR
          Eger Overridding method silinirse, kodun CTE vermesini istersek
          @Override notasyonu kullanmaliyiz


   BURDAKI VOID MOTOR  ETOYOTA ya OVERRIDE edilmis
   EToyota DAKI MOTOR YANINDA 2 tane ok isareti var asagi ve yukari hem DAraba hemde FSupra override yapilmis oluyor




         */
    }

}








