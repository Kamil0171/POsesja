package utilities;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class zad3
{
    public static <E> void appendFromEnd(List<String> destination, List<String> source)
    {
        for(int i = source.size() - 1; i >= 0; i--)
        {
            destination.add(source.get(i));
        }
    }

    public static void main(String[] args)
    {
        List<String> destinationList = new ArrayList<>();
        List<String> sourceList = List.of("A", "B", "C");

        System.out.println("Przed:");
        System.out.println(destinationList);
        System.out.println(sourceList);

        appendFromEnd(destinationList, sourceList);

        System.out.println("Po");
        System.out.println(destinationList);
        System.out.println(sourceList);
    }
}
