package transport;

import java.util.ArrayList;

public class TestBusStation {
    public static void main(String[] args) {
        BusStation busStation = new BusStation("Main Station", "City A", new ArrayList<>());
        busStation.addBus("Bus A");
        busStation.addBus("Bus B");
        System.out.println(busStation);
        busStation.removeBus("Bus A");
        System.out.println(busStation);

        IntercityBusStation intercityBusStation = new IntercityBusStation("Elo", "Olsztyn", busStation.getBuses(), 2);
        intercityBusStation.addBus("InterA");
        intercityBusStation.addBus("InterB");
        System.out.println(intercityBusStation);
        intercityBusStation.removeBus("InterB");
        System.out.println(intercityBusStation);
    }
}
