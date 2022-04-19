package day47_linkedList;

import java.util.LinkedList;
import java.util.Scanner;

public class Q04 {

    /*  TASK:
			 		Node'larin değereleri; "haluk" "ipek" "harun" "irem" olan bir LinkedList olusturun
			 		Kullanicidan bir isim alin o isim LinkedList'de varsa silin ve kullaniciya
			    	"Bu isim LinkedList'de vardi ve silindi" diye mesaj verin
			 		Girilen isim yoksa "Bu isim LinkedList'de yok bu yuzden silinemedi" diye mesaj verin

			 */

    public static void main(String[] args) {


        LinkedList<String> isimList = new LinkedList<>();
        isimList.add("haluk");
        isimList.add("ipek");
        isimList.add("harun");
        isimList.add("irem");

        Scanner scan = new Scanner(System.in);
        System.out.print("isim giriniz: ");
        String str = scan.nextLine().toLowerCase();

        if (isimList.remove(str)) {
            System.out.println(str + " bulundu ve silindi.");
        } else
            System.out.println(str + " bulunamadı.");

        System.out.println("yeni liste : " + isimList);
    }
}

