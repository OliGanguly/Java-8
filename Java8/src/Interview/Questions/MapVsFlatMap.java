package Interview.Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

class Employee{
    int emp_id;
    String name;
    List<String> citis;

    public Employee(int emp_id, String name, List<String> citis) {
        this.emp_id = emp_id;
        this.name = name;
        this.citis = citis;
    }

    public int getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getCitis() {
        return citis;
    }

    public void setCitis(List<String> citis) {
        this.citis = citis;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "emp_id=" + emp_id +
                ", name='" + name + '\'' +
                ", citis=" + citis +
                '}';
    }
}
public class MapVsFlatMap {
    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("Pune", "Delhi","Bangalore");
        List<String> list2 = Arrays.asList("Pune", "Delhi");
        Employee e1=new Employee(1,"Oli",list1);
        Employee e2=new Employee(2,"Ria",list2);
//        System.out.println(e1);
//        System.out.println(e2);
        List<Employee> list = new ArrayList<>();
        list.add(e1);
        list.add(e2);
//        System.out.println(list);
        List<Integer> collectId = list.stream().map(employee -> employee.getEmp_id()).collect(Collectors.toList());
        System.out.println(collectId);//return a new stream -map create a new stream
        List<List<String>> collectCitis = list.stream().map(employee -> employee.getCitis()).collect(Collectors.toList());
        System.out.println(collectCitis);
        //I dont want duplicate citis
        //just want to see citis
        //map will not work on list on list
        //inner list[list of list]
        Set<String> collect = list.stream().flatMap(employee -> employee.getCitis().stream()).collect(Collectors.toSet());
        System.out.println("FlatMap : " + collect);
        Set<String> set =  list.stream().flatMap(employee -> employee.getCitis().stream()).collect(Collectors.toSet());
        System.out.println("FlatMap : " + set);
    }
}
