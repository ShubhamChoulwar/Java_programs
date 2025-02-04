package MultiThreading;

public class Main {
    public static void main(String[] args) {
        Company c = new Company();
        Development d = new Development(c);
        Testing t = new Testing(c);

        d.start();
        t.start();
    }
}
