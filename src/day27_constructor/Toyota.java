package day27_constructor;

public class Toyota {
    String marka="Toyota";
    int tekerAdedi=4;
    boolean motoruVarMi=true;
    String model;
    String yakit;
    int yil;

    public void maxHiz(){

        if (yakit.equals("Benzin")){
            System.out.println("Benzinli araclarin max hizi 240 dir");

        } else if (yakit.equals("Dizel")){

            System.out.println("Dizel araclarin max hizi 120 dir");
        }
    }


}
