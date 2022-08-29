package day31_timeFormatter_varargs;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C01_TimeFormatter {

    public static void main(String[] args) {

        LocalDateTime tarihSaat = LocalDateTime.now();

        System.out.println("ilk olusturulan tarih : " + tarihSaat);

        // ilk olusturulan tarih  ---->2022-07-25    T    20:41:51.902585400


        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd/M/yy  hh:mm");

        System.out.println(dtf1.format(tarihSaat)); // 25/7/22  08:45


        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("d/MMM/yyyy  HH:mm");

        //M ---> ay tek m yazsak 7 yazar ama 3 tane MMM yazarsak ilk 3 harfi yazar Tem olur
        // MMMM  4 buyuk M yazarsak kelimenin tamami yazar
        // HH buyuk harf ile yazarsak 20:46 OLUR YUKARDA  hh --->08:45

        System.out.println(dtf2.format(tarihSaat)); // 25/Tem/2022  20:46


    }
}






























