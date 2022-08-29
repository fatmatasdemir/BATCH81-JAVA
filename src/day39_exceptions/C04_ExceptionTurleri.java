package day39_exceptions;

public class C04_ExceptionTurleri {

    public static void main(String[] args) throws InterruptedException {

        String str;


        /*
         System.out.println(str);

        deger atamasi yapmadan bir variable kullanmaya calisirsaniz
        Java Compile Time  da bunu fark eder ve size izin vermez

         */


        str=null;
           // System.out.println(str.length());
         // NullPointerException    yazdirir
        // null ile atadiginiz bir variable lenght vs eklerseniz konsolda NullPointerException yazar


        Object obj="Java Java Java ";
        Integer sayi=(Integer) obj; // ClassCastException

        /*
        String str2="Hava Civa";
        Integer sayi2=str2;
        boyle yazarsak alti cizilir
      Java bazi casting islemlerine compile time da izin vermez
       ANcak bazen syntax  uygun olabilir
      bu durumda java kodun calismasina itiraz etmez

         */

        Thread.sleep(5000);




        /*  konsol ciktisi
         Exception in thread "main" java.lang.ClassCastException:
        class java.lang.String cannot be cast to class java.lang.Integer
        (java.lang.String and java.lang.Integer are in module java.base of loader 'bootstrap')
	at day39_exceptions.C04_ExceptionTurleri.main(C04_ExceptionTurleri.java:25)

         */
    }


}
