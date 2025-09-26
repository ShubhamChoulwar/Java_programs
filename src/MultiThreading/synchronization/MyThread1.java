package MultiThreading.synchronization;

public class MyThread1 extends Thread {
    private Counter1 counter1;

    public MyThread1(Counter1 c2){
        this.counter1 = c2;
    }
    @Override
    public void run() {

        for(int i=0;i<1000;i++){
            counter1.increment();
        }
    }
}
