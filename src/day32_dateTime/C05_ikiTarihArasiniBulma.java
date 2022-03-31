package day32_dateTime;

import java.time.LocalDate;
import java.time.Period;

public class C05_ikiTarihArasiniBulma {
    public static void main(String[] args) {

        LocalDate bugun= LocalDate.now();
        LocalDate dogumGunun= LocalDate.of(1989,06,14);
        System.out.println(Period.between(dogumGunun,bugun));//P32Y9M17D

        System.out.println(Period.between(dogumGunun,bugun).getYears());//32

        // FIXME: 3/31/2022 
    }
}
