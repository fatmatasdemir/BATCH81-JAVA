package day30_immutable_date;

import java.time.LocalTime;

public class C04_LocalTime {
    public static void main(String[] args) throws InterruptedException {


        LocalTime time1 = LocalTime.now(); // zamani ogrenmek icin bunu kullaniriz
        System.out.println(time1); // 18:13:30.093996100






        Thread.sleep(3000);  // bunu yaptigimizda yukardaki saatin aynisini vermis olur

        time1=LocalTime.now(); // bunu yazarsak 18:17:46.055701  cikti bu ikisini verir arada 3 saniye var
                                                   //18:17:49.077743300
        System.out.println(time1);//

        System.out.println(time1.getSecond());
        System.out.println(time1.plusSeconds(10000)); //21:18:45.218111300
 // plusSeconds(10000) yazarsak onbin saniye sonra saat kac olacak buluruz

        System.out.println(time1.minusMinutes(200));
   // 200 dakika once saat kac ogrenmek icin bunu kullaniriz  //15:14:34.423486500 (suan saat 18.34 derste)


        System.out.println(time1.withHour(3));// suan saat 18:36 ama bunu yazarsak 03:36:47.772370300


    }


}
