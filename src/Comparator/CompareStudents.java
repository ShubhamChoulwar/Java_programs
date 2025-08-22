package Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CompareStudents {
    int id;
    String name;

    public CompareStudents(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "CompareStudents{" + "id=" + id + ", name='" + name + '\'' +  '}';
    }

    public static void main(String[] args){

        List<CompareStudents> lst = new ArrayList<>();
        lst.add(new CompareStudents(2, "Shubham"));
        lst.add(new CompareStudents(1,"Apple"));

        Collections.sort(lst,new CompareByComparator());
        System.out.println("Sorted result with comparator/custom sorting");
        for(CompareStudents result : lst){
            System.out.println(lst);
        }
    }
}
