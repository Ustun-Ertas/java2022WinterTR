package day23_multiDimensionalArrays;

public class C02_MDArrays {

    public static void main(String[] args) {


        // verilen multi dimensional array'in tum elementlerinin toplamini bulunuz.


        int arr[][] = {{3, 1, 7}, {6, 10, 2}};
        int toplam =0;
        for (int i = 0; i <arr[0].length+arr[1].length ; i++) {

            toplam+=(arr[0].length+arr[1].length)-1;

        }
        System.out.println(toplam);

    }
    }


