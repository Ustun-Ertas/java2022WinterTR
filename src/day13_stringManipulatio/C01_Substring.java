package day13_stringManipulatio;

public class C01_Substring {
    public static void main(String[] args) {

        String str="Java ile IT cok  java";

        System.out.println(str.substring(5));
        System.out.println(str.replace("Java","Mehmet hoca"));

        System.out.println("Mehmet hoca"+str.substring(5));

        System.out.println(str.substring(9));//yazilan index inclusive

        System.out.println(str.substring(0,5));//Java
        System.out.println(str.substring(0,1));
        System.out.println(str.substring(5,6));//bana 6.harfi String olarak bulun

        String harf=str.substring(5,6);
        System.out.println(harf);

        str="Java gun gectikce guzellesiyor";

        System.out.println(str.substring(7,7));//hiclik dondurur

        //System.out.println(str.substring(5,2));//bitis index'i baslangic indexiden kucun olan

        System.out.println(str.substring(str.length()-1));//son harfi verir
        System.out.println(str.substring(str.length()-5));// son 5 harfi yazdiralim
        System.out.println(str.substring(str.length()));

    }
}
