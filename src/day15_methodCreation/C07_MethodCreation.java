package day15_methodCreation;

public class C07_MethodCreation {

    public static void main(String[] args) {



        //string'i yazdiran method olusturalim
        //hosgeldiniz yazdir methodu
       //kapanma mesaji yazan bir method olustur

        hosgeldinYazdir();
        stringYazdir("Java gun gectikce guzellesiyor");
        kapanmaMethodu();


    }

    private static void kapanmaMethodu() {

        System.out.println("Bizi tercih ettiginiz icin tesekkur ederiz");
    }

    public static void hosgeldinYazdir() {

        System.out.println("Hosgeldin");
        stringYazdir("Boyle de olur");
    }

    private static void stringYazdir(String str) {
        System.out.println(str);

    }
}
