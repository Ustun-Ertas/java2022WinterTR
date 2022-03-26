package day24_lists;

import java.util.ArrayList;
import java.util.List;

public class C04_Set {
    public static void main(String[] args) {

        List<String> isimler=new ArrayList<>();
        isimler.add("Aykut");
        isimler.add("Yusuf");
        isimler.add("Ilker");
        isimler.add("Oguzhan");
        System.out.println(isimler); // [Aykut, Yusuf, Ilker

        isimler.set(1,"Seckin");
        System.out.println(isimler);


       //daha onceden listede var olanlari da arsiv gibi tutmak istersek
        List<String>Loglistesi=new ArrayList<>();

        Loglistesi.add(isimler.set(2,"Cosmos"));
        System.out.println(isimler);
        System.out.println(Loglistesi);


    }
}
