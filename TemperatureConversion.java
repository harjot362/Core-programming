import java.util.Scanner;

class TemperatureConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter temperature in Fahrenheit: ");
        int Celsius = sc.nextInt();
        
        
        int Fahrenheit = (Celsius * 9/5) + 32;
        
        System.out.println("Temperature in Fahrenheit: " + Fahrenheit);
        
        sc.close();
    }
}
