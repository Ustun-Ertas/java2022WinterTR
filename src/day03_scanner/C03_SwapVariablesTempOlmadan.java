package day03_scanner;

public class C03_SwapVariablesTempOlmadan {

    public static void main(String[] args) {


        int sayi1=10, sayi2= 20;
        System.out.println("Degisim olmadan onceki sayi:"+sayi1+"  ve sayi2 = "+sayi2+" ' dir. ");
        sayi1=sayi1 + sayi2;
        sayi2=sayi1-sayi2;
        sayi1=sayi1-sayi2;

        System.out.println(" Son hali:" +sayi1+", sayi2:" +sayi2 );





    }
}
