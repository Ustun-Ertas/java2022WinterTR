package day09_tenary_Switch;

import java.util.Scanner;

public class C01_NestedIfElse {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);

        System.out.println("Lutfen 4 basamakli pozitif bir tamsayi giriniz");
        int sayi= scan.nextInt();

        if (sayi<100 || sayi>999){ //isteyen durumu yaziyoruz
            System.out.println("Lutfen 4 basamakli bir sayi giriniz");


        }else if (sayi%5==0){ // 4 basamakli ve sayi 5 e tam bulunur

          if (sayi%10==0){ //4 basamakli olup 5 ile bolunebilenve son rakam 0 olan
              System.out.println("5'e bolunen cift sayi");

          }


        } else{

            System.out.println("Tekrar deneyin");
        }
    }
}
