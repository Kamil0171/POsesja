package music;

import java.util.Comparator;

public class ArtistTitleComparator implements Comparator<Song>
{
    @Override
    public int compare(Song o1, Song o2) {
        int wynik = o1.getArtist().compareTo(o2.getArtist());

        if(wynik == 0)
        {
            return o1.getTitle().compareTo(o2.getTitle());
        }
        else
        {
            return wynik;
        }
    }
}
