package day06_concatenation_Operators;

import day04_dataCasting_Increment.C03_Casting;

public class C_Tekrar {
    public static void main(String[] args) {

        String str1= "Java";
        String str2 = "Guzel";

         int sayi1= 5;
        int sayi2=3;

        // variable'larin degerlerini degistirmeden
        // asagidaki ifadeleri, bu variable'lari kullanarak yazdirin
        // Java5Guzel

        System.out.println(str1+sayi1+str2);
        // 2Guzel15

        System.out.println(sayi1-sayi2+str2+sayi1*sayi2);
        // Java22
        System.out.println(str1+(sayi1-sayi2)+(sayi1-sayi2));
        // 53Guzel
        System.out.println(sayi1+(sayi2+str2));


    }
}
