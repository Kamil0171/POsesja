package events;

import java.util.Comparator;

public class NameComparator implements Comparator<CulturalEvent> {
    @Override
    public int compare(CulturalEvent o1, CulturalEvent o2) {
        return Integer.compare(o2.getName().length(), o1.getName().length());
    }
}
