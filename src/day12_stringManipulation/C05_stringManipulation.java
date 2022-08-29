package day12_stringManipulation;

public class C05_stringManipulation {
    public static void main(String[] args) {
        String input="Kaya" ;

        String tersInput=input.substring(3)+ //A
                         input.substring(2,3)+ // Y
                         input.substring(1,2)+ //A
                         input.substring(0,1); //K


        System.out.println(tersInput);



    }







}
