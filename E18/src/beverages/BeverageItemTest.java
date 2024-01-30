package beverages;

import java.util.ArrayList;
import java.util.Collections;

public class BeverageItemTest {
    public static void main(String[] args) {
        ArrayList<BeverageItem> beverages = new ArrayList<>();
        beverages.add(new BeverageItem("Kamil", 23.1, 42.1));
        beverages.add(new BeverageItem("Asia", 17.7, 2.1));
        beverages.add(new BeverageItem("Oliwia", 121.2, 52.1));
        beverages.add(new BeverageItem("Tadeusz", 42.1, 13.3));

        System.out.println("Przed sortowaniem: ");

        for(BeverageItem beverageItem : beverages){
            System.out.println(beverageItem);
        }

        Collections.sort(beverages);

        System.out.println("\nPo sortowaniu: ");

        for(BeverageItem beverageItem : beverages){
            System.out.println(beverageItem);
        }
    }
}
