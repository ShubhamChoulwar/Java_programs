package Practice_Multithreading;

public class CreateSingleThread extends Thread {
    @Override
    public void run() {
        System.out.println("Created Single Thread using thread : " + Thread.currentThread().getName());
    }
}
