package Interview.EmpFromPuneLoc;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class scenarioDemo {

    public static void main(String[] args) {

        // Create 5 Address objects
        List<Address> addressList =  new ArrayList<>();
        addressList.add(new Address(1, "Bangalore", "Karnataka"));
        addressList.add(new Address(2, "Mumbai", "Maharashtra"));
        addressList.add(new Address(3, "Pune", "Maharashtra"));
        addressList.add(new Address(4, "Chennai", "Tamil Nadu"));
        addressList.add(new Address(5, "Hyderabad", "Telangana"));

        // Create 10 Employee objects
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(101, "Sachin", LocalDate.of(1995, 2, 10),
                LocalDate.of(2020, 1, 5), 1, 65000));
        employeeList.add(new Employee(102, "Rahul", LocalDate.of(1990, 8, 14),
                LocalDate.of(2018, 3, 12), 2, 72000));
        employeeList.add(new Employee(103, "Anjali", LocalDate.of(1993, 5, 20),
                LocalDate.of(2019, 6, 22), 3, 70000));
        employeeList.add(new Employee(104, "Kiran", LocalDate.of(1992, 11, 1),
                LocalDate.of(2021, 7, 10), 4, 58000));
        employeeList.add(new Employee(105, "Priya", LocalDate.of(1996, 1, 18),
                LocalDate.of(2022, 2, 14), 5, 45000));
        employeeList.add(new Employee(106, "Rohit", LocalDate.of(1989, 3, 2),
                LocalDate.of(2017, 4, 1), 1, 85000));
        employeeList.add(new Employee(107, "Sneha", LocalDate.of(1994, 9, 13),
                LocalDate.of(2020, 6, 30), 2, 56000));
        employeeList.add(new Employee(108, "Naveen", LocalDate.of(1991, 4, 7),
                LocalDate.of(2016, 10, 11), 3, 90000));
        employeeList.add(new Employee(109, "Vikas", LocalDate.of(1988, 12, 25),
                LocalDate.of(2015, 12, 1), 4, 98000));
        employeeList.add(new Employee(110, "Deepa", LocalDate.of(1997, 7, 16),
                LocalDate.of(2023, 5, 9), 5, 48000));

        //find the name of employees whoes location is pune.
        int addressId = 0;
        List<String> empNames = new ArrayList<>();
        for(Address address:addressList){
            if(address.getCity().equals("Pune")){
                addressId = address.getId();
                System.out.println(addressId);
                break;
            }
        }
        for(Employee employee:employeeList){
            if(employee.getAddressId() == addressId){
                empNames.add(employee.getName());
            }
        }
        System.out.println(empNames);

        //using Java8
        Optional<List<String>> empNames1 =
                addressList.stream()
                        .filter(a -> "Pune".equals(a.getCity()))
                        .map(Address::getId)
                        .findFirst()
                        .map(puneAddressId ->
                                employeeList.stream()
                                        .filter(e -> e.getAddressId() == puneAddressId)
                                        .map(Employee::getName)
                                        .collect(Collectors.toList())
                        );
                        //.orElse(Collectors.toList());

        System.out.println(empNames1);

        //group employee with addressId using Java8
        Map<Integer,List<String>> mp = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getAddressId, Collectors.mapping(Employee::getName, Collectors.toList())));
        System.out.println(mp);


        
    }
}
