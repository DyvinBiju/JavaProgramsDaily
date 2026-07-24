class Vehicle {
    public String company = "Toyota";
    protected String model = "Innova";
    String fuelType = "Diesel";   // Default access
}

class Car extends Vehicle {

    public void displayCar() {
        System.out.println("Vehicle Information");
        System.out.println("-------------------");
        System.out.println("Company   : " + company);
        System.out.println("Model     : " + model);
        System.out.println("Fuel Type : " + fuelType);
    }
}

public class VehicleCarDemo {
    public static void main(String[] args) {

        Car car = new Car();

        car.displayCar();

        System.out.println("\nCar object created successfully.");

        // Accessible in the same package
        System.out.println("\nAccessing from Main Class");
        System.out.println("-------------------------");
        System.out.println("Company   : " + car.company);
        System.out.println("Model     : " + car.model);
        System.out.println("Fuel Type : " + car.fuelType);
    }
}