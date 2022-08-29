package day30_immutable_date;

import java.time.LocalDate;
import java.time.Period;

public class C07_Period {
    public static void main(String[] args) {

        // iki tarih arasindaki sureyi bulma


        LocalDate tarih1=LocalDate.of(1972,1,18);//MEHMET HOCANIN D:GUNU
        LocalDate bugun=LocalDate.now();

       Period period=Period.between(tarih1,bugun);

        System.out.println(period); // P-50Y-6M-5D ( 50 yil 6 AY 5 GUN)

        //         LocalDate tarih1=LocalDate.of(1988,7,15); --->P-34Y-8D
    }







}
