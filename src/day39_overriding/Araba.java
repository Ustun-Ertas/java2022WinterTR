package day39_overriding;

public class Araba {

    protected String hareket="Arabalar teker ile haraket eder";
    protected String hiz="Arabalar motor gucune gore hiz yapar";
    protected String yakit="Arabalar farkli yakitlar kullanabilir";
    protected String marka="Arabalr uretikleri markaya sahiptir";

    public void motor(){

        System.out.println("Arabalar farkli markalarla motor kullanirlar");

    }
    public void yakitTuketimi(){
        System.out.println("Arabalar motor gucu ve yakit turune gore yakit tuketirler");
    }
}
