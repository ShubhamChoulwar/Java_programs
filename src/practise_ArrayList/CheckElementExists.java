package practise_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class CheckElementExists {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        //check if any number is present in list
        Boolean bn = list.contains(3);
        System.out.println(bn);

        //check if number exists then at which index
        int index = list.indexOf(3);
        System.out.println(index);

        //check if number exists then at which index- without indexOf method
        int index1=-1;
        for(int i=0;i<list.size();i++){
            if(list.get(i).equals(5)) {
                index1 = i;
                break;
            }
        }
        System.out.println(index1);
    }
}
