package aviation;

import java.util.Arrays;
import java.util.concurrent.ForkJoinTask;

public class TestPilot {
    public static void main(String[] args) throws CloneNotSupportedException {
        Pilot orginalPilot = new Pilot("Kamil", new double[]{21.3, 213.0, 17.21, 89.21, 74.48});
        Pilot clonedPilot = (Pilot) orginalPilot.clone();
        orginalPilot.checkIndex(2, 100.0);

        System.out.println(Arrays.toString(clonedPilot.getFlightHours()));
        System.out.println(Arrays.toString(orginalPilot.getFlightHours()));
    }
}
