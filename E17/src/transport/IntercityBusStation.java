package transport;

import java.util.ArrayList;
import java.util.Objects;

public class IntercityBusStation extends BusStation
{
    private int numberOfPlatforms;

    public IntercityBusStation(String name, String city, ArrayList<String> buses, int numberOfPlatforms)
    {
        super(name, city, buses);
        this.numberOfPlatforms = numberOfPlatforms;
    }

    public int getNumberOfPlatforms() {
        return numberOfPlatforms;
    }

    public void setNumberOfPlatforms(int numberOfPlatforms) {
        this.numberOfPlatforms = numberOfPlatforms;
    }

    @Override
    public String toString() {
        return "name: " + getName() + " city: " + getCity() + " buses: " + getBuses() + "numberOfPlatforms: " + numberOfPlatforms;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof IntercityBusStation that)) return false;
        if (!super.equals(o)) return false;
        return numberOfPlatforms == that.numberOfPlatforms;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), numberOfPlatforms);
    }
}
