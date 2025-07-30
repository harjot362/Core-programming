import java.util.Scanner;

public class ForLoopFactorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int num = sc.nextInt();

        if (num >= 0) {
            int fact = 1;

            for (int i = 1; i <= num; i++) {
                fact = fact * i;
            }

            System.out.println("Factorial of " + num + " is: " + fact);
        } else {
            System.out.println("Enter a non-negative integer.");
        }
    }
}
