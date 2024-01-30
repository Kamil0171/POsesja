package comparisons;

public class zad3 {
    public static <T extends Comparable<T>> boolean isFirstLargest(T obiekt1, T obiekt2, T obiekt3){
        if(obiekt1.compareTo(obiekt2) > 0 && obiekt1.compareTo(obiekt3) > 0){
            return true;
        }else{
            return false;
        }
    }
}
