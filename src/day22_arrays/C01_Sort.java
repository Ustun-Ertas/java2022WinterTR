package day22_arrays;

import java.util.Arrays;

public class C01_Sort {
    public static void main(String[] args) {

        String arr[] ={"S","M","A","T"};
        System.out.println(Arrays.toString(arr));// [s, M, A, T]

        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr)); //[A, M, T, s]
        //javada bu siralamaya natural order denir
        //sayi olursa kucuken buyiye, metin olursa alfabetik siralama gore

    }
}
