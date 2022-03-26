package day20_scope_Arrays;

public class C02_StaticVariables {

       static String okulIsmi="Yildiz Koleji";
       static int okulNo;
       static boolean okulAcikMi;


    public static void main(String[] args) {


        System.out.println(okulIsmi);// Yildiz koleji
        System.out.println(okulNo);// 0 yazdirir

        okulNo=102;
        System.out.println(okulNo);//102 yazdirir
        System.out.println(okulAcikMi);// false yazdirir

        staticMethod();
        System.out.println(okulNo);

    }

    public static void staticMethod(){

        okulNo=200;
        System.out.println(okulNo);
    }

}
