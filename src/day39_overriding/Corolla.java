package day39_overriding;

public class Corolla extends Toyota {


    protected String hiz="Corolla max 200 km hiz yapar";
    protected String yakit="Corolla benzinli veya elektriklidir";
    protected String model="Corolla";


    public void motor(){

        System.out.println("Corolla araclar cevreci motor kullanir");

    }
    public void yakitTuketimi(){
        System.out.println("Corolla 5.6 lt yakit tuketir");
    }
    public void vitesSayisi(){  System.out.println("Corolla 5 viteslidir");

    }

    public static void main(String[] args) {

        Corolla arb1= new Corolla();
        System.out.println(arb1.marka);//araba
        System.out.println(arb1.hiz);//Corolla
        System.out.println(arb1.yakit);//Corolla
        System.out.println(arb1.marka);//Toyota
        System.out.println(arb1.sirketMerkezi);//Toyota
        System.out.println(arb1.model);//Corolla
        arb1.motor();

        Toyota arb2= new Corolla();
        System.out.println(arb2.marka);
        System.out.println(arb2.hiz);
        System.out.println(arb2.yakit);
        System.out.println(arb2.marka);
        System.out.println(arb2.sirketMerkezi);
        //System.out.println(arb2.model);//CTE
        arb2.motor();

        Araba arb3= new Corolla();
        System.out.println(arb3.marka);
        System.out.println(arb3.hiz);
        System.out.println(arb3.yakit);
        System.out.println(arb3.marka);
        //System.out.println(arb3.sirketMerkezi);
        //System.out.println(arb3.model);
    }
}


