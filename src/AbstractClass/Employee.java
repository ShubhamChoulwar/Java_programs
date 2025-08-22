package AbstractClass;

public class Employee extends Salary implements Loc{
    /**
     * here both abstract method we have to override from Salary absrtact class
     * Location and Salary both absrtact class can notbe extends so we have to create interface
     */
    @Override
    void salary(int number) {
        System.out.println("override method(Salary) from abstract class :" + number);
    }

    @Override
    void intensive(int intenseNum) {
        System.out.println("override method(intensive) from abstract class :" + intenseNum);

    }

    @Override
    public void location(String location) {
        System.out.println("Employee belongs to location :" +  location);
    }
}
