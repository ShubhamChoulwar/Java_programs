package Array;

public class RemoveDuplicateNum {

    public static void main(String[] args) {

        int[] arr = {1,2,3,3,4};

        int dupNum = arr[0];  //1

        for(int i=1;i<arr.length;i++){
            if(arr[i] == dupNum) {
                dupNum = arr[i];
                break;
            }
            dupNum = arr[i];
        }
        System.out.println(dupNum);
    }
}
