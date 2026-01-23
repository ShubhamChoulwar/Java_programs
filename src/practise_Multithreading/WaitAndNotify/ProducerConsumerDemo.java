package practise_Multithreading.WaitAndNotify;

public class ProducerConsumerDemo {

    public static void main(String[] args) {

        ProducerConsumer producerConsumer = new ProducerConsumer();
        Thread t1 = new Thread(() -> {
            try {
                for(int i=1;i<=10;i++) {
                    producerConsumer.producer(i);
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        t1.start();

        Thread t2 = new Thread(() -> {
           for(int i=0;i<=10;i++) {
               try {
                   producerConsumer.consumer();
                   Thread.sleep(8000);
               } catch (InterruptedException e) {
                   throw new RuntimeException(e);
               }

           }
        });
        t2.start();
    }
}
