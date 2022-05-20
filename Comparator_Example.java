package Pratice2;
import java.util.*;
class Employee1 {
    int id;
    String name,department;

    public Employee1(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

}

class SortbyId implements Comparator<Employee1> {
    @Override
    public int compare(Employee1 employee1, Employee1 employee2) {
        return employee1.id - employee2.id;
    }
}

public class Comparator_Example {
    public static void main(String[] args) {
        ArrayList<Employee1> workers = new ArrayList<Employee1>();

        Employee1 employee1 = new Employee1(11, "Kim Coding", "Software Engineering");
        Employee1 employee2 = new Employee1(5, "Hello World", "Growth Marketing");
        Employee1 employee3 = new Employee1(7, "Park Hacker", "Software Engineering");

        workers.add(employee1);
        workers.add(employee2);
        workers.add(employee3);

        for (Employee1 employee:workers) {
            System.out.println(employee.id + " " + employee.name + " " + employee.department + " ");
        }

        Collections.sort(workers, new SortbyId()); //sort() 오름차순으로 만들어줌   reverse() 내림차순으로 만들어줌

        for (Employee1 employee:workers) {
            System.out.println(employee.id + " " + employee.name + " " + employee.department + " ");
        }
    }

}
