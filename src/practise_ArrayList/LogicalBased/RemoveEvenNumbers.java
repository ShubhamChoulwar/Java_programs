package practise_ArrayList.LogicalBased;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RemoveEvenNumbers {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);

        //traditional way- in for loop we will not be able to remove element so we can use Iterator
        Iterator<Integer> itr =  list1.iterator();
        while(itr.hasNext()){
            if(itr.next() % 2 == 0){
                itr.remove();
            }
        }

        //using java8
        list1.removeIf(i -> i % 2 == 0);

        //another java8
        list1.stream().filter(e -> e % 2 != 0).forEach(System.out::println);
    }
}
