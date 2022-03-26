package day18_nestedForLoop;

import java.util.Scanner;

public class C08_WhileLoop {
    public static void main(String[] args) {

        //kullanicidan kac sayi toplamak istedigini alin
        // bu sayilar alin ve bu sayilari ekrana yazdirin

        int sayiAdeti=5;

        Scanner scanner = new Scanner(System.in);
        int sayi=0;
        int toplam=0;


        for (int i = 1; i <=sayiAdeti; i++) {

            System.out.print("Lutfen bir sayi giriniz: ");
            sayi= scanner.nextInt();
            toplam+=sayi;
        }
        System.out.println("girilen"+sayiAdeti+"sayinin toplami: "+toplam);

        //While Loop ile yapmak

        sayi=0;
        toplam=0;
        int sayac=1;

        while(sayac<=sayiAdeti){

            System.out.print("Lutfen bir sayi giriniz: ");
            sayi= scanner.nextInt();
            toplam+=sayi;
            sayac++;
        }
        System.out.println("girilen"+sayiAdeti+"sayinin toplami: "+toplam);
    }
}
