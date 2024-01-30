package travel;

import java.util.Arrays;

public class TravelItemTest {
    public static void main(String[] args) {
        TravelItem[] travel = {
          new TravelItem("Kamil", 70.1, 2.3),
          new TravelItem("Basia", 58.92, 17.1),
          new TravelItem("Tadzio", 59.1, 3.1),
        };

        System.out.println("Przed sortowaniem: ");

        for(TravelItem travelItem : travel){
            System.out.println(travelItem);
        }

        System.out.println("\nPo sortowaniu: ");
        Arrays.sort(travel);

        for(TravelItem travelItem : travel){
            System.out.println(travelItem);
        }
    }
}
