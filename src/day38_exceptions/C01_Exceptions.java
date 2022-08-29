package day38_exceptions;

public class C01_Exceptions {
    public static void main(String[] args) {

         /*
          Bir sorunla karsilasmayi beklediginiz noktalarda
          if else ile sorunu yakalayip
          onunla ilgili cozum uretebilirsiniz
          ama sorunu her zaman if else ile cozemeyecegimizden
          Java try-catch block'lari olusturmustur.
         */

         //  int a=1000;
        //  int b=50;

     /*
             int sayac=1;   // --------> EXCEPTION verir

          while (sayac<100){

              System.out.print(a/b);

              b--;
              sayac++;

          }
          202020212122222323242525262727282930313233343537384041434
          547505255586266717683901001111251421662002503335001000
          Exception in thread "main" java.lang.ArithmeticException: / by zero
	at day38_exceptions.C01_Exceptions.main(C01_Exceptions.java:22)

         YUKAKARDAKINI YAZDIRISAK KONSOLDA BOYLE CIKAR EXCEPTION

        */

        int a=1000;
          int b=50;

        int sayac=1;

        while (sayac<100){

            if (b==0){
                System.out.println("islem yapilirken payda 0 oldu, dikkat etmelisiniz");

            }else {

                System.out.println(a/b);

            }
            b--;
            sayac++;

        } // 1000/50=  20    konosolda 20 den 1000 kadar sayilar sonra -20 kadar yazar



    }




/*


20
20
20
21
21
22
22
23
29
30
31
32
33
34
35
37
38
40
41
43
45
47
50
52
55
58
62
66
71
76
83
90
100
111
125
142
166
200
250
333
500
1000
islem yapilirken payda 0 oldu, dikkat etmelisiniz
-1000
-500
-333
-250
-200
-166
-62
-58
-55
-52
-50
-47
-45
-43
-41
-40
-38
-37
-22
-21
-21
-20




 */






}
