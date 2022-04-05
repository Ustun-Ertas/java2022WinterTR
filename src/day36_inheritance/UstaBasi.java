package day36_inheritance;

public class UstaBasi extends Isci{


    public static void main(String[] args) {
        UstaBasi ustbas1= new UstaBasi();

        ustbas1.saatUcreti=15;
        ustbas1.isim="Murat";
        ustbas1.soyisim="Gokcek";
        ustbas1.mass= ustbas1.maasHesapla();
        ustbas1.statu="Isci";
        System.out.println(ustbas1);

    }

    @Override
    public String toString() {
        return "UstaBasi{" +
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
