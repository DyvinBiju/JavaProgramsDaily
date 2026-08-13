class Vehicle{
    int regNo;
    int dailyRate;

    Vehicle(int regNo, int dailyRate){
        this.regNo = regNo;
        this.dailyRate = dailyRate;
    }

    int computeRent(int days){
        return dailyRate*days;
    }
}

class Car extends Vehicle{
    int numDoors;

    Car(int regNo, int dailyRate, int numDoors){
        super(regNo,dailyRate);
        this.numDoors = numDoors;
    }

    @Override
    int computeRent(int days){
        return super.computeRent(days) + 200;
    }
}

public class CarRental{
    public static void main(String[] args){
        Car c = new Car(100, 500, 4);
        int rent = c.computeRent(2);
        System.out.println("Car rent: "+rent);
    }
}