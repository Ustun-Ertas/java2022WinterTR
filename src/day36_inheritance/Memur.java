package day36_inheritance;

public class Memur  extends Muhasebe{


    public static void main(String[] args) {

        Memur memur1 = new Memur();
        //memur1 objesi memur class'inin objesi olmasina ragmen
        //inherit ettigi Muhasebe ve onun da Parent'i olan Personel
        //clas'lardaki tum datalari alabilir

        //Personel class'indan
        memur1.persNo=1001;
        memur1.isim="Ahmet";
        memur1.soyisim="Tepecik";
        memur1.adres="Ankara";
        memur1.tel="32456789";

        //Memur class'indan
        memur1.saatUcreti=10;
        memur1.mass= memur1.maasHesapla();
        memur1.statu="Memur";
        System.out.println(memur1);

        Memur memur2 = new Memur();

        memur2.persNo=1002;
        memur2.saatUcreti=10;
        memur2.mass= memur2.maasHesapla();
        System.out.println(memur2);


    }
    @Override
    public String toString() {
        return "Memur{" +
                "saatUcreti=" + saatUcreti +
                ", statu='" + statu + '\'' +
                ", mass=" + mass +
                ", persNo=" + persNo +
                ", isim='" + isim + '\'' +
                ", soyisim='" + soyisim + '\'' +
                ", adres='" + adres + '\'' +
                ", tel='" + tel + '\'' +
                '}';
    }
}
