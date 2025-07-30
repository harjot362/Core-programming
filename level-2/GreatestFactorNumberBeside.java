import java.util.Scanner;

public class GreatestFactorNumberBeside {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("number: ");
        int number = sc.nextInt();

        int greatestFactor = 1;

        for (int i = number - 1; i >= 1; i--) {
            if (number % i == 0) {
                greatestFactor = i;
                break;
            }
        }

        //  int greatestFactor = 1;
        // int i = number - 1;

        // while (i >= 1) {
        //     if (number % i == 0) {
        //         greatestFactor = i;
        //         break;
        //     }
        //     i--;
        // }

        System.out.println("Greatest factor except the number is: " + greatestFactor);
    }
}
