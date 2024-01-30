package events;

import java.util.ArrayList;
import java.util.Collections;

public class Test {
    public static void main(String[] args) {
        ArrayList<CulturalEvent> lista = new ArrayList<>();
        lista.add(new CulturalEvent(1, "Kamil", "2023"));
        lista.add(new CulturalEvent(2, "Basia", "1999"));
        lista.add(new CulturalEvent(3, "Asia", "2003"));
        lista.add(new CulturalEvent(4, "Tosia", "2023"));
        lista.add(new CulturalEvent(5, "Hubert", "2005"));

        System.out.println("Przed sortowaniem: ");

        for(CulturalEvent culturalEvent : lista){
            System.out.println(culturalEvent);
        }

        System.out.println("\nPo sortowaniu: ");

        Collections.sort(lista, new DateComparator().thenComparing(new NameComparator()));

        for(CulturalEvent culturalEvent : lista){
            System.out.println(culturalEvent);
        }
    }
}
