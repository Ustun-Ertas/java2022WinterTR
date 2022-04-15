package day45_interface;

public class C02_Default_Static_Method implements I01_Default_Static{

    @Override
    public void method1() {
        System.out.println("Child clss method1");

    }

    public static void main(String[] args) {

        //Interface'de static olarak tanimlanan method'ara static yontemlerle ulasabilir
        //InterfaceIsmi.methodIsmi

        I01_Default_Static.method3();

        C02_Default_Static_Method obj = new C02_Default_Static_Method();
        obj.method1();//Child class
        obj.method2();//parent Interface
        //obj.method3();eski class'larda static bir uyeye static olmayan yollarla'da ulasabilirdik
        //ancak Interface icersinde static olarak tanimlayan method'a static olmayan yontemlerle ulasilmaz
    }
}
