package day20_scope_Arrays;

public class C01_Scope {


    int sayi;
    String okulIsmi="Yildiz Koleji";
    boolean okulAcikMi;

    public static void main(String[] args) {

        //sayi=10; sayi variable  static olmadigi icin main method dan direk kullanilamaz
        //instance variable lara static methodlardan ulasabilmek icin obje olusturmamiz gerekir

        C01_Scope obj=new C01_Scope();
        System.out.println(obj.sayi);
        obj.sayi=10;
        System.out.println();


    }
}
