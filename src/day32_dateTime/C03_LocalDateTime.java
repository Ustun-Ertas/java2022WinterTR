package day32_dateTime;

import java.time.LocalDateTime;

public class C03_LocalDateTime {
    public static void main(String[] args) {

        LocalDateTime tarihSaat= LocalDateTime.now();

        System.out.println(tarihSaat);//2022-03-31T21:36:02.848824
        tarihSaat.plusYears(3).plusMonths(2).plusDays(10).plusHours(5).plusMinutes(5);
        System.out.println( tarihSaat.plusYears(3).plusMonths(2).plusDays(10).plusHours(5).plusMinutes(5));
        //2025-06-11T02:43:29.794363300

    }
}
