package healthcare;

import java.util.Objects;

public class Clinic extends Hospital
{
    private double rating;

    public Clinic(String name, double capacity, double rating)
    {
        super(name, capacity);

        if(rating >= 0.0 && rating <= 5.0)
        {
            this.rating = rating;
        }
        else
        {
            this.rating = 3.0;
        }
    }

    public double getRating()
    {
        return rating;
    }

    public void setRating(double rating)
    {
        if(rating >= 0.0 && rating <= 5.0)
        {
            this.rating = rating;
        }
        else
        {
            this.rating = 3.0;
        }
    }

    @Override
    public String toString()
    {
        if(getName() == "")
        {
            return "[Hospital]: " + "Capacity: " + "[" + getCapacity() + "]." + "\n" + "Rating: " + "[" + rating + "].";
        }
        else
        {
            return "[Hospital]:" + " Name: " + getName() + ". " + "Capacity: " + "[" + getCapacity() + "]." + "\n" + "Rating: " + "[" + rating + "].";
        }
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (!(o instanceof Clinic clinic)) return false;
        if (!super.equals(o)) return false;
        return Double.compare(rating, clinic.rating) == 0;
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(super.hashCode(), rating);
    }
}
