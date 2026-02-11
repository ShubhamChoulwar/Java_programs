package practise_ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindMaxAndMinElement {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(10);


        //using collections max and min function
        int max = Collections.max(list);
        int min = Collections.min(list);
        System.out.println(max);
        System.out.println(min);

        //using traditional way
        int min1=list.get(list.size()-1);
        int max1=list.get(list.size()-1);

        for(int num:list){
            if(num<min1){
                min1=num;
            }else if(num>max1){
                max1=num;
            }
        }
        System.out.println(min1);
        System.out.println(max1);

        //using java8
        int max2 = list.stream()
                .max(Integer::compareTo)
                .get();

        int min2 = list.stream()
                .min(Integer::compareTo)
                .get();

        System.out.println(max2);
        System.out.println(min2);

    }
}
