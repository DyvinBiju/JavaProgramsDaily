class Employee{
    void calculateSalary(){
        System.out.println("Employee Salary");
    }
}
class Manager extends Employee{
    void calculateSalary(){
        System.out.println("Manager salary is 80000");
    }
}
class Developer extends Employee{
    void calculateSalary(){
        System.out.println("Manager salary is 50000");
    }
}
class Intern extends Employee{
    void calculateSalary(){
        System.out.println("Manager salary is 20000");
    }
}


public class EmployeeMain {
    public static void main(String[] args){
        Employee e1 = new Manager();
        Employee e2 = new Developer();
        Employee e3 = new Intern();
        e1.calculateSalary();
        e2.calculateSalary();
        e3.calculateSalary();
    }
}
