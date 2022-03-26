package day05_MatematikselIslemler;

public class C04_WrapperClass {
    public static void main(String[] args) {

    //primitive data turu ile non-primitive arasindaki farklar nelerdir?

    String str= "Java";

    int sayi= 10;

        System.out.println(str.toUpperCase());//JAVA

        // non-primitive data turleri data depolamak yaninda bir cok faydali method'a sahiptir.
        //ancak primitive data turlerinin boyle bir ozelligi yoktur.
        //primitive data turleri sadece degerleri saklarlar(konteynir)

        //primitive data turleri icin de bazi method'lar gerekli oldugunda
        //java ara bir cozum uretmistir
        //java her bir pirimitive data turunu, non-pritimive  olarak kullanabilmek icin
        //ozel Classlar olusturmus ve bunlara Wrapper adini vermistir.

        double sayi2= 2.5;
        //sayi primitive oldugundan sayi2. dedigimizde hic bir method gelmez

        double sayi3= 15.2;
        //sayi3 wrapper Class olan Double classini kullandigindan
        //sayi 3 dedigimizde bircok method olusturur.




    }
}
