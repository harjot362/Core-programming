import java.util.Scanner;

public class NaturalNumberSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("natural number: ");
        int n = sc.nextInt();

        if (n >= 1) {
            int sum = 0, i = 1;

            while (i <= n) {
                sum = sum + i;
                i++;
            }

            int formulaSum = n * (n + 1) / 2;

            if (sum == formulaSum) {
                System.out.println("Both results are correct.");
            }
        } else {
            System.out.println("The number " + n + " is not a natural number.");
        }
    }
}
