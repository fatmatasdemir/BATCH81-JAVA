package day11_stringManipulation;

public class C05_endsWith {

    public static void main(String[] args) {

        String str="Ah be Java";
        System.out.println(str.endsWith("ava")); // true konsolda yazar

        System.out.println(str.endsWith("be Java")); // boolen dondurur

        System.out.println(str.endsWith( "Ah be Java"));

        System.out.println(str.endsWith("")); // true
        System.out.println(str.endsWith("bak java ")); // false


    }





}
