package day42_exceptions;

import java.util.Scanner;

public class C03_IllegalArgumentExpectrion {

    public static void main(String[] args) {


        /*
        kullanicidan yasini isteyin kullanici yas olarak bir sayi 0 veya 120'den buyuk sayi
        girerse IlllegalArgumentExpection olusacak sekilde bir program yaziniz

         */

        Scanner scan =new Scanner(System.in);

        System.out.println("Lutfen yasiniz giriniz");

        int yas= scan.nextInt();

        if (yas<=0 || yas>100){

            //System.out.println("Lutfen gecerli bir yas giriniz");

            //Java bizim istedgimiz durumlarda expection firlatabilir
        throw new IllegalStateException();

        }else {
            System.out.println("uygun bir yas girdiniz icin tesekkur ederim");
        }
    }
}
