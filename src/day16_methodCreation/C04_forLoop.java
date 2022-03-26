package day16_methodCreation;

public class C04_forLoop {
    public static void main(String[] args) {

        //verilen stringi tersten yazdiraln bir kod yaziniz

        String str="Ustun";


        for (int i =str.length() -1; i >=0; i--) {
            System.out.print(str.substring(i,i+1)); //Hocaya soralim

        }
    }
}
