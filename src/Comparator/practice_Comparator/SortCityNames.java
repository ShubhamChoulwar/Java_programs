package Comparator.practice_Comparator;

import javax.swing.*;
import java.util.*;

public class SortCityNames {

    public static void main(String[] args) {
      List<CityNames> lst = Arrays.asList(
              new CityNames(1,"Pune"),
              new CityNames(2,"Mumbai"),
              new CityNames(3, "Banglore")
      );

        Collections.sort(lst,new DoComparator());
        System.out.println(lst);


    }
}
