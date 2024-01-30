package checking;

public class zad3 {
    public static <T> boolean containsDuplicates(T obiek1, T obiekt2, T obiekt3){
        if(obiek1.equals(obiekt2) || obiek1.equals(obiekt3) || obiekt2.equals(obiekt3)){
            return true;
        }else{
            return false;
        }
    }
}
