import java.util.Scanner;

public class Multiples {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int num1 = input.nextInt();

        System.out.print("Enter second integer: ");
        int num2 = input.nextInt();

        int doubled = num2 * 2;

        if (num1 % doubled == 0)
            System.out.println("First number is a multiple of second number doubled");

        if (num1 % doubled != 0)
            System.out.println("First number is NOT a multiple of second number doubled");
    }
}