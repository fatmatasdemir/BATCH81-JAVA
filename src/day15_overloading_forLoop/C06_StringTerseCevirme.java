package day15_overloading_forLoop;

public class C06_StringTerseCevirme {
    public static void main(String[] args) {
        // input olarak verilen Stringi terse cevirip yazdiran bir method olusturun

        String input="Java gun gectikce guzellesiyor"; // ey edip adanada pide ye  // bunu yazarsak terside ayni olur



        terstenYazdir(input);


    }

    public static void terstenYazdir(String input) {
     String tersInput=input.substring(input.length()-1);

        for (int i = input.length()-2; i >=0 ; i--) { // for(int i=0; i<input.length()-1; i++{

         tersInput+=input.substring(i,i+1);


        }

        System.out.println(tersInput);// royisellezug eckitceg nug avaJ



    }


}
