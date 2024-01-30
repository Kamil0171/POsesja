package sports;

import java.util.Comparator;

public class NationalityNameComparator implements Comparator<Athlete>
{
    @Override
    public int compare(Athlete o1, Athlete o2)
    {
        int wynik = o2.getNationality().compareTo(o1.getNationality());

        if(wynik != 0)
        {
            return wynik;
        }
        else
        {
            return o1.getName().compareTo(o2.getName());
        }
    }
}
