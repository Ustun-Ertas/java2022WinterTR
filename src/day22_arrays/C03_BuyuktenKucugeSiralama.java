package day22_arrays;

import java.util.Arrays;

public class C03_BuyuktenKucugeSiralama {
    public static void main(String[] args) {

        int arr[]={3,5,6,1,9,45,25,9,4,0,};

        tertensiralaYazdir(arr);


    }

    public static void tertensiralaYazdir(int[]arr) {

        Arrays.sort(arr);
        int tersArr[]=new int[arr.length];

        for (int i = 0; i <arr.length; i++) {

            tersArr[i] = arr[arr.length -1-i];



        }
        System.out.println(Arrays.toString(tersArr));
    }
}
