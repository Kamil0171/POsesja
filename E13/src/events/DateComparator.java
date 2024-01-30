package events;

import java.util.Comparator;

public class DateComparator implements Comparator<CulturalEvent> {
    @Override
    public int compare(CulturalEvent o1, CulturalEvent o2) {
        return Integer.compare(o1.getDate().length(), o2.getDate().length());
    }
}
