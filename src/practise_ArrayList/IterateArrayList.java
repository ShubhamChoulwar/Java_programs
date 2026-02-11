package practise_ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IterateArrayList {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);

        //for loop - index access, fast but not useful for linkedlist,
        // can not remove element will get ConcurrentModificationException at runtime
        for(int i=0;i<list.size();i++){
              System.out.println(list.get(i));
        }

        //enhanced for each loop - ideal iteration no index access
        // can not remove element will get ConcurrentModificationException at runtime
        for(int num : list){
            System.out.println(num);
        }

        //using Iterator  - Best choice if you want to remove elements safely but works well for all type of list
        Iterator<Integer> iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        //remove element only using Iterator with remove() function
        Iterator<Integer> iterator1 = list.iterator();
        while(iterator1.hasNext()){
            Integer num1 = iterator1.next();
            if (num1 == 3){
                iterator1.remove();  //this is safe method of element removing
            }
        }




    }
}
