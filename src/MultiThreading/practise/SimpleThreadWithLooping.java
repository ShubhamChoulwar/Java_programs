package MultiThreading.practise;

/**
 * In this example thread is created and in run method we are printing values in infinite loop.
 * we have Thread and main thread so depends on machine sometime it will execute first defined thread and then main thread or vise varsa
 */
public class SimpleThreadWithLooping extends Thread{

    @Override
    public void run() {
        for(int i=0;i<100;i++){
            System.out.println(Thread.currentThread().getName() + " : " + "run method" );
        }
    }

    public static void main(String[] args) {
        SimpleThreadWithLooping S1 = new SimpleThreadWithLooping();
        S1.start();
        for(int i=0;i<100;i++) {
            System.out.println(Thread.currentThread().getName());
        }
    }
}
