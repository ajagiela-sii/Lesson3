import java.util.ArrayList;

public class Company {

    private ArrayList<Employee> employees = new ArrayList<>();

    public void addToEmployeesList(Employee employee) {
        employees.add(employee);
    }

    public void displayAllEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public void printSumOffAllEmployees() {
        float sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary();
        }
        System.out.println("Sum of all employees salary is " + sum + "\n");
    }
}
