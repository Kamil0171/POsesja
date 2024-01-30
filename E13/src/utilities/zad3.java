package utilities;

import java.util.Comparator;

public class zad3
{
    public static <T extends Comparable<T>> T findMin(T o1, T o2, T o3)
    {
        if(o1.compareTo(o2) <= 0 && o1.compareTo(o3) <= 0)
        {
            return o1;
        }
        else if (o2.compareTo(o1) <= 0 && o2.compareTo(o3) <= 0)
        {
            return o2;
        }
        else
        {
            return o3;
        }
    }

    public static void main(String[] args) {
        Integer min = findMin(61,4,17);
        System.out.println(min);
    }
}
