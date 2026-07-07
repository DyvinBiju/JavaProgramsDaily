class Base
{
    int a;
    void show()
    {
        System.out.println("A has value " +a);
    }
}
class Derived extends Base
{
    void display()
    {
        System.out.println("Value of A in derived class is: "+a);
    }
}
public class InheritanceDemo
{
    public static void main(String[] args)
    {
        Derived objB = new Derived();
        objB.a = 10;
        objB.show();
        objB.display();

    }
}