package day34_inheritance;

public class Personal {
/*
Eger parent class olacak sekilde tasarladiginiz bir class varsa veya ilerde
bu classi parent yapmak isteyenler olursa
variable ve methodlarin access modifierini protected
 */
   protected int persNo;
    protected String isim="Isim belirtilmedi";
    protected  String departman="Departman belirtilmedi";


   protected  void maas(){
        System.out.println("Tum personelin maasi vardir");


    }


    protected   void mesai(){

        System.out.println("Tum personal statusune gore mesai yapar");
    }


    protected void fazlaMesaiUcreti(){

        System.out.println("personal fazla mesai ucretini statusune gore alabilir   ");
    }

}
