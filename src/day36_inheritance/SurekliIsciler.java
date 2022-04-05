package day36_inheritance;

public class SurekliIsciler  extends Isci{



    public static void main(String[] args) {

        SurekliIsciler surcIc1 = new SurekliIsciler();


        surcIc1.persNo=501;
        surcIc1.isim="Cem";
        surcIc1.soyisim="Akay";
        surcIc1.statu="Isci";
        surcIc1.saatUcreti=11;
        surcIc1.mass= surcIc1.maasHesapla();
        System.out.println(surcIc1);


    }
    @Override
    public String toString() {
        return "SurekliIsciler{" +
                "isciStatu='" + isciStatu + '\'' +
                ", \nsaatUcreti=" + saatUcreti +
                ", \nstatu='" + statu + '\'' +
                ", \nmass=" + mass +
                ", \npersNo=" + persNo +
                ", \nisim='" + isim + '\'' +
                ", \nsoyisim='" + soyisim + '\'' +
                ", \nadres='" + adres + '\'' +
                ", \ntel='" + tel + '\'' +
                '}';
    }
}
