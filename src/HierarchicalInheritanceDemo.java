class Shape {
    String color = "Red";

    void displayColor() {
        System.out.println("The color of this shape is: " + color);
    }
}

class Circle extends Shape {
    double radius = 5.0;

    void calculateArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Area of the Circle: " + area);
    }
}

class Square extends Shape {
    double side = 4.0;

    void calculateArea() {
        double area = side * side;
        System.out.println("Area of the Square: " + area);
    }
}

public class HierarchicalInheritanceDemo {

    public static void main(String[] args) {

        System.out.println("--- Testing Circle ---");
        Circle myCircle = new Circle();
        myCircle.displayColor();
        myCircle.calculateArea();

        System.out.println("\n--- Testing Square ---");
        Square mySquare = new Square();
        mySquare.displayColor();
        mySquare.calculateArea();
    }
}