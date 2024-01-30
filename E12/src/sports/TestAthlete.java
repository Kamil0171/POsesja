package sports;

import java.util.Arrays;

public class TestAthlete
{
    public static void main(String[] args)
    {
        Athlete[] athletes = {
          new Athlete("Kamil", "Poland", new double[]{2.1, 42.1}),
          new Athlete("Tomasz", "Kandada", new double[]{5.2, 17.4}),
          new Athlete("Agnieszka", "USA", new double[]{0.0, 91.1}),
          new Athlete("Jarek", "Wlochy", new double[]{2.1, 3.7}),
          new Athlete("Basia", "", new double[]{0.0, 0.0}),
        };

        System.out.println("Przed sortowaniem\n");

        for(Athlete athlete : athletes)
        {
            System.out.println(athlete);
        }

        System.out.println("\nPo sortowaniu\n");

        Arrays.sort(athletes, new RecordComparator().thenComparing(new NationalityNameComparator()));

        for(Athlete athlete : athletes)
        {
            System.out.println(athlete);
        }
    }
}
