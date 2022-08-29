package day32_stringBuilder;

public class C04_subSequence {
    public static void main(String[] args) {
    /*
    sb icinde String icerikler varsa StringBuikder degismez ,asagidaki Kayra oregi gibi



     */



        StringBuilder sb=new StringBuilder("Kayra");

        sb.substring(0,3); // string donduruyor
        // bu method String dondurdugu icin StringBuilder'in ESKI halini degistirmez

        System.out.println(sb); // Kayra



        sb.subSequence(0,3); // subSequence dondurur sekli bozulmaz
        System.out.println(sb); // Kayra



    }






}
