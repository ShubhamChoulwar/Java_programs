package practise_ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseArrayList {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);


        //using collection reverse
        Collections.reverse(list);
        System.out.println(list);

        //using traditional way
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        List<Integer> list2 = new ArrayList<>();
        for(int i=(list1.size()-1);i>=0;i--){
            list2.add(list1.get(i));
        }
        System.out.println(list2);

        //using java8
        List<Integer> list3 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        List<Integer> listJava8 = list3.stream()
                .sorted(Collections.reverseOrder()).toList();
        System.out.println(listJava8);
    }
}
