package day19_doWhileLoop;

public class Deneme {

    public static void main(String[] args) {



        int toplam=0;

        for (int i = 2; i <=15 ; i++) {
            System.out.print(i+ " ,");

            toplam+=i;

        }
        System.out.println("Toplam=" +toplam);
    }
}
