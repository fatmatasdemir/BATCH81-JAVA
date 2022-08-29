package day34_inheritance;

public class ToyotaCorolla  extends Toyota{

    public static void main(String[] args) {


        /*

        child class'dan parent class'a erisimde
        access modifier kurallarini bypass edemeyiz
        ornek parent class'daki private class uyeleriini child
        class'dan kullanamyiz
        ayni sekilde parent  ve child farkli package'larda ise
         parent
        classdaki default access modifieri olan class uyelerini
        child class'dan kullanamyiz
         */
  ToyotaCorolla arb1=new ToyotaCorolla();

        System.out.println(arb1.marka); //Toyota



    }









}
