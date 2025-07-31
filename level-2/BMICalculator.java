import java.util.Scanner;

public class BMICalculator{
    public static void main(String[] args) {
        double[] weight = new double[10];
        double[] height = new double[10];
        double[] bmi = new double[10];
        String[] status = new String[10];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.println("Enter details for person " + (i + 1));
            System.out.print("Weight in kg: ");
            weight[i] = scanner.nextDouble();
            System.out.print("Height in cm: ");
            height[i] = scanner.nextDouble();

            bmi[i] = calculateBMI(weight[i], height[i]);
            status[i] = determineBMIStatus(bmi[i]);
        }

        System.out.println("Weight(kg) Height(cm) BMI Status");
        for (int i = 0; i < 10; i++) {
            System.out.println(weight[i] + " " + height[i] + " " + bmi[i] + " " + status[i]);
        }

        scanner.close();
    }

    private static double calculateBMI(double weight, double heightCm) {
        double heightM = heightCm / 100.0;
        return weight / (heightM * heightM);
    }

    private static String determineBMIStatus(double bmi) {
        if (bmi < 18.5) return "Underweight";
        else if (bmi < 25) return "Normal weight";
        else if (bmi < 30) return "Overweight";
        else return "Obese";
    }
}
