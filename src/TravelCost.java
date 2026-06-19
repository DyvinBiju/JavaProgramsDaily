import java.util.Scanner;

public class TravelCost {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double distance;
        double mileage;
        double petrolPrice;
        double fuelNeeded;
        double cost;

        System.out.print("Enter distance in km: ");
        distance = input.nextDouble();

        System.out.print("Enter mileage (km/litre): ");
        mileage = input.nextDouble();

        System.out.print("Enter petrol price per litre: ");
        petrolPrice = input.nextDouble();

        fuelNeeded = distance / mileage;
        cost = fuelNeeded * petrolPrice;

        System.out.println("Fuel needed = " + fuelNeeded + " litres");
        System.out.println("Cost = " + cost);
    }
}