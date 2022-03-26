package day09_tenary_Switch;

public class C04_NestedTernary {
    public static void main(String[] args) {

        int sayi = -121;

        if (sayi % 2 == 0) {

            System.out.println("sayi pozotif cikti");

        } else {

            System.out.println("sayi pozitif cikti");

            if (sayi <= 100) {

                System.out.println("sayi -100 kucuk negatif sayi");
            } else {

                System.out.println("sayi -100 buyuk ngeatif sayi");
            }
        }


    }
}
