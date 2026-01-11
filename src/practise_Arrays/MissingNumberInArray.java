package practise_Arrays;
//input = {1,2,4,5}  //output = 3
public class MissingNumberInArray {
    public static void findMissingNum(int[] arr){
        int check = 1;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == check) {
                check++;
            }
            else{
                check = arr[i]-1;
                break;
            }

        }
        System.out.println(check);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,4,5};
        findMissingNum(arr);

    }
}
