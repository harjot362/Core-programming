import java.util.Scanner;

public class CheckLargest{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("number1 : ");
        int number1 = scanner.nextInt();
        System.out.print("number2 : ");
        int number2 = scanner.nextInt();
        System.out.print("number3: ");
        int number3 = scanner.nextInt();

        if (number1 > number2 && number1 > number3) {
            System.out.println("Is the first number the largest? true");
            System.out.println("Is the second number the largest? false");
            System.out.println("Is the third number the largest? false");
        } else if (number2 > number1 && number2 > number3) {
            System.out.println("Is the first number the largest? false");
            System.out.println("Is the second number the largest? true");
            System.out.println("Is the third number the largest? false");
        } else if (number3 > number1 && number3 > number2) {
            System.out.println("Is the first number the largest? false");
            System.out.println("Is the second number the largest? false");
            System.out.println("Is the third number the largest? true");
        } else {
            System.out.println("There is a tie. No single number is the largest.");
        }
    }
}
