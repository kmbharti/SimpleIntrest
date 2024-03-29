import java.util.ArrayList;
import java.util.Collections;
class ArraylistCollectinsTypeDemo
{
public static void main(String args[])
{
ArrayList<Integer> name=new ArrayList<>();
name.add(10,20);
name.add(101,20);
name.add(10,20);
name.add(10,20);
Collections.sort(name);
System.out.println(name);





/*ArrayList<Employee> employee=new ArrayList();
employee.add(new Employee("Ram","SE",10000));
employee.add(new Employee("Rama","SE",20000));
employee.add(new Employee("Ramita","SE",30000));
employee.add(new Employee("Ramaji","SE",40000));
System.out.println(employee);
//Collections.sort(employee);*/
}
}

