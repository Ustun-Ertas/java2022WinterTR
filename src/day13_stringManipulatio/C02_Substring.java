package day13_stringManipulatio;

public class C02_Substring {
    public static void main(String[] args) {

        String str = "1-48 of 104 results for \"nutella\"";

        int ilkSpace = str.indexOf(" ");
        int ikinciSpace = str.indexOf(" ", ilkSpace + 1);
        int ucuncuSpace = str.indexOf(" ", ikinciSpace + 1);

     String aramaSonucSayisiStr=str.substring(ikinciSpace+ucuncuSpace);
     int aramaSonucSayisiInt=Integer.valueOf(aramaSonucSayisiStr);


     if (aramaSonucSayisiInt>100){

         System.out.println("Super");

     }else{

         System.out.println("az sonuc bulundu");
     }



    }

}

