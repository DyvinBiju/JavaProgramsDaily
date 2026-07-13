class Employee{
    int employeeId;
    String employeeName;
    int salary;

    Employee(int eId,String eName,int eSalary)
    {
        employeeId = eId;
        employeeName = eName;
        salary = eSalary;
    }

    void displayEmployee()
    {
        System.out.println("Employee Id: "+employeeId);
        System.out.println("Employee name: "+employeeName);
        System.out.println("Employee salary: "+salary);
    }
}

class Manager extends Employee{
    String department;
    int bonus;

    void displaymanager()
    {
        System.out.println("Manager Id: "+employeeId);
        System.out.println("Manager name: "+employeeName);
        System.out.println("Manager salary: "+salary);
        System.out.println("Manager department: "+department );
        System.out.println("Manager bonus: "+bonus );
    }
}

public class EmployeeInheritance {
    Manager obj = new Manager();
    obj.displayEmployee();

}