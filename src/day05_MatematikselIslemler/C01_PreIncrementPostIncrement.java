package day05_MatematikselIslemler;

public class C01_PreIncrementPostIncrement {

    public static void main(String[] args) {
     int sayi=10;
     //bu sayiyi bir artirmak istersek

     sayi++;

        System.out.println(sayi);//11
        sayi++;
        System.out.println("pre incrementen once:" + sayi);//12

        sayi++;
        System.out.println(sayi);

        System.out.println("pre incrementen satirinda:"+ ++sayi);//14
        System.out.println("pre incrementen sonra:"+sayi);//14

        System.out.println("post increment satirinda:"+sayi++);//13
        System.out.println("post increment satirindan sonra:" +sayi);//15


    }
}
