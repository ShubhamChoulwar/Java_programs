package practise_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class FindSizeAndEmpty {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        //find list size
        System.out.println(list.size());

        //find if list is empty or not
        System.out.println(list.isEmpty());
    }

}
