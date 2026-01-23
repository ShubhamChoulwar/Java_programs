package practise_Java8.GrpByDeptAndGender;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GrpByDeptAndMenWomen {

    List<Employee> lst = Arrays.asList(
           new Employee(1,"shubham","choulwar",100,"IT","Male"),
           new Employee(2,"revati","choulwar",200,"Mech","Female")
    );

    //using java8
    Map<String, Map<String, List<Employee>>> result = lst.stream()
            .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.groupingBy(Employee::getGender)));

    //result.forEach((k,v) -> System.out.println(k + "=" + v.get().firstName));
}
