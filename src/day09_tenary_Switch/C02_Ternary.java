package day09_tenary_Switch;

import java.util.Scanner;

public class C02_Ternary {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tam sayi giriniz");
        int sayi=scan.nextInt();

        if (sayi%2==0){
            System.out.println("sayi cift");

        }else {
            System.out.println("sayi tek");
        }
        System.out.println(sayi%2==0? "sayi cift"  : "sayi tek");
    }


}
