package MultiThreading.practise;

public class ThreadLifeCycle extends Thread{

    @Override
    public void run() {
        System.out.println("RUNNING");
        try {
            Thread.sleep(2000);     //WAIT //hold the T1 thread for 20 sec
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ThreadLifeCycle T1 = new ThreadLifeCycle(); //NEW
        System.out.println(T1.getState());
        T1.start();  //RUNNABLE  //once accpeted by Thread class then RUNNING
        System.out.println(T1.getState());
        Thread.sleep(200);   //WAIT    //hold the main thread to 2 seconds
        System.out.println(T1.getState());
        T1.join();
        System.out.println(T1.getState());
    }
}
