import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] digits = new int[10];  
        int index = 0;

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        while (num != 0 && index < 10) {
            digits[index] = num % 10;  
            num = num / 10;            
            index++;
        }

       
        System.out.print("Reversed number: ");
        for (int i = 0; i < index; i++) {
            System.out.print(digits[i]);
        }

        System.out.println(); 
    }
}