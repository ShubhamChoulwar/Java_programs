package Interview.EmpFromPuneLoc;

import java.time.LocalDate;

public class Employee {
    private int id;
    private String name;
    private LocalDate dob;
    private LocalDate doj;
    private int addressId;
    private int salary;

    public Employee(){

    }

    public Employee(int id,String name,LocalDate dob,LocalDate doj, int addressId, int salary){
        this.id = id;
        this.name = name;
        this.dob= dob;
        this.doj= doj;
        this.addressId = addressId;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public LocalDate getDoj() {
        return doj;
    }

    public void setDoj(LocalDate doj) {
        this.doj = doj;
    }

    public int getAddressId() {
        return addressId;
    }

    public void setAddressId(int addressId) {
        this.addressId = addressId;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dob=" + dob +
                ", doj=" + doj +
                ", addressId=" + addressId +
                ", salary=" + salary +
                '}';
    }
}
