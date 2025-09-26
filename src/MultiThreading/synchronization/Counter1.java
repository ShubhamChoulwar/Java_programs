package MultiThreading.synchronization;

public class Counter1 {

    private int count =0;

    public synchronized void increment(){
        count++;
        /**
         * we can synchronized code area also instead of method
         * synchronized(this){
         *  count++;
         * }
         */
    }

    public int getCount(){
        return count;
    }
}
