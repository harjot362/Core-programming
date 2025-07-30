import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of persons: ");
        int n = sc.nextInt();

        double[] weights = new double[n];
        double[] heights = new double[n]; 
        double[] bmi = new double[n];
        String[] status = new String[n];

       
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Person " + (i + 1));
            System.out.print("Enter weight (in kg): ");
            weights[i] = sc.nextDouble();

            System.out.print("Enter height (in meters): ");
            heights[i] = sc.nextDouble();

            
            bmi[i] = weights[i] / (heights[i] * heights[i]);

            if (bmi[i] < 18.5) {
                status[i] = "Underweight";
            } else if (bmi[i] < 25.0) {
                status[i] = "Normal weight";
            } else if (bmi[i] < 30.0) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }

        System.out.println("\n--- BMI Report ---");
        for (int i = 0; i < n; i++) {
            System.out.printf("Person %d: Height = %.2f m, Weight = %.2f kg, BMI = %.2f, Status = %s\n",
                    (i + 1), heights[i], weights[i], bmi[i], status[i]);
        }
    }
}