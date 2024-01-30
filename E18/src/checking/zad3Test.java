package checking;

import static checking.zad3.containsDuplicates;

public class zad3Test {
    public static void main(String[] args) {
        String s1 = "Siema";
        String s2 = "Elobenc";
        String s3 = "Siema";

        boolean wynik = containsDuplicates(s1,s2,s3);
        System.out.println(wynik);
    }
}
