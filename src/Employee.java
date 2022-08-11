public class Employee {

    private String name;
    private String surname;
    private float salary;

    public Employee(String name, String surname, float salary) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    public float getSalary() {
        return salary;
    }

    public void getAllData() {
        System.out.println("Salary for " + name + " " + surname + " is " + salary);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                '}';
    }
}
