class Employee{
    protected final String companyName;
    protected double salary;

    Employee(String companyName,double salary){
        this.companyName = companyName;
        this.salary = salary;

    }

    double calculateBonus(){
        return (salary*5)/100;
    }
}

class Manager extends Employee{
    Manager(String companyName,double salary){
        super(companyName,salary);
    }

    @Override
    double calculateBonus(){
        return (salary*10)/100;
    }
}

class SeniorManager extends Manager{
    SeniorManager(String companyName,double salary){
        super(companyName,salary);
    }

    @Override
    double calculateBonus(){
        return ((salary*15)/100)+600;
    }
}

public class EmployeeBonus {
    public static void main(String[] args){
        SeniorManager sm = new SeniorManager("ABC Limited", 8000);
        System.out.println("Company: "+sm.companyName);
        System.out.println("Bonus: "+sm.calculateBonus());
    }
}