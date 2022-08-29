package day05_matemtikselIslemler;

public class C01_Pre_Post_Increment {
    public static void main(String[] args) {

        int sayi1=10;

        int sayi2=sayi1+1;

        sayi2+=5;



        int sayi3=sayi2++; //once ata sonra artir o yuzden sayi3:16 sayi2:17olur

        System.out.println("sayi3:" + sayi3); // 16
        System.out.println("sayi2:" +sayi2); // 17

        int sayi4=++sayi1; // burada ++ önde yani önce artir sonra ata sayi4:11

        System.out.println("sayi4:" + sayi4); // 11
        System.out.println("sayi1:" +sayi1); // 11  SAYI BIR ONCEDEN 10 ARTIRILDI 11 OLDU











    }





}
