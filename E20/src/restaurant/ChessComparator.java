package restaurant;

import java.util.Comparator;

public class ChessComparator implements Comparator<Chef> {
    public int compare(Chef o1, Chef o2) {
        int wynik = Double.compare(o2.getSkillLevel(), o1.getSkillLevel());
        if(wynik == 0){
            return o1.getName().compareTo(o2.getName());
        }else{
            return wynik;
        }
}
}
