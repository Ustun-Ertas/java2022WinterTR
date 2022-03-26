package day18_nestedForLoop;

import java.util.Scanner;

public class C09_ForLoopVsWhileLoop {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int sayi=0;
        int toplam=0;

        //Foor loop ile cozumu

        for (int i = 1; i <=100 ; i++) {
            System.out.print("Lutfen bir sayi giriniz: ");
            sayi= scanner.nextInt();

            if (sayi==0){
                break;

            }else {
                toplam+=sayi;
            }

            System.out.println(toplam);
        }

        //Wile Loop ile cozumu

        sayi=1;
        toplam=0;

        while (sayi!=0){
            System.out.print("Lutfen bir sayi giriniz: ");
            sayi= scanner.nextInt();
            toplam+=sayi;

        }
        System.out.println(toplam);

    }

}
