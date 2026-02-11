package practise_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class RemoveAllEleFrmAnthrList {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        List<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(200);
        list1.add(300);
        list1.add(400);

        //based on 2 lists, removeAll matches the elements from both list if any matching then that element get removed from left hand list that is "list"
        //if no match then it will false.
        //System.out.println(list.removeAll(list1));
        System.out.println(list);

        //using java8 - stream() but this will give concurrentModificationException as stream are read only.
        list.stream().filter(e -> list1.contains(e))
                .forEach(e ->list.remove(e));
        System.out.println(list);

        //using java8-.removeIf
        list.removeIf(e -> list1.contains(e));
        System.out.println(list);
    }
}
