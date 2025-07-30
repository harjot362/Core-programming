public class TrigonometryCalculator {

    public static double[] calculateTrigonometricFunctions(double angle) {
        double radians = Math.toRadians(angle);
        double sin = Math.sin(radians);
        double cos = Math.cos(radians);
        double tan = Math.tan(radians);
        
        return new double[] {sin, cos, tan};
    }

    public static void main(String[] args) {
        double angle = 45;
        
        double[] results = calculateTrigonometricFunctions(angle);
        
        System.out.printf("Angle: %.2f degrees\n", angle);
        System.out.printf("Sine: %.4f\n", results[0]);
        System.out.printf("Cosine: %.4f\n", results[1]);
        System.out.printf("Tangent: %.4f\n", results[2]);
    }
}
