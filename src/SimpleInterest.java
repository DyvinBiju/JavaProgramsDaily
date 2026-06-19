import java.util.Scanner;

public class SimpleInterest {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        final double DEFAULT_RATE = 5.0;

        double principal;
        double time;
        double interest;

        System.out.print("Enter principal amount: ");
        principal = input.nextDouble();

        System.out.print("Enter time: ");
        time = input.nextDouble();

        interest = (principal * DEFAULT_RATE * time) / 100;

        System.out.println("Interest = " + interest);
    }
}