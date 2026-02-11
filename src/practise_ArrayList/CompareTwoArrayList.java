package practise_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class CompareTwoArrayList {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        List<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);

        System.out.println(list.equals(list1));
        System.out.println(list == list1);

        List<String> list2 = new ArrayList<>();
        list2.add("shubham");
        list2.add("choulwar");

        List<String> list3 = new ArrayList<>();
        list3.add("shubham");
        list3.add("choulwar");

        System.out.println(list2.equals(list3));
        System.out.println(list2 == list3);
    }
}
