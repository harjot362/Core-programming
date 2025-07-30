import java.util.Scanner;

public class CheckNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];  

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter a Number: ");
            numbers[i] = scanner.nextInt();

            if (numbers[i] > 0) {
                System.out.println("Number is positive.");
                if (numbers[i] % 2 == 0) {
                    System.out.println("Even number.");
                } else {
                    System.out.println("Odd number.");
                }
            } else if (numbers[i] < 0) {
                System.out.println("Number is negative.");
            } else {
                System.out.println("Number is 0.");
            }
        }

        int first = numbers[0];
        int last = numbers[4];

        System.out.println("\nComparison between first and last element:");
        if (first == last) {
            System.out.println("First and last elements are equal.");
        } else if (first > last) {
            System.out.println("First element is greater than last element.");
        } else {
            System.out.println("First element is less than last element.");
        }
    }
}
