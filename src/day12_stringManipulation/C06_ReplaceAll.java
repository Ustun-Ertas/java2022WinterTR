package day12_stringManipulation;

import java.util.Scanner;

public class C06_ReplaceAll {
    public static void main(String[] args) {

        //kullanican isim-soyisim bilgisini alip
        //butun hafrleri * yapalim

        Scanner scan=new Scanner(System.in);

        System.out.println("Lutfen isminizi ve soyisimizi yaziniz");

        String isimSoyisim= scan.nextLine();

        System.out.println(isimSoyisim.replaceAll("\\S", "*"));



    }
}
