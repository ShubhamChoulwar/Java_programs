package AbstractClass;

abstract class Salary {
    abstract void salary(int number); //abstract method without body
    abstract void intensive(int intenseNum);
    void currency(){    //method with body
        System.out.println("from abstract : INR Currency");
    }

}
