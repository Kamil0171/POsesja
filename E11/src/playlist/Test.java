package playlist;

import java.util.Arrays;

public class Test
{
    public static void main(String[] args)
    {
        Song[] songs =
                {
                        new Song("Stop Breathing", "Playboi Carti", 3),
                        new Song("FE!N", "Travis Scott", 5),
                        new Song("Cale lata", "Taco", 5),
                        new Song("AYE", "Lil Uzi Vert", 2),
                        new Song("Elo benc", "XYZ", 4),
                };

        Arrays.sort(songs, new DurationComparator().thenComparing(new ArtistTitleComparator()));

        for(var element : songs)
        {
            System.out.println(element);
        }
    }
}
