package Iterator;

import java.util.ArrayList;

public class IterationOfCityList {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList();
        cities.add("Mumbai");
        cities.add("Pune");
        cities.add("Sambhaji Nagar");
        cities.add("Nagpur");
        cities.add("Nanded");
        cities.add("Latur");

        // Using for loop
        System.out.println("Using for loop");
        for(int i=0; i<cities.size(); i++){
            System.out.println("For loop:" + cities.get(i));
        }

        // Using for each loop
        System.out.println("Using for each loop");
        for(String city: cities){
            System.out.println("For Each Loop:" + city);
        }

        // Using Iterator
        System.out.println("Using Iterator");
        java.util.Iterator<String> it = cities.iterator();
        while(it.hasNext()){
            System.out.println("Iterator:" + it.next());
        }
    }
}
