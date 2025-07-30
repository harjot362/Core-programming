import java.util.Scanner;

public class HandshakesCalculator {

    public static int maxHandshakes(int n) {
        return (n * (n - 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();

        int result = maxHandshakes(n);
        System.out.println("Maximum number of handshakes among " + n + " students is: " + result);
    }
}
