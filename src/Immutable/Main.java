package Immutable;

public class Main {

    public static void main(String[] args){
        Address address = new Address("Banglore");
        Employee emp = new Employee(1,"shubham", address );

        /*
         * make Address class variable city as final to not set below value to pune.
         */
        //address.setCity("Pune");
        /*
         * setting value in same object will not change the actual value set above in constructor object
         */

        //emp.setName("choulwar");
        System.out.println("before : " + address);
        System.out.println("before : " + emp);

        /*Address address1 = new Address("Pune");
        Employee emp1 = new Employee(2,"choulwar", address1 );

        System.out.println("After : " + address1);
        System.out.println("After : " + emp1);*/

    }
}
