package day32_dateTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C04_DateTimeFormatter {
    public static void main(String[] args) {

        LocalDateTime tarihSaat= LocalDateTime.now();

        System.out.println(tarihSaat);//2022-03-31T21:39:37.609259400


        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd/MMMM/YYYY");
        System.out.println(formatter.format(tarihSaat));//31/March/2022

        DateTimeFormatter formatterSaat=DateTimeFormatter.ofPattern("hh:mm:ss a");
        System.out.println(formatterSaat.format(tarihSaat));//09:55:17 PM





    }
}
