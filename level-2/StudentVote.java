import java.util.Scanner;

public class StudentVoteChecker {
    public boolean canStudentVote(int age) {
        if (age < 0) {
            return false; // Invalid age
        } else if (age >= 18) {
            return true; // Eligible to vote
        } else {
            return false; // Not eligible
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentVoteChecker checker = new StudentVoteChecker();

        int[] studentAges = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            studentAges[i] = sc.nextInt();

            boolean canVote = checker.canStudentVote(studentAges[i]);

            if (studentAges[i] < 0) {
                System.out.println("Invalid age entered. Cannot vote.");
            } else if (canVote) {
                System.out.println("Student " + (i + 1) + " can vote.");
            } else {
                System.out.println("Student " + (i + 1) + " cannot vote.");
            }
        }
    }
}
