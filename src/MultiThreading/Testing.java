package MultiThreading;

public class Testing extends Thread{

    Company c;

    Testing(Company c){
        this.c=c;
    }

    public void run(){
        int i=1;
        while(i<10) {

            try {
                c.test_code(i);
                Thread.sleep(1000);
            } catch (Exception e) {

            }
            i++;
        }
        }
    }

