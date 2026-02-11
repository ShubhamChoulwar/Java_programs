package practise_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class RemoveByValueByIndex {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        //remove by index
        list.remove(2);
        System.out.println(list);

        //remove by value
        list.remove(Integer.valueOf(2));
        System.out.println(list);

    }
}
