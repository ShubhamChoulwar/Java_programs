package MultiThreading;

public class Development extends Thread{

    Company c;

    Development(Company c){
        this.c=c;
    }

    public void run() {
        int i=1;
        while(i<10) {

            try {
                c.Develop_code(i);
                Thread.sleep(1000);
            } catch (Exception e) {

            }
            i++;
        }
    }


}
