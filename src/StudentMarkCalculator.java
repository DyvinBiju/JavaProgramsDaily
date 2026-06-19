import java.util.Scanner;

public class StudentMarkCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int mark1, mark2, mark3;
        int total;
        double average;

        System.out.print("Enter mark 1: ");
        mark1 = input.nextInt();

        System.out.print("Enter mark 2: ");
        mark2 = input.nextInt();

        System.out.print("Enter mark 3: ");
        mark3 = input.nextInt();

        total = mark1 + mark2 + mark3;
        average = total / 3.0;

        System.out.println("Total = " + total);
        System.out.println("Average = " + average);

        if (average >= 50)
            System.out.println("Above 50 average");
        else
            System.out.println("Below 50 average");
    }
}
