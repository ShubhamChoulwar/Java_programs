package practise_ArrayList.LogicalBased;

import java.util.ArrayList;
import java.util.List;

public class FindMissingNumber {
    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(4);

        //traditional way
        int missingNum=-1;
        for(int i=1;i<=list1.size();i++){
            if(!list1.contains(i)){
                missingNum = i;
                break;
            }
        }
        System.out.println(missingNum);

        //using java8

    }
}
