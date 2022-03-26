package day08_ifElseIfStatement;

import java.util.Locale;
import java.util.Scanner;

public class C04_Emeklilik {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("\nlutfen cinsiyetinizi yazini" +
                "\nKadin icin K \nErkek icin E harfini giriniz");

        char cinsiyet = scan.next().toLowerCase().charAt(0);

        System.out.println("lutfen yasinizi giriniz");
        double yas = scan.nextDouble();
        if (cinsiyet == 'K') {


        } else if (cinsiyet == 'E') {

        }else{
            System.out.println("Lutfen cinsiyet icin gecerli bir Harf giriniz");
        }

    }
}