package day18_nestedForLoop;

public class C07_WhileLoop {
    public static void main(String[] args) {

        //kullanicidan iki tam sayi alip bu sayilari ve aralarindaki tum tam sayilari yazdiran bir kod olusturun


        int baslangic=40;
        int bitis= 60;

        for (int i = baslangic; i <=bitis; i++) {

            System.out.print(i+ " ");
        }
        System.out.println("");

         //ayni soruyu While Loop ile cozumu

        int i=baslangic;
        while (baslangic<=bitis) {

            System.out.print(baslangic+ " ");
            baslangic++;
        }
        System.out.println("");
        System.out.println(baslangic);
    }

}
