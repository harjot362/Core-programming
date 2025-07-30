import java.util.Scanner;

public class SumNumbersUntilZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int total = 0;
        int number;

        System.out.print("Enter a number to stop : ");
        number = sc.nextInt();

        while (number != 0) {
            total = total + number;

            System.out.print("Enter a number to stop : ");
            number = sc.nextInt();
        }

        System.out.println("The total sum is: " + total);
    }
}
