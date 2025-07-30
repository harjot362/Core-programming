import java.util.Scanner;

public class SumNaturalNumbers{
	public static int sumOfNaturalNumber(int n){
	int sum =0;
	for(int i=0;i<=n;i++){
	sum += i;
	}
	return sum;
	}

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer (n): ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a positive number.");
        } else {
            int result = sumOfNaturalNumber(n);
            System.out.println("Sum of first " + n + " natural numbers is: " + result);
        }
    }
}