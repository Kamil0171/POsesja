package checking;

public class zad3
{
    public static <T> boolean isEqualOrNull(T obiekt1, T obiekt2)
    {
        if(obiekt1 == obiekt2)
        {
            return true;
        }
        else if(obiekt1 == null || obiekt2 == null)
        {
            return false;
        }
        else
        {
            return obiekt1.equals(obiekt2);
        }
    }
}
