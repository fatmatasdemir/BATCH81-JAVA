package day16_forLoop;

public class C02_ForLoopHatalar {
    public static void main(String[] args) {

        // baslangic noktasindan sonra
        // bitis sartina yaklaymiyorsak SONSUZ LOOP olusur
        // bu sekilde calistirirsak sayilar eklenir ve durmaz 1234565789874454921545454545565652211


        /*  for (int i = 0; i >-10 ; i++) {

            System.out.println(i);

        }

       */

        // eger ilk deger icin bile bitis sart saglamiyorsa for loop calisir
        // ama loop bodysi hicbir zaman devreye girmez/calismaz


        for (int i = 0; i >5 ; i++) {
            System.out.println(i);

        }
    }


}
