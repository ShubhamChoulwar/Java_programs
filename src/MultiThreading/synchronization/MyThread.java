package MultiThreading.synchronization;

public class MyThread extends Thread{

    private Counter counter;

    public MyThread(Counter c1){
        this.counter = c1;
    }
    @Override
    public void run() {

        for(int i=0;i<1000;i++){
            counter.increment();
        }
    }
}
