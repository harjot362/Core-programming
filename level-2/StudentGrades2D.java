import java.util.Scanner;

public class StudentGrades2D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = scanner.nextInt();

        int[][] marks = new int[n][3];
        double[] percentage = new double[n];
        char[] grade = new char[n];


        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter marks for Student " + (i + 1) + ":");

            for (int j = 0; j < 3; j++) {
                String subject = "";
                if (j == 0) subject = "Physics";
                else if (j == 1) subject = "Chemistry";
                else subject = "Maths";

                System.out.print(subject + ": ");
                int mark = scanner.nextInt();

                if (mark < 0) {
                    System.out.println("Marks cannot be negative. Please re-enter marks for this student.");
                    i--; 
                    break;
                } else {
                    marks[i][j] = mark;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < 3; j++) {
                sum += marks[i][j];
            }
            percentage[i] = sum / 3.0;

            if (percentage[i] >= 90) grade[i] = 'A';
            else if (percentage[i] >= 80) grade[i] = 'B';
            else if (percentage[i] >= 70) grade[i] = 'C';
            else if (percentage[i] >= 60) grade[i] = 'D';
            else grade[i] = 'F';
        }

        System.out.println("\n--- Student Results ---");
        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1) + ":");
            System.out.println("  Physics: " + marks[i][0]);
            System.out.println("  Chemistry: " + marks[i][1]);
            System.out.println("  Maths: " + marks[i][2]);
            System.out.println("  Percentage: " + percentage[i] + "%");
            System.out.println("  Grade: " + grade[i]);
        }
    }
}
