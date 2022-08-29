package day24_arrayLists_ForEachloop;

public class C07_ArraydekiSayilarinKareToplami {
    public static void main(String[] args) {


        // bir integer list olusturunuz ve bu listdeki
        // tum sayilarin karesinin toplamini For Each loop
        // kullanarak bulunur.Sonucu ekrana yazdiriniz

        int[] sayilar={2,3,4,1,5,7,6,5,4,3};

        int toplam=0;

        for (int each:sayilar
             ) {
            toplam+=each*each;

        }

        System.out.println("Kareler toplami : " + toplam);// Kareler toplami : 190

    }















}
