package Collections;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CreateList {

    public static void main(String[] args) {

        /**
         * 1. Create a list of integers and add some elements to it.
         */
        List<Integer> integerList = new ArrayList<>();
        integerList.add(10);
        integerList.add(20);
        integerList.add(30);

        System.out.println("List of integers: " + integerList);

        //Iterate using iterator
        Iterator itr = integerList.iterator();
        System.out.println("Iterate using iterator : " + itr);

        //Iterate using iterator, while,hasNext and next methods
        Iterator itr1 = integerList.iterator();
        while(itr1.hasNext()){
            System.out.println("using while loop : " + itr1.next());
        }

    }

}
