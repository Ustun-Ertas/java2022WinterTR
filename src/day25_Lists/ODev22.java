package day25_Lists;

import java.util.Scanner;

public class ODev22 {


    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.print("Sayi giriniz :");
        int sayi=scan.nextInt();

        System.out.println(powerOfThree(sayi));
    }

    public static boolean powerOfThree(int sayi) {

        boolean b= false;
        int carpim =1;

        for (int i = 1; i <sayi ; i++) { //num/3 olamdan direk num da yazılabilir
            carpim *=3;

            if (carpim ==sayi){
                b=true;
                break;
            }
        }
        return b;
    }
}





