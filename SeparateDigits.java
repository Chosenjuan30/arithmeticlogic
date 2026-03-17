import java.util.Scanner;

public class SeparateDigits {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a five-digit number: ");
        int number = input.nextInt();

        System.out.print(number / 10000 + "   ");
        System.out.print((number % 10000) / 1000 + "   ");
        System.out.print((number % 1000) / 100 + "   ");
        System.out.print((number % 100) / 10 + "   ");
        System.out.print(number % 10);
    }
}