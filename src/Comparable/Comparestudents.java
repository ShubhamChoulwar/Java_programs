package Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 *
 */

public class Comparestudents implements Comparable<Comparestudents> {
    int id;
    String name;

    Comparestudents(int id, String name){
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Comparestudents{" + "id="  + id + ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Comparestudents other) {
        return Integer.compare(this.id, other.id);
    }

    public static void main(String[] args){
       List<Comparestudents> lst = new ArrayList<>();
       lst.add(new Comparestudents(2,"Ball"));
       lst.add(new Comparestudents(1, "Apple"));

        Collections.sort(lst);
        System.out.println("Sorted data");
        for(Comparestudents result : lst){
            System.out.println(result);
        }
    }
}
