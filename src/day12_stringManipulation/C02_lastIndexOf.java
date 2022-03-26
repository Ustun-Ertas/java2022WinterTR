package day12_stringManipulation;

public class C02_lastIndexOf {
    public static void main(String[] args) {

        String cumle="Java ogren yeni program ile yeni bir safya ac";
        String kelime="yeni";

        int ilkKullanim= cumle.indexOf(kelime);//-1 veya index
        int sonKullanim= cumle.indexOf(kelime);

        if (ilkKullanim==(-1)){
            System.out.println("Girilen kelime cumlede kullanilmamis.");
        } else if (ilkKullanim==sonKullanim){
            System.out.println("Girilen kelime cumlede 1 kere kullanilmis.");
        }else {
            System.out.println("Girilen kelime cumlede 1’den fazla kullanilmis.");
        }


        String str="Eclipse";

    }
}
