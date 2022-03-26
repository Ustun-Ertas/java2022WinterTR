package day25_Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C06_ArraysDenListOlusturma {

    public static void main(String[] args) {

        //verilen bir array'i listeye cevirin

        String arr[]={"A" , "B" , "C"};

        Arrays.asList(arr);

        List<String>arraydenList = Arrays.asList(arr);
        arraydenList.add("L");
    }
}
