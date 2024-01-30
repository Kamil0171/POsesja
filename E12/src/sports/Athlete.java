package sports;

import java.util.Arrays;

public class Athlete
{
    public String name;
    public String nationality;
    public double[] records;

    public Athlete(String name, String nationality, double[] records)
    {
        this.name = name;
        this.nationality = nationality;
        this.records = records;
    }

    public String getName() {
        return name;
    }

    public String getNationality() {
        return nationality;
    }

    public double[] getRecords() {
        return records;
    }

    @Override
    public String toString() {
        return "Athlete{" +
                "name='" + name + '\'' +
                ", nationality='" + nationality + '\'' +
                ", records=" + Arrays.toString(records) +
                '}';
    }
}
