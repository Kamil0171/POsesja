package transport;

import org.w3c.dom.ls.LSOutput;

public class TestBusRoute
{
    public static void main(String[] args) {
        BusRoute busRoute1 = new BusRoute("A123", "Lotnisko", "Stare miasto");
        BusRoute busRoute2= new BusRoute("B32", "Port", "Dom");

        System.out.println(busRoute1);
        busRoute1.printDetails();
        busRoute1.isLongRoute();

        System.out.println();

        System.out.println(busRoute2);
        busRoute2.printDetails();
        busRoute2.isLongRoute();
    }
}
