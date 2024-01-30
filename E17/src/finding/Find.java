package finding;

public class Find
{
    public static void main(String[] args) {
        Integer[] integers = {null, 4, 6, 10, null};
        Integer wynik = Find.findFirstNonNull(integers);
        System.out.println(wynik);
    }

    public static <T> T findFirstNonNull(T[] tab)
    {
        for(T element : tab)
        {
            if(element != null)
            {
                return element;
            }
        }
        return null;
    }
}
