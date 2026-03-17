import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int num1 = input.nextInt();

        System.out.print("Enter second integer: ");
        int num2 = input.nextInt();

        int square1 = num1 * num1;
        int square2 = num2 * num2;

        int sum = square1 + square2;
        int difference = square1 - square2;

        System.out.println("Square of first number: " + square1);
        System.out.println("Square of second number: " + square2);
        System.out.println("Sum of squares: " + sum);
        System.out.println("Difference of squares: " + difference);
    }
}