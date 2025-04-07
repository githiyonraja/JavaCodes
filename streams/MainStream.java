package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MainStream {

    public static void main(String[] args) {
        List<Employee> emp = new ArrayList<>();

        Employee e1 = new Employee("Ashok",25000,"ECE");
        Employee e2 = new Employee("Guna", 30000, "IT");
        Employee e3 = new Employee("Raghul", 32000, "EEE");
        Employee e4 = new Employee("Kathir", 40000, "IT");
        Employee e5 = new Employee("Bala", 60000, "IT");

        emp.add(e1);
        emp.add(e2);
        emp.add(e3);
        emp.add(e4);
        emp.add(e5);


        List<Employee> filtered = emp.stream()
                .filter(a -> a.getSalary()>30000 && a.getDept().equals("IT"))
                .toList();
        System.out.println(filtered);

        filtered = emp.stream().map(a->{
            if(a.getSalary()>30000){
                a.setSalary(a.getSalary()+5000);
            }
            return a;
        })
                .filter(a->a.getSalary()>30000 && a.getDept().equals("IT"))
                .collect(Collectors.toList());

        System.out.println(filtered);
    }
}
