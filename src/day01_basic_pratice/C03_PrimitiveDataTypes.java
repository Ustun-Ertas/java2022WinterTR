package day01_basic_pratice;

public class C03_PrimitiveDataTypes {
    public static void main(String[] args) {
        /*
         * Primitive data type
                byte: only takes whole numbers
                short: only takes whole numbers
                int(used more often): only takes whole numbers
                long: only takes whole numbers
                float: can take decimals (MUST have F or f at the end)
                double( used more often): can take decimals
                boolean: true or false boolean expressions
                char: character within single quote ''
                        also takes number
         * Range: double > float >long > int >short > byte
         */
        //byte, short, integer,long, double, float veri tiplerinin max ve min degerlerini yazdiralim.

        byte byteMax=Byte.MAX_VALUE;
        System.out.println("byteMax=" + byteMax);
        byte byteMin=Byte.MIN_VALUE;
        System.out.println("byeMin=" + byteMin);

        short shortMax=Short.MAX_VALUE;
        System.out.println("shortMax=" + shortMax);
        short shortMin=Short.MIN_VALUE;
        System.out.println("shortMin=" + shortMin);

        int intMax=Integer.MAX_VALUE;
        System.out.println("intMax=" + intMax);
        int intMinMax=Integer.MIN_VALUE;
        System.out.println("inMin="+ intMinMax);

        long longMin=Long.MIN_VALUE;
        System.out.println("longMin=" + longMin);
        long longMax=Long.MAX_VALUE;
        System.out.println("longMax=" +longMax);

        float floatMin=Float.MIN_VALUE;
        System.out.println("floatMin="+ floatMin);
        float floatMax=Float.MAX_VALUE;
        System.out.println("floatMix=" + floatMax);

        double doubleMin=Double.MIN_VALUE;
        System.out.println("doubleMin = " + doubleMin);
        double doubleMax=Double.MAX_VALUE;
        System.out.println("doubleMax = " + doubleMax);



        //Her veri turuyle bir tane olmak uzere 4 degisken olusturun (float, double, char, boolean)
        //Degiskenler icin anlamli isimler kullanip, yazdiralim

        float latpFiyati= 999.99F;
        double kilometre= 579.6;
        char cinsiyte= 'E';
        boolean dogruMu= true;

        System.out.println(latpFiyati);
        System.out.println(kilometre);
        System.out.println(cinsiyte);
        System.out.println(dogruMu);


    }
}
