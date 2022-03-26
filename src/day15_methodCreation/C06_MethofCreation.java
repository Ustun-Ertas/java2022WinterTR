package day15_methodCreation;

public class C06_MethofCreation {
    public static void main(String[] args) {



        int a=10;
        int b=20;


        //iki variable'in degerlerini toplayan bir method olusturalim
        //1.adim: method adini yazalim
        //2.adim: method'a gondermem gereken argument var mi ?

        ikiSayiTopla(a,b);

    }

    private static void ikiSayiTopla(int a, int b) {

        System.out.println("verilen iki sayinin toplami : "+(a+b));

    }
}
