package day18_nestedForLoop;

import java.util.Scanner;

public class C10_WhileLoopAvantaj {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int sayi=0;
        int toplam=0;

        while (sayi<500){

            System.out.print("Lutfen bir sayi giriniz: ");
            sayi= scanner.nextInt();
            toplam+=sayi;
        }
        System.out.println("Artik yeter cok sayi girdin, toplam: "+ toplam+ " oldu");
    }
}
