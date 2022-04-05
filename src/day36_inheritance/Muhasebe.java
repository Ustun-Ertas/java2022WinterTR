package day36_inheritance;

public class Muhasebe extends Personel {


    protected int saatUcreti;
    protected String statu;
    protected int mass;

    protected int maasHesapla(){


        int mass=saatUcreti *80*30;
        return mass;

    }

}
