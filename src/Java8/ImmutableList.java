package Java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ImmutableList {
    /**
     * this will be cloning the original array to immutable array with final keyword
     * and modifying the value of the original array will not affect to cloning array which is immutable.
     */

    private final int[] arr;

    public ImmutableList(int[] arr) {
        this.arr = arr.clone(); // Create a copy of the array to ensure immutability
    }

    public int get(int index) {
        return arr[index];
    }

    public int size() {
        return arr.length;
    }

    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5};


        ImmutableList immutableList = new ImmutableList(originalArray);

        System.out.println("Element at index 2: " + immutableList.get(2)); // Output: 3
        System.out.println("Size of the list: " + immutableList.size()); // Output: 5

        // Attempting to modify the original array will not affect the immutable list
        originalArray[0] = 10;
        System.out.println("Element at index 0 after modifying original array: " + immutableList.get(0)); // Output: 1

        /**
         * Another method of using Arrays.asList() to create an immutable list
         */
        List<Integer> originalList = Arrays.asList(1, 2, 3, 4);
        try {
            originalList.add(5);
            System.out.println(originalList);
        }
        catch(Exception e){
            System.out.println("Cannot add element to immutable list(originalList)");
        }
        finally{
            System.out.println("originalList     will be same" + originalList);
        }

        /**
         * Another method of using new keyword of ArrayList to create a modifiable list by pasing immutable list
         */
        List<Integer> modifiableList = new ArrayList<>(Arrays.asList(10,20,30,40));
        modifiableList.add(50);
        System.out.println("modifiableList will be updated" + modifiableList);


    }
}
