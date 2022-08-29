package day30_immutable_date;

public class C02_StringHavuzu {
    public static void main(String[] args) {

        String str1="Ali Can";
        String str2=str1+"";
        String str3=new String("Ali Can");
        String hiclik="";
        String str4=str1.concat(hiclik); //

        System.out.println(str1==str2); // false
        System.out.println(str1.equals(str2)); //true



        System.out.println(str1==str3); // false
        System.out.println(str1.equals(str3)); // true


        System.out.println(str2==str4); // false

        System.out.println(str2.equals(str4)); // true


        System.out.println("s1-s4 " + (str1==str4)); // TRUE

        System.out.println("s1-s4 "+str1.equals(str4)); // TRUE


            String str5="Ali Can";
            String str6=str1;


        System.out.println(str5==str1);  // true
        System.out.println(str1.equals(str5)); // true


        // 29.satir da hoca onemli birsey anlatti
        /*
        String immutable ve non primitive dir
         yeni bir String olustururken
         1- esitlih´gin saginda new keywordu olursa java direk yeni bir OBJE
         ve REFERANS olusturur

         2-eger esitligin saginda bir method calisiyor veya + islemi yapiliyorsa
         String Immutable oldugundan degisikligi kaydetmek uzere
         hemen bir kopya String ve REFERANS olusturur,
         sonra degeri hesaplayip bu yeni kopya objenin icine koyar




         */


        System.out.println(str1.equals(str5));  // true
        System.out.println(str5==str1);  // true

        System.out.println(str1.equals(str6)); // true
        System.out.println(str1==str6); // true


        System.out.println(str5.equals(str6)); // ture
        System.out.println(str5==str6); // true

        /*
        Eger yeni Sting objesi olusturulurken
        new kelimesi kullanilmaz veya
        esitligin saginda + islemi olmazsa Java bakar

       (BENIM SOZLERIM java bakar onceden bu String ten varsa onu atar
        1 referanstan 2.obje yazdiriyor
        BURASI STRING HAVUZU OLUYOR)

       Eger daha once olusturulan String objelerden (String Havuzu)
          bire-bir ayni String varsa
          o objeyi ve refreransini kullanir,

          bire-bir aynisi yoksa yeni bir obje  ve referans olusturur




        */






    }





















}
