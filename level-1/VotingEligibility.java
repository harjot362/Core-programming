import java.util.Scanner;

public class VotingEligibility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfStudents = 10;
        
        for (int i = 1; i <= numberOfStudents; i++) {
            System.out.print("Enter age of student " + i + ": ");
            int age = scanner.nextInt();

            if (age < 0) {
                System.out.println("Invalid age.");
            } else if (age >= 18) {
                System.out.println("Student aged " + age + " is eligible to vote.");
            } else {
                System.out.println("Student aged " + age + " is not eligible to vote.");
            }
        }
    }
}
