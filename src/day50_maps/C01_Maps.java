package day50_maps;

import day49_maps.MapOlustur;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class C01_Maps {
    public static void main(String[] args) {

        //siniftaki ogrenci listesini duzenli olarak yazdiralim

        Map<Integer,String> sinifList= MapOlustur.myMap();
        System.out.println(sinifList);
        Set<Integer> sinifKeySeti= sinifList.keySet();

        List<Integer> keyList= new ArrayList<>();

         /* Eger key'lere tek tek ulasmak istersek
           index yapisina ihtiyacimiz var
           ancak map index yapisini desteklemez
           bunun icin key'leri once bir set'e
           sonra da set'in tum elementlerini bir list'e ekledik
         */

        for (Integer each: sinifKeySeti
             ) {
            keyList.addAll(sinifKeySeti);
            System.out.println(keyList.get(0));

        }
    }
}
