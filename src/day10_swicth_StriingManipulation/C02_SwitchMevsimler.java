package day10_swicth_StriingManipulation;

import java.util.Scanner;

public class C02_SwitchMevsimler {
    public static void main(String[] args) {


        Scanner scan =new Scanner(System.in);

       int meyNo= scan.nextInt();

       switch(meyNo) {

           case 1:
           case 2:
           case 3:
               System.out.println("Kis");
               break;

           case 4:
           case 5:
           case 6:
               System.out.println("ilk bahar");
               break;
           case 7:
           case 8:
           case 9:
               System.out.println("Yaz");
               break;
           case 10:
           case 11:
           case 12:
               System.out.println("Son bahar");


       }
    }
}
