class BankAccount
{
    String name;
    double balance;


    BankAccount(String n,double b)
    {
        name=n;
        balance=b;
    }


    void display()
    {
        System.out.println(name);
        System.out.println(balance);
    }
}
public class DemoBank
{
    static void deposit(BankAccount acc,double amount)
    {        acc.balance += amount;
    }

    static void withdraw(BankAccount acc,double amount)
    {
        if(acc.balance >= amount)
            acc.balance -= amount;
        else
            System.out.println("Insufficient balance");
    }

    public static void main(String args[])
    {
        BankAccount a1 =
                new BankAccount("Tom",50000);

        deposit(a1,5000);
        withdraw(a1,500);
        a1.display();
    }  }

