package practise_Java8.MaxSalaryByDept;

import practise_Java8.GrpEmpByDept.Employee;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MaxSalaryByDept {
    public static void main(String[] args) {

        List<Employee> lst = Arrays.asList(
                new Employee(1,"shubham", "IT", 10000.0),
                new Employee(2,"revati", "IT", 5000.0),
                new Employee(3, "shraavi", "mech", 2000.0)
        );
        Map<String, Double> mp = new HashMap<>();
        for(Employee e: lst){
            if(!mp.containsKey(e.dept)){
                mp.put(e.dept, e.salary);
            }
            //mp.get(e.dept).add(e);
        }

    }
}
