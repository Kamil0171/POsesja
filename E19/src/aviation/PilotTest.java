package aviation;

import java.util.ArrayList;

public class PilotTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        ArrayList<Double> lista = new ArrayList<>();
        lista.add(2.3);
        lista.add(42.1);
        lista.add(17.3);

        Pilot orginalPilot = new Pilot("Kamil", lista);
        Pilot clonedPilot = (Pilot) orginalPilot.clone();

        orginalPilot.changeIndex(2,3.1);;

        System.out.println(clonedPilot.getFlightHours());
        System.out.println(orginalPilot.getFlightHours());
    }
}
