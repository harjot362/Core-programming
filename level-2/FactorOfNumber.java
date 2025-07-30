import java.util.Scanner;

public class FactorOfNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("positive integer: ");
        int number = scanner.nextInt();

        if (number <= 0) {
            System.out.println(" negative integer");
        } else {
            System.out.println("Factors of " + number + " are:");

            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    System.out.println(i);
                }
            }
        }
    }
}
