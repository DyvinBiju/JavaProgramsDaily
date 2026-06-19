import java.util.Scanner;

public class ShoppingDiscount {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        final double DISCOUNT = 0.10;

        double item1;
        double item2;
        double item3;
        double total;
        double discountAmount;
        double finalAmount;

        System.out.print("Enter price of item 1: ");
        item1 = input.nextDouble();

        System.out.print("Enter price of item 2: ");
        item2 = input.nextDouble();

        System.out.print("Enter price of item 3: ");
        item3 = input.nextDouble();

        total = item1 + item2 + item3;
        discountAmount = total * DISCOUNT;
        finalAmount = total - discountAmount;

        System.out.println("Total = " + total);
        System.out.println("Discount = " + discountAmount);
        System.out.println("Final Amount = " + finalAmount);
    }
}