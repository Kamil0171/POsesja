package algorithm;

import java.util.Collection;
import java.util.HashSet;

public class zad4
{
    public static <T> void clearIfContains(Collection<T> collection, T element)
    {
        if(collection == null)
        {
            throw new IllegalAccessError("Nie moze byc nullem");
        }
        if(collection.contains(element))
        {
            collection.clear();
        }
    }

    public static void main(String[] args) {
        HashSet<Double> set = new HashSet<>();
        set.add(1.0);
        set.add(2.0);
        set.add(-13.0);
        System.out.println(set);
        zad4.clearIfContains(set, 2.0);
        System.out.println(set);
    }
}
