package practise_ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateEle {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(2);
        list.add(3);

        //traditional way
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for(int num:list){
            if(!list1.contains(num)){
               list1.add(num);
            } else {
                list2.add(num);
            }
        }
        System.out.println(list1);
        System.out.println(list2);

        //using java8
        List<Integer> list3 = new ArrayList<>();
        list3.add(1);
        list3.add(2);
        list3.add(3);
        list3.add(4);
        list3.add(2);
        list3.add(3);
        List<Integer> result = list3.stream().distinct().toList();
        System.out.println(result);





    }
}
