package MultiThreading.practise;

/**
 * lets say some code area executing in loop and we are running two threads
 * so in this case both the threads will run parallay/concurrently
 * so with yeild method we can tell to jvm that after every iteration let other Thread to give chance.
 */
public class YeildMethod extends Thread{

    public YeildMethod(String name) {
        super(name);
    }

    @Override
    public void run() {
        for(int i = 0; i<5 ;i++){
            System.out.println(Thread.currentThread().getName());
            Thread.yield();
        }
    }

    public static void main(String[] args) {
        YeildMethod y1 = new YeildMethod("Thread-YeilMethod-1");
        YeildMethod y2 = new YeildMethod("Thread-YeilMethod-2");
        y1.start();
        y2.start();
    }
}
