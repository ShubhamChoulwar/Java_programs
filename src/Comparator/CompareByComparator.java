package Comparator;

import java.util.Comparator;

public class CompareByComparator implements Comparator<CompareStudents> {

    @Override
    public int compare(CompareStudents o1, CompareStudents o2) {
          return o1.name.compareTo(o2.name);
    }
}
