package day25_constructor;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class C02_Constructor {

    public static void main(String[] args) {

        C01 obj1 = new C01();
        // Class adi       objenin  adi            keyword          constructor(yapici muthait gibi c01(); )




        Scanner scan = new Scanner(System.in); // -->BURADA constructor var
        Random rnd = new Random(); // --> burada da var
        List<String> list = new ArrayList<>(); //--> en sonda olusmus ();;


    /*
     // java bir objeyi olusturmak icin Classa ihtiyaci var
        // CLASS icinde obje olusturmak icin CONSTRUCTOR(kod blogu demektir)  ihtiyaci vardir

     ----  method degildir

    - --- Variable deildir
       Class ---> Object kalibi

       Javada Classlar OBJECT URETMEK ICIN cONSTRUCTOR KULLANILIR
    Javada bir Class olusturdugumuzda ,Java object olusturabilmemiz icin default constructor olusturur
       Default constructor  Class icinde gorulmez


    puplic class MyClass{

    MyClass (){

   }

   puplic static






     */


        System.out.println(obj1.sayi); // 0 yazar
        obj1.deneme(); // C01 den deneme method calisir


    }


}