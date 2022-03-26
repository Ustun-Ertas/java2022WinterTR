package day25_lists;

import java.util.ArrayList;
import java.util.List;

public class C03_ListdenElementIstenmeyenSilme {


    public static void main(String[] args) {

        // verilen bir Arraydan istenen elementi silip,
        // kalanlari yeni bir array olarak yazdiran bir method olusturun


        int arr[]={3,4,2,3,5,7,3,8,5,2,4};
        int istenmeyenElaman=7;


        istemeyenElementiSilveYazdir(arr,istenmeyenElaman);


    }

    public static void istemeyenElementiSilveYazdir(int[] arr, int istenmeyenElaman) {

        List<Integer>yeniList = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]!=istenmeyenElaman);


            yeniList.add(arr[i]);
        }
        System.out.println(yeniList);
    }

}

