package practise_ArrayList;


import java.util.ArrayList;
import java.util.List;

public class ConvertToArray {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        //convert to array
        int[] arr = list.stream()
                .mapToInt(Integer::intValue)
                .toArray();
        System.out.println(arr);
    }
}
