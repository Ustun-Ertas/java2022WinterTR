package day45_interface;

public interface I01_Default_Static {

    /*
    Interface'lerde sadece abstract method'lar bulunur body'si olan concrete bir method
    olusturmak istedigimizde Java CTE verir

    Ancak Java8 ve uzeri versiyonlarda, istisnai olarak static veta default olarak tanimlanan
    method'larin body'si olabilir omcak burada kullanilan default keyword'u access modifier degildir
    cunku Interface'lerde tum method'lar public ve abstract'ti





     */

    void method1();
    public default void method2(){

        System.out.println("Interface'deki default method");
    }

    static void method3 (){


        System.out.println("Interface'deki static method");
    }
}
