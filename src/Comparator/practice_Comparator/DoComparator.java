package Comparator.practice_Comparator;

import java.util.Comparator;

public class DoComparator implements Comparator<CityNames> {
    @Override
    public int compare(CityNames o1, CityNames o2) {
        return o1.name.compareTo(o2.name);
    }
}
