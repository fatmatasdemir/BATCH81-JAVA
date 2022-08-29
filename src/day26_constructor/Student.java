package day26_constructor;

public class Student {
  //      Asagidaki class calistirildiginda output ne olur
    // SLAYTta ders anlatirken hocanin kalemle cozdugu soru bu


    String name="Emily";
    int age=20;

     Student (String name, int age){

         this.name=name;
         this.age=22;

     }

    public static void main(String[] args) { // JAVAILK ONCE BURADAN CALISIR

         Student st=new Student("Oliver", 21);//  Student (String name, int age) sol taraf sag ile uyumlu

        System.out.print(st.name);
        System.out.print("," + st.age);  // Cikti   Oliver,22



    }



}
