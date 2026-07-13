class Shape
{
    double area()
    {
        return 0;
    }
}

class Circle extends Shape
{
    double radius;

    Circle(double radius)
    {
        this.radius = radius;
    }

    double area()
    {
        return 3.14 * radius * radius;
    }
}

class Rectangle extends Shape
{
    double length, width;

    Rectangle(double length, double width)
    {
        this.length = length;
        this.width = width;
    }

    double area()
    {
        return length * width;
    }
}

class Triangle extends Shape
{
    double base, height;

    Triangle(double base, double height)
    {
        this.base = base;
        this.height = height;
    }

    double area()
    {
        return 0.5 * base * height;
    }
}

public class Shapes
{
    public static void main(String[] args)
    {
        Shape[] shapes =
                {
                        new Circle(5),
                        new Rectangle(4, 6),
                        new Triangle(8, 3)
                };

        for(Shape s : shapes)
        {
            System.out.println("Area = " + s.area());
        }
    }
}