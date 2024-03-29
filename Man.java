import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        
        // Populate the list with employee data entries
        employees.add(new Employee("John", "Manager", 50000));
        employees.add(new Employee("Alice", "Engineer", 60000));
        employees.add(new Employee("Bob", "Analyst", 55000));
        // Add more employees as needed
        
        // Find the top three employees with the highest salary
        List<Employee> topThreeEmployees = findTopThreeHighestPaidEmployees(employees);
        
        // Print the result
        System.out.println("Top Three Employees with Highest Salary:");
        for (int i = 0; i < topThreeEmployees.size(); i++) {
            Employee employee = topThreeEmployees.get(i);
            System.out.println((i + 1) + ". Name: " + employee.getName() + ", Designation: " + employee.getDesignation() + ", Salary: $" + employee.getSalary());
        }
    }
    
    public static List<Employee> findTopThreeHighestPaidEmployees(List<Employee> employees) {
        if (employees.isEmpty()) {
            throw new IllegalArgumentException("Employee list is empty");
        }
        
        // Sort the employees by salary in descending order
        employees.sort(Comparator.comparingDouble(Employee::getSalary).reversed());
        
        // Return the top three employees
        return employees.subList(0, Math.min(3, employees.size()));
    }
}

class Employee {
    private String name;
    private String designation;
    private double salary;
    
    public Employee(String name, String designation, double salary) {
        this.name = name;
        this.designation = designation;
        this.salary = salary;
    }
    
    public String getName() {
        return name;
    }
    
    public String getDesignation() {
        return designation;
    }
     public double getSalary() {
        return salary;
    }
}