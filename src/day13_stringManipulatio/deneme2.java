package day13_stringManipulatio;

import java.util.Scanner;

public class deneme2 {
    public static void main(String[] args) {

        /* Kullanicidan bir sifre girmesini isteyin. Asagidaki sartlari sagliyorsa “Sifre
        basari ile tanimlandi”, sartlari saglamazsa “Islem basarisiz,Lutfen yeni bir
        sifre girin” yazdirin
        - Ilk harf buyuk harf olmali
        - Son harf kucuk harf olmali
        - Sifre bosluk icermemeli
        - Sifre uzunlugu en az 8 karakter olmali

         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Sifre giriniz");
        String sifre="Asdf12345a";

        String sifre1= scanner.nextLine();
        char ilkHarf= sifre.charAt(0);
        char sonHarf= sifre.charAt(sifre.length()-1);


        if (ilkHarf>='A' && ilkHarf<='Z' && sonHarf>='a' && sonHarf<='z' &&
                !sifre.contains(" ") && sifre.length() >=8) {
            System.out.println("Calisiyor");

        }
    }
}
