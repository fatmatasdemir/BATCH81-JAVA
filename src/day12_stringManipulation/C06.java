package day12_stringManipulation;

public class C06 {
    public static void main(String[] args) {


        String input = "Mihrican";

        String tersInput = input.substring(7) + //
               input.substring(6, 7) + //
                input.substring(5, 6) + //
                input.substring(4, 5)+ //
                input.substring(3,4)+
                 input.substring(2,3)+
                 input.substring(1,2)+
                 input.substring(0,1);
        System.out.println(tersInput);


    }










}
