package day38_inheritance_overriding;

import day36_inheritance.UstaBasi;

public class Ustabasi extends Isci {

    String statu="Ustabasi";
    String haklar="Ustabasi haftada birgun ekstra tatil hakkina sahiptir";


    public void mesai(){

        System.out.println("Ariza varsa Ustabasi ekstra ucret almadan calisir");

    }
    public void MaasHesapla(){

        System.out.println("Tum personel 30 gun * 8 saat * 12 euro =" + (30*8*12) + "Euro maas");
    }

    public static void main(String[] args) {
       /*
       icinde oldugumuz classin klasik halile ile bir obje olusturursak o obje ile cagirdigimiz
       variable ve method'larda java once icinde bulundugumuz  class'a bakar
       aradigimiz clas uyesi, icinde oldugumuz class'da varsa bize onu getirir.
       YOKSA,
       parent class'lara bakar, ilk buldugunu getirir.

        */

        Ustabasi yasin=new Ustabasi();
        System.out.println(yasin.statu);//Ustabasi
        System.out.println(yasin.haklar);//Ustabasi haftada birgun ekstra tatil hakkina sahiptir

        /*
        Eger isci olarak ozellikleri gormek istersek
        Class adini (Data Turu) Isci seceriz

         */

        Isci ahmet=new Ustabasi();
        System.out.println(ahmet.statu);//Isci
        System.out.println(ahmet.haklar);//Isciler kidem tazminati alirlar
        System.out.println(ahmet.ikramiye);//Isciler yilda bir ikramiye alir
        System.out.println(ahmet.izin);//Tum personeler yilda 4 kere izin kullanabilir



    }

}


