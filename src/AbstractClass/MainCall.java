package AbstractClass;

public class MainCall {

    public static void main(String[] args){

        Employee emp =new Employee();
        emp.salary(1000);
        emp.intensive(100);
        emp.currency();    //this is normal method so no need to override in child class and if requireed then we can call like this.
        emp.location("Pune");
        emp.WFH();        //this is normal method so no need to override in child class and if requireed then we can call like this.
    }
}
