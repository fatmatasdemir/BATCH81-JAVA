package day10_stringManipulation;

import java.util.Locale;

public class C02_toLowerCase_toUpperCase {
    public static void main(String[] args) {

        String str="Java iyidir";

        System.out.println(str.toLowerCase());

        System.out.println(str.toUpperCase(Locale.forLanguageTag("TR")));



    }







}
