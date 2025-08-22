package MultiThreading;

public class Main extends Thread{

    public Main(String name){
        super(name);
    }
    @Override
    public void run() {
        for(int i=0;i<5;i++) {
            System.out.println(Thread.currentThread().getName() + "-Count-" + i);

            /*try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }*/
            //Thread.yield();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Main t1 = new Main("Thread-1");
        Main t2 = new Main("Thread-2");
        t1.start();
        t2.start();
        //t1.join();      //main method thread waits to complete the t1 thread then execute below sysout.
        //t1.setPriority(MAX_PRIORITY);   //this will set the priority for each thread
        //t2.setPriority(MIN_PRIORITY);   //this will set the priority for each thread
        t1.wait();
        System.out.println(Thread.currentThread().getName());

        /*Company c = new Company();
        Development d = new Development(c);
        Testing t = new Testing(c);

        d.start();
        t.start();*/
    }
}
