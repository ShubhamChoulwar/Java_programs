package MultiThreading;

public class Company {

    int n;
    boolean flag = false;
    synchronized public void Develop_code(int n) throws Exception {
        if(flag){
                wait();
            notify();
        }
        this.n=n;
        System.out.println("Development: " + this.n );
        flag=true;

    }

    public void test_code(int n) throws Exception {
        if(!flag){
            wait();
            notify();
        }
        this.n=n;
        System.out.println("Testing: " + this.n );
        flag=false;

    }


}
