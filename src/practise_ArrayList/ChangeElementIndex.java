package practise_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ChangeElementIndex {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println(list);

        //change index of 20 from 1 to 3- using collection property
        Collections.swap(list,1,3);
        System.out.println(list);

        //change index of 20 from 0 to 2- normal way-
        // input we are not sure what value will come in index 2 so how we will develop code.
        int number0 = list.remove(0);
        int number2 = list.remove(2);
        list.add(2, number0);
        list.add(0, number2);
        System.out.println(list);

        //requirement like in input we get 10 but not sure on which index so find the index of 10 then
        //bring to last index
        List<Integer> list1 = Arrays.asList(30,10,20,100);
        System.out.println(list1);
        if(list1.contains(10)){
            list1.set(list1.indexOf(10), list1.get(list1.size()-1));
            list1.set(list1.size()-1,10);
            System.out.println(list1);
        } else{
            System.out.println("no such element found....");
        }
    }
}
