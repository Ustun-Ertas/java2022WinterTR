package day10_swicth_StriingManipulation;

public class C04_charAt {
    public static void main(String[] args) {

        String str="Java Cok Guzel";

        System.out.println(str.charAt(0));

        // G yi yazdiralim

        System.out.println(str.charAt(8));
        //va yazdiralim

        System.out.println(str.charAt(2)+str.charAt(3));
        //va cok seklinde yazdiralim

        System.out.println(str.toUpperCase().charAt(5)+""+str.toUpperCase()
                .charAt(6)+str.toUpperCase().charAt(7));

        //String'de 14 harf var, son harfin indexi 14-1
        System.out.println(str.charAt(14-1));//uzunluk-1

        System.out.println(str.charAt(14));
    }

}
