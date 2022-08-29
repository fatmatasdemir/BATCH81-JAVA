package day32_stringBuilder;

public class C06_replace {
    public static void main(String[] args) {


        /*
        sb.replace(5,10,"Up"); ---> 5 baslama yeri 10 sonu  Up ekleyip yazar " do" silinir
        nereyi degistirmek istiyorsak bunu kullaniriz


         */
        StringBuilder sb=new StringBuilder("Calm down");

        sb.replace(5,10,"Up");

        System.out.println(sb);  // Calm Up


        sb.replace(4,5,"---"); // 4 ten basla 5 kadar git 5 dahil degil araya 3 --- yazdir
        System.out.println(sb); // Calm---Up


        sb.replace(4,7," "); // aradaki --- silmek icin yandakini kuallniriz
        System.out.println(sb); //  // Calm Up


        sb.replace(5,7,"down"); //tekrar basa donmek istersek orjinal haline bunu yapariz
        System.out.println(sb);   // Calm down

    }
}
