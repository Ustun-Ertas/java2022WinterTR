package day15_methodCreation;

import java.util.Scanner;

public class C02_MethodCreation {

    public static void main(String[] args) {

        //kullanicidan bir kelime isteyin eger kelime 3 hafli ise "kelime cok kisa" yazdirin
        //eger kelime 3,4 veya 5 harfli ise harf sayisini ve kelimenin tersten yazilsin yazdirin
        //eger 5 hafrten uzunsa "kelime cok uzun" yazdirim

        Scanner scanner =new Scanner(System.in);
        System.out.println("lutfen bir kelime giriniz");
        String kelime= scanner.next();
        String tersKelime= scanner.next();

        if (kelime.length()<3){
            System.out.println("kelime cok kisa");
        }else if (kelime.length()<=5){
            if (kelime.length()==3){
                tersKelime=kelime.substring(2)+
                        kelime.substring(1,2)+
                        kelime.substring(0,1);
            }else if(kelime.length()==4){
                tersKelime=kelime.substring(3)+
                        kelime.substring(2,3)+
                        kelime.substring(1,2)+
                        kelime.substring(0,1);
            }else {
                tersKelime=kelime.substring(4)+
                        kelime.substring(3,4)+
                        kelime.substring(2,3)+
                        kelime.substring(1,2)+
                        kelime.substring(0,1);
            }
            System.out.println("girdiginiz kelimedeki harf sayisi : " + kelime.length());
            System.out.println("kelimenin tersten yazilisi : " + tersKelime);
        } else {
            System.out.println("kelime cok uzun");
        }


    }
}
