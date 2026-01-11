package Practice_Multithreading;

public class CreateSingleThreadRUnnable implements Runnable {

    @Override
    public void run() {
        System.out.println("Created Single Thread using Runnable interface : " + Thread.currentThread().getName());
    }
}
