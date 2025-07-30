import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("number: ");
        int number = sc.nextInt();

        int sum = 0;
        int original = number;

        while (original != 0) {
            int digit = original % 10;
            sum += digit * digit * digit;
            original = original / 10;
        }

        if (sum == number) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }
}
