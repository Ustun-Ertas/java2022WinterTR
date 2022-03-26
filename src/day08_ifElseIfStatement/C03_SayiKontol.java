package day08_ifElseIfStatement;

import java.util.Scanner;

public class C03_SayiKontol {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Lutfen iki sayi giriniz");

         double sayi1=scan.nextDouble();
         double sayi2=scan.nextDouble();

         if (sayi1>0 && sayi2>0){
             System.out.println("girdiginiz iki sayida pozitif oldugundan toplamlari :" +(sayi1+sayi2));


             } else if (sayi1<0 && sayi2<0){
             System.out.println("girdiginiz iki sayi da negatif carpimlari :"+ (sayi1*sayi2));

         } else if (sayi1*sayi2<0){

             System.out.println("farkli isaretli sayilarla işlem yapamazsın");

         } else {
            System.out.println("sıfır carpmada yutan elemandır");

         }

         }
}
