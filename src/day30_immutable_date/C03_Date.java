package day30_immutable_date;

import java.time.LocalDate;
import java.time.Month;

public class C03_Date {
    public static void main(String[] args) {

        LocalDate tarih=LocalDate.now();

        System.out.println(tarih); // 2022-07-23 // once yil sonra ay sonra gun yazdirir

        System.out.println(tarih.getDayOfYear());  // 204
        System.out.println(tarih.getDayOfWeek());  // SATURDAY
        System.out.println(tarih.getMonthValue()); // 7
        System.out.println(tarih.isLeapYear()); // bu sene artik yil mi diye bize true false doner // cikti false


        LocalDate tarih2=LocalDate.of(1964,5,15);
        System.out.println(tarih2);



        LocalDate tarih3=LocalDate.of(1990, Month.JANUARY,10);
        System.out.println(tarih3); // 1990-01-10

        System.out.println(tarih.plusDays(100)); // 2022-10-31
// sout icine tarih.plusDay () icine rakam yazarsak ornekte 100 yazdik 100 gun sonra tarih hangi gun olacack

        System.out.println(tarih.plusYears(5).plusMonths(3).plusDays(12));//2027-11-04
// 5 yil 3 ay 12 gun sonra tarih ne olur desek yukardaki ciktiyi verir


        System.out.println(tarih.minusWeeks(20)); // 2022-03-05
        // 20 hafta once tarih kacti onu gormek istersek yukardakini sout yaziyoruz


        System.out.println(tarih.minusDays(100).minusMonths(5)); // 2021-11-14
        // 100 gun  5 ay once tarih kacti ogrenmek icin yukaridaki yazilir geriye donuk


        System.out.println(tarih.isAfter(tarih2)); // true



        // iki farkli dogum gunu girildiginde
        // hangisinde doganin daha buuk oldugunu  bulunuz
        // tarih 2 ve tarih 3 icin yapalim


        if (tarih.isAfter(tarih3)){
            System.out.println(tarih3 + "tarihinde dogan daha buyuk");

        } else if (tarih.isBefore(tarih3)) {
            System.out.println(tarih2 +"tarihinde dogan daha buyuk");

        }else {
            System.out.println("iki tarih birbiri ile ayni");

        } // ciktimiz  1990-01-10tarhinde dogan daha buyuk



    }





}
