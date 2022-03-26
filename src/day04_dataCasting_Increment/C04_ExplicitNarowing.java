package day04_dataCasting_Increment;

public class C04_ExplicitNarowing {
    public static void main(String[] args) {

        int sayi1=879;
        double sayi2= 10;

        double sayi3=sayi1/sayi2;

        System.out.println(sayi3);
        int sayi4= (int) (sayi1/sayi2);

        System.out.println(sayi4);

        int sayi5= 44;
        byte sayi6= (byte)sayi5;

        System.out.println(sayi6);


    }


}
