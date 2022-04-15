package day45_interface;

public class C02_Default_Static_Method implements I01_Default_Static{

     /*
    Bir interface'de default veya static olarak tanimlanan ve body'si olan
    method'larin override edilmesi mecburi DEGILDIR
    Eger static olarak tanimlanmissa zaten override edemeyiz
     */

    @Override
    public void method1() {
        System.out.println("Child clss method1");


        /*
    Parent Interface'deki default olarak tanimlanan method'u
    istersek override ederiz istersek etmeyiz
    override etmezsek, method cagrildiginda Parent Interface'deki calisir
    override edersek, child class'daki overriding method calisir

         */

    }

    @Override
    public void method2() {
        I01_Default_Static.super.method2();
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
