package practise_Java8.GrpEmpByDept;

import java.util.*;
import java.util.stream.Collectors;

public class GroupByDept {
    public static void main(String[] args) {
        List<Employee> lst = Arrays.asList(
                new Employee(1,"shubham", "IT", 10000.0),
                new Employee(2,"revati", "IT", 5000.0),
                new Employee(3, "shraavi", "mech", 2000.0)
        );

        //using java8
        Map<String, List<Employee>> mp = lst.stream()
                                            .collect(Collectors.groupingBy(e -> e.dept));
        mp.forEach((k,e)->{
            System.out.println(k + "->" + e.size());
        });

        //using java7
        Map<String, List<Employee>> empByDept = new HashMap<String, List<Employee>>();

        for (Employee e : lst) {
            if (!empByDept.containsKey(e.dept)) {
                empByDept.put(e.dept, new ArrayList<Employee>());
            }
            empByDept.get(e.dept).add(e);
        }

        for (Map.Entry<String, List<Employee>> entry : empByDept.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue().size());
        }

    }
}
