package arrayAlg;

public class ArrayAlg {
    public static <T extends Comparable<T>> int findMaxIndex(T[] tab){
        if(tab == null || tab.length == 0){
            throw new IllegalArgumentException("Tablica jest null albo pusta");
        }

        int max=0;
        for(int i = 0; i < tab.length; i++){
            if(tab[i].compareTo(tab[max]) > 0){
                max = i;
            }
        }
        return max;
    }
}
