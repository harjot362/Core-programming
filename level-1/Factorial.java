import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("positive integer: ");
        int num = sc.nextInt();

        if (num >= 0) {
            int fact = 1;
            int i = 1;

            while (i <= num) {
                fact = fact * i;
                i++;
            }

            System.out.println("Factorial of " + num + " is: " + fact);
        } else {
            System.out.println("Enter a non-negative integer.");
        }
    }
}
