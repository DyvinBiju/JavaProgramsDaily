import java.util.Scanner;

public class AgeCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int currentYear;
        int birthYear;
        int age;

        System.out.print("Enter current year: ");
        currentYear = input.nextInt();

        System.out.print("Enter birth year: ");
        birthYear = input.nextInt();

        age = currentYear - birthYear;

        System.out.println("Age = " + age);
    }
}