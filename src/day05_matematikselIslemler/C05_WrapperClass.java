package day05_matematikselIslemler;

public class C05_WrapperClass {
    public static void main(String[] args) {

    short sayi1=20;
    Short sayi2=30;
    sayi1=sayi2;// Wrapper Class ile ayni isimdeki primitive data turu arasinda gecis alabilir.

        System.out.println(sayi1);//30

        System.out.println(Short.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);
        System.out.println(Short.BYTES);
        System.out.println(Short.SIZE);
    }
}
