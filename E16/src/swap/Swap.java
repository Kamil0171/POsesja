package swap;

public class Swap
{
    public static <T> void swapElements(T[] tab, int indeks1, int indeks2)
    {
        if(indeks1 < 0 || indeks1 >= tab.length || indeks2 < 0 || indeks2 >= tab.length)
        {
            throw new IllegalArgumentException("Zly indeks");
        }

        T temp = tab[indeks1];
        tab[indeks1] = tab[indeks2];
        tab[indeks2] = temp;
    }
}
