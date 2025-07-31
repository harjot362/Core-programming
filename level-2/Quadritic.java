import java.util.Scanner;

public class Quadritic{
	public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a: ");
        double a = scanner.nextDouble();

        System.out.print("Enter b: ");
        double b = scanner.nextDouble();

        System.out.print("Enter c: ");
        double c = scanner.nextDouble();

        double[] roots = findRoots(a, b, c);

        if (roots.length == 0) {
            System.out.println("No real roots.");
        } else if (roots.length == 1) {
            System.out.println("One root: " + roots[0]);
        } else {
            System.out.println("Two roots: " + roots[0] + " and " + roots[1]);
        }
	}

	public static double[] findRoots(double a, double b, double c) {
        double delta = Math.pow(b, 2) - 4 * a * c;  //  b^2 - 4ac

        if (delta > 0) {
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
            return new double[] {root1, root2};
        } else if (delta == 0) {
            double root = -b / (2 * a);
            return new double[] {root};
        } else {
            // delta < 0, no real roots
            return new double[0];
        }
    }

}