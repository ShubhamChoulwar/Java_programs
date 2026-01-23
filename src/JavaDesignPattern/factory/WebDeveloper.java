package JavaDesignPattern.factory;

public class WebDeveloper implements Employee {

    @Override
    public int salary() {
        System.out.println("Getting salary of web developer");
        return 40000;
    }
}
