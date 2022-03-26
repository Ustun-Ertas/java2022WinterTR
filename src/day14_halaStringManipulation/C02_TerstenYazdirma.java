package day14_halaStringManipulation;

public class C02_TerstenYazdirma {
    public static void main(String[] args) {
        //Soru 5) Kullanicidan 4 harfli bir kelime isteyin
        // ve girilen kelimeyi ilk harfi buyuk,
        // digerleri kucuk olarak tersten yazdirin.

        String imput = "Lale";

        String tersStr=imput.substring(3).toUpperCase()
                         +imput.substring(2,3).toLowerCase()
                         +imput.substring(1,2).toLowerCase()
                         +imput.substring(0,1).toLowerCase();

        System.out.println(tersStr);

    }
}
