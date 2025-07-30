import java.util.Scanner;

public class ChocolateDivider {

public static int[] findRemainderAndQuotient(int number, int divisor) {
        return new int[] { number / divisor, number % divisor };
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Number of chocolates: ");
        int chocolates = scanner.nextInt();

        System.out.print("Number of children: ");
        int children = scanner.nextInt();

        if (children == 0) {
            System.out.println("Cannot divide by zero children!");
        } else {
            int[] result = findRemainderAndQuotient(chocolates, children);
            System.out.println("Each child gets: " + result[0]);
            System.out.println("Remaining chocolates: " + result[1]);
        }
    }
}
