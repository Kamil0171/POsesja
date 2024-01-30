package transport;

public record BusRoute(String routeNumber, String startLocation, String endLocation)
{
    public BusRoute
    {
        if(routeNumber == null || routeNumber.isEmpty()) {
            throw new IllegalArgumentException("Brak numeru trasy autobusowej");
        }
    }

    public boolean isLongRoute()
    {
        if(routeNumber.length() > 4)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public void printDetails()
    {
        System.out.println("Numer trasy: " + routeNumber);
        System.out.println("Punkt poczatkowy: " + startLocation);
        System.out.println("Punkt koncowy: " + endLocation);
    }
}
