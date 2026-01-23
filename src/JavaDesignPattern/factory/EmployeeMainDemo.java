package JavaDesignPattern.factory;

public class EmployeeMainDemo {

    public static void main(String[] args) {
        Employee employee = FetchEmployeeFactory.getSalary("Android Developer");
        int result1 = employee.salary();
        System.out.println(result1);

        Employee employee2 =  FetchEmployeeFactory.getSalary("Web Developer");
        employee2.salary();
        int result2 = employee2.salary();
        System.out.println(result2);
    }
}
