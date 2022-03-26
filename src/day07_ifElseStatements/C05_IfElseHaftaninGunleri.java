package day07_ifElseStatements;

import java.util.Scanner;

public class C05_IfElseHaftaninGunleri {
    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);
        System.out.println("lutfen gin ismini yaziniz");
        String gunIsmi =scan.next().toUpperCase();


        if (gunIsmi.equals("PAZAR") || gunIsmi.equals("CUMARTESI")){
            System.out.println("girdiniz gun haftasonu");

        } else {
            System.out.println("girdiginiz gun hafta ici");
        }



        }

    }

