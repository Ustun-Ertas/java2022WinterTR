package day03_scanner;

import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen isminizi Giriniz");

     String kullaniciIsmi= scan.nextLine();

        System.out.println("Kullanici adini giriniz :" +kullaniciIsmi);

        //==================================================================
        Scanner scan1=  new Scanner(System.in);

        System.out.println("Lutfen Adinizi Giriniz");
        String kulaniciAdii= scan.nextLine();
        System.out.println(kulaniciAdii);


    }
}
