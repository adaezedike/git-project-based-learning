public class Employee {
    private String name;
    private int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }

    public void increaseSalary() {
    salary += 500;
}

public void decreaseSalary() {
    salary -= 200;
}


public static void main(String[] args) {
    Employee employee = new Employee("Adaeze", 30000);

    employee.increaseSalary();
    employee.display();
}
}
