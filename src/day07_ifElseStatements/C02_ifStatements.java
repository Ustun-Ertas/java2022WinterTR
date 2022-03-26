package day07_ifElseStatements;

public class C02_ifStatements {
    public static void main(String[] args) {

        int a=10;
        int b=20;
        if (a<b && b<100){

            System.out.println("Isteginiz gerceklesecek");
            System.out.println("body icindeki tum kodlari calisir");
        }
        if (a>b) System.out.println("suslu parantez olmazsa sadece bir satir calisir");
        System.out.println("2.satiri da calisti");
    }
}
