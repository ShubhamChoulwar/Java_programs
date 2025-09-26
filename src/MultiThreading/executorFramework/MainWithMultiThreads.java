package MultiThreading.executorFramework;

/**
 * here we used to get 1 to 10 factorial using multiple threads creation in for loop but thread will
 * say what java doing here everything thread is doing and 10 threads I am creating for one operation only
 * so java comes up with executor framework where one thread or multiple threds can utilize multiple time
 * without thread interrupted.
 * see in class MainWithExecutorFramework.java class
 */
public class MainWithMultiThreads {

        public static void main(String[] args) throws InterruptedException {
            long startTime = System.currentTimeMillis();
            Thread thread = new Thread();
            for (int i = 1; i < 10; i++) {
                int finalI = i;
                thread = new Thread(
                        () -> {
                            long result = 0;
                            try {
                                result = factorial(finalI);
                            } catch (InterruptedException e) {
                                throw new RuntimeException(e);
                            }
                            System.out.println(Thread.currentThread().getName()+ " : " +result);
                        });
                thread.start();
            }
            thread.join();
            System.out.println("Total time: " + (System.currentTimeMillis() - startTime));
        }

        public static long factorial(int number) throws InterruptedException {
            Thread.sleep(1000);
            long result = 1;
            for (int i = 1; i <= number; i++) {
                result *= i;
            }
            return result;
        }
    }

