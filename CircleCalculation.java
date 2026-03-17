import java.util.Scanner;

public class CircleCalculation {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter radius: ");
        int r = input.nextInt();

        System.out.printf("Diameter: %.2f%n", 2.0 * r);
        System.out.printf("Circumference: %.2f%n", 2.0 * Math.PI * r);
        System.out.printf("Area: %.2f%n", Math.PI * r * r);
    }
}