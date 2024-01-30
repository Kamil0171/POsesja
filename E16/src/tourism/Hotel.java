package tourism;

public class Hotel implements Cloneable
{
    private String name;
    private double capacity;

    public Hotel(String name, double capacity)
    {
        if(name == null)
        {
            this.name = "";
        }
        else
        {
            this.name = name;
        }

        if(capacity > 0.0)
        {
            this.capacity = capacity;
        }
        else
        {
            this.capacity = 50.0;
        }
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "name='" + name + '\'' +
                ", capacity=" + capacity +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public void zmienNazwe(String name)
    {
        this.name = name;
    }
}
