package JavaDesignPattern.factory;

public class FetchEmployeeFactory {

        /**
         * in general way we can create object of class Employee emp = new AndriodDeveloper();
         * and based on input we are calling this but in future maybe we need to change the input
         * like we have two types of input and based on input what we need to do we are creating two objects
         * of the class so this is dynamically we can handle using Factory method as below.
         */

        /*Employee emp1 = new AndroidDeveloper();
        Employee emp2 = new WebDeveloper();

        emp1.salary();
        emp2.salary();
        System.out.println("Android developer salary is: " + emp1.salary());
        System.out.println("Web developer salary is: " + emp2.salary());*/
        //instead of above code we can build factory pattern like based on input we can create object of respective class

        public static Employee getSalary(String developerType){
            if(developerType.trim().equalsIgnoreCase("Android Developer")){
                    return new AndroidDeveloper();
            } else if(developerType.trim().equalsIgnoreCase("Web Developer")){
                return new WebDeveloper();
            } else{
                return null;
            }
        }
}
