class Shape{
    protected String name;

    Shape(String name){
        this.name = name;
    }

    void describe(){
        System.out.println("Name: "+name );
    }
}

class Circle extends Shape{
    final float pi = 3.14F;
    float radius;

    Circle(String name, float radius){
        super(name);
        this.radius = radius;
    }

    @Override
    void describe(){
        super.describe();
        System.out.println("Area: "+pi*(radius*radius));
    }
}

public class AreaCalculator{
    public static void main(String[] args){
        Circle c = new Circle("Circle", 2F);
        c.describe();
    }
}