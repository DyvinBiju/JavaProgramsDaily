class Employee {
    int employeeId;
    String employeeName;
    double salary;

    public Employee(int employeeId, String employeeName, double salary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.salary = salary;
    }

    public void displayEmployee() {
        System.out.println("Employee Details");
        System.out.println("----------------");
        System.out.println("ID         : " + employeeId);
        System.out.println("Name       : " + employeeName);
        System.out.println("Salary     : " + salary);
    }
}

class Manager extends Employee {
    String department;
    double bonus;

    public Manager(int employeeId, String employeeName, double salary,
                   String department, double bonus) {
        super(employeeId, employeeName, salary);
        this.department = department;
        this.bonus = bonus;
    }

    public void displayManager() {
        System.out.println("\nManager Details");
        System.out.println("---------------");
        System.out.println("Department : " + department);
        System.out.println("Bonus      : " + bonus);
    }
}

public class EmployeeManagerDemo {
    public static void main(String[] args) {
        Manager manager = new Manager(101, "Arun", 50000, "Sales", 15000);

        manager.displayEmployee();
        manager.displayManager();
    }
}