import java.util.Scanner;

public class MobileDataPlan {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        final double DATA_LIMIT = 30.0;

        double usedData;
        double remainingData;

        System.out.print("Enter data used in GB: ");
        usedData = input.nextDouble();

        remainingData = DATA_LIMIT - usedData;

        System.out.println("Used: " + usedData + " GB");
        System.out.println("Remaining: " + remainingData + " GB");
    }
}