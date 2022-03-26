package day02_variables;

public class C01_Variables {
    public static void main(String[] args) {

        // bir varibale olustururken icerisinden datanin alabilcegi degerlere uygun
        // bir data turu secmeliyiz
        //ornegin bir sehrin nufusundan bahsediyorsak
        // variable mizin data turu string , boolean , char veya doublu olamaz
        //geriye kalan tamsayi turlerden sehrin nufusu icine alabilecek buyuklukte bir data duru secmeliyiz
        //biz kurs boyunca genelde tam sailar icin int, ondalikli sayilar icin daouble kullanacagiz

        System.out.println("Hello World yazdiran Javayi halleder");

        int level = 1;

        System.out.println(level);

        boolean ogrenciMi= true;
        boolean yagisVarMi=false;

        System.out.println(ogrenciMi);

        System.out.println(yagisVarMi);

        char ozelSembol='$';
        char sayi='2';
        char harf= 'K';

        System.out.println(harf);

        System.out.println(ozelSembol);

        System.out.println(sayi);
    }

}



