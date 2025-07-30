import java.util.Scanner;

public class TriangularPark {

    public static double calculatePerimeter(double a, double b, double c) {
        return a + b + c;
    }

    public static int calculateRounds(double perimeter) {
        double distanceToRun = 5000.0; 
        return (int) Math.ceil(distanceToRun / perimeter); 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter side A of the triangle : ");
        double sideA = scanner.nextDouble();

        System.out.print("Enter side B of the triangle : ");
        double sideB = scanner.nextDouble();

        System.out.print("Enter side C of the triangle : ");
        double sideC = scanner.nextDouble();

        double perimeter = calculatePerimeter(sideA, sideB, sideC);
        int rounds = calculateRounds(perimeter);

        System.out.println("The athlete needs to complete " + rounds + " rounds to run 5 km.");

        scanner.close();
    }
}
