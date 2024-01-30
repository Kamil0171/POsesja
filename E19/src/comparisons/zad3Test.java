package comparisons;

import static comparisons.zad3.isFirstLargest;

public class zad3Test {
    public static void main(String[] args) {
        Integer i1 = 5;
        Integer i2 = 3;
        Integer i3 = 2;

        boolean wynik = isFirstLargest(i1,i2,i3);

        System.out.println(wynik);
    }
}