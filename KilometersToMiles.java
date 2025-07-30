import java.util.Scanner;

public class KilometersToMiles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double kilometer = scanner.nextDouble();

        double miles = kilometer * 0.621371;

        System.out.println(miles);
    }
}
