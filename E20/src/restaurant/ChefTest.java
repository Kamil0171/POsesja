package restaurant;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class ChefTest {
    public static void main(String[] args) {
        ArrayList<Chef> lista = new ArrayList<>();
        lista.add(new Chef(1, "Kamil", 23));
        lista.add(new Chef(2, "Tomasz", 12));
        lista.add(new Chef(3, "Szymon", 17));
        lista.add(new Chef(4, "Dawid", 42));
        lista.add(new Chef(5, "Piotr", 62));

        System.out.println("Przed sortowaniem: ");

        for(Chef chef : lista){
            System.out.println(chef);
        }

        System.out.println("\nPo sortowaniu: ");

        Collections.sort(lista, new ChessComparator());

        for(Chef chef : lista){
            System.out.println(chef);
        }
    }
}
