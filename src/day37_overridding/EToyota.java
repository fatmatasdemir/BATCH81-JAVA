package day37_overridding;

public class EToyota  extends  DAraba{
   /*
EToyota DAraba ya gore farklilik olur cunku bu bir marka ismi
void marka(){}
yazarsak DAraba classi ile override olmus olur

void motor(){}
Daraba ya override olur
   */

    @Override
    void marka() {
        /* super.marka();
          eger hem overridden hem de overridding method'un calismasini istersek
          ilk satira super.marka() yazabiliriz
         */

        System.out.println("Markamiz Toyota");
    }
    void motor(){
        System.out.println("Toyota araclar Toyota marka motor kullanir");

    }


}
