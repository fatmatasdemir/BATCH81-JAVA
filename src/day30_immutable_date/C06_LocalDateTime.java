package day30_immutable_date;

import java.time.LocalDateTime;

public class C06_LocalDateTime {

    public static void main(String[] args) {

        LocalDateTime  tarihSaat=LocalDateTime.now();
        System.out.println(tarihSaat); // 2022-07-23T18:40:41.911919700  (once tarih sonra T saati yazar)

        System.out.println(tarihSaat.plusMonths(3).plusHours(100)); // 2022-10-27T22:44:25.831017
    //  3 ay 100 saat sonra tarih saat yazmak icin yukardakini yazariz

        System.out.println(tarihSaat.minusDays(100).plusHours(100)); //2022-04-18T22:44:25.831017
     // 100 gun once ....


        System.out.println(tarihSaat.toLocalDate()); //2022-07-23



    }








}
