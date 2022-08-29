package day12_stringManipulation;

public class C01_replace {
    public static void main(String[] args) {
        String str=" Bu gun  ha va  cok  guz el  ";
        System.out.println(str.replace( " " , "")); // bitisik yazmak icin Bugunhavacokguzel
        System.out.println(str.replace( "h", "J").replace( " ", ""));
        // BugunJavacokguzel --->  kucuk h harfi yerine buyuk J harfi koyduk

        System.out.println(str.replace( "guz el", "harika"));
        // Bu gun  ha va  cok  harika ----> gu zel yerine   harika koyduk

      //  System.out.println(str.replace("B" , "S"));


        str=str.replace("Bu gun","bugun")  //  ---> tanimaldik
                .replace("ha va","Java" )
                .replace("gu zel","guzel");
        System.out.println(str);  // bugun  Java  cok  guz el



    }





}
