package JavaDesignPattern.factory;

public class AndroidDeveloper implements Employee {
    @Override
    public int salary() {
        System.out.println("Getting salary of Android developer");
        return 50000;
    }

}
