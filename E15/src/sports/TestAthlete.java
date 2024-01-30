package sports;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class TestAthlete
{
    public static void main(String[] args) {
        ArrayList<Athlete> athletes = new ArrayList<>();
        athletes.add(new Athlete("asdad", "pilka nozna", 21));
        athletes.add(new Athlete("wsad", "reczna", 12));
        athletes.add(new Athlete("elo", "siatka", 31));
        athletes.add(new Athlete("benc", "lekkoatlektyka", 11));

        Collections.sort(athletes);

        for(Athlete athlete : athletes)
        {
            System.out.println(athlete);
        }
    }
}
