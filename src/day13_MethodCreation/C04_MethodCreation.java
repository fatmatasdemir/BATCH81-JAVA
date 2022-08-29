package day13_MethodCreation;

public class C04_MethodCreation {
    public static void main(String[] args) {
        // input olarak verilen 2 int. toplayip sonucu yazdiran bir method olusturun

        int input1=10;
        int input2=20;

        // method 4 adimda olusturulur
        //1.adim method  call
        // 2.adim argument eklenemsi gerekiyorsa ekleyelim
        // eger methodun return typpe void den farkli olacaksa
        // bir variable olusturup, method call assign edelim

        topla(input1,input2);



    }

    public static void topla(int input1, int input2) {
        // 3.adim method deklarasyonunda degistirilmesi gereken
        // bolumleri degistirir(access modifier,return type vb..)
         // 4.eger return type void disinda bir seyse
        // return keyworu ve donecek degeri hesaplamaliyiz


        System.out.println("Girilen iki sayinin toplami :"+(input1+input2));

          // Girilen iki sayinin toplami :30



    }




}
