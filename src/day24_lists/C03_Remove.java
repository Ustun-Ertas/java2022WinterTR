package day24_lists;

import java.util.ArrayList;
import java.util.List;

public class C03_Remove {
    public static void main(String[] args) {

        List<Integer> sayilar = new ArrayList<>();

        sayilar.add(5); // [5]
        sayilar.add(3); // [5, 3]
        sayilar.add(0,7); // [7, 5, 3]
        sayilar.add(2,7); // [7, 5, 7, 3]
       sayilar.remove(3);// index olarak 3 deki elemanti siler
        //sayilar.remove(5); IndexOfBoundExpection

        Integer sayi=5; //Integer wrapper class'i Kulaninca sayi obje oldugundan, bu method calismaz
        sayilar.remove(sayi);
        System.out.println(sayilar);//[7,]7

        //sayilar.remove(Integer.valueOf("5"))

    }
}
