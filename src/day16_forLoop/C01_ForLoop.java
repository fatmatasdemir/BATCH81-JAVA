package day16_forLoop;

public class C01_ForLoop {
    public static void main(String[] args) {
        // verilen bir pozitif tamsayinin
        // pozitif tam bolenlerini yazdirlaim

        int input=20; // 120 deneyelim


        // ayni islemi birden 20 ye kadar gidecegim icin forloop kullaniyoruz

        for (int i = 1; i <=input ; i++) {

            if (input%i==0){
                System.out.print(i + " "); //1 2 4 5 10 20
            }

        }





    }








}
