import java.util.*;

public class StudentGrades {
    public static int[][] generateScores(int n) {
        Random rand = new Random();
        int[][] scores = new int[n][3];
        for (int i = 0; i < n; i++) {
            scores[i][0] = 50 + rand.nextInt(50); // Physics
            scores[i][1] = 50 + rand.nextInt(50); // Chemistry
            scores[i][2] = 50 + rand.nextInt(50); // Math
        }
        return scores;
    }

    public static Object[][] calculateResults(int[][] scores) {
        int n = scores.length;
        Object[][] results = new Object[n][5]; 

        for (int i = 0; i < n; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double avg = total / 3.0;
            double percent = (total / 300.0) * 100;
            percent = Math.round(percent * 100.0) / 100.0;

            String grade;
            if (percent >= 80) grade = "A";
            else if (percent >= 70) grade = "B";
            else if (percent >= 60) grade = "C";
            else if (percent >= 50) grade = "D";
            else if (percent >= 40) grade = "E";
            else grade = "R";

            results[i][0] = total;
            results[i][1] = Math.round(avg * 100.0) / 100.0;
            results[i][2] = percent;
            results[i][3] = grade;
        }
        return results;
    }

    public static void displayScorecard(int[][] scores, Object[][] results) {
        System.out.println("Roll\tPhysics\tChem\tMaths\tTotal\tAvg\t%\tGrade");
        for (int i = 0; i < scores.length; i++) {
            System.out.print((i + 1) + "\t");
            System.out.print(scores[i][0] + "\t" + scores[i][1] + "\t" + scores[i][2] + "\t");
            System.out.print(results[i][0] + "\t" + results[i][1] + "\t" + results[i][2] + "\t" + results[i][3]);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[][] scores = generateScores(n);
        Object[][] results = calculateResults(scores);
        displayScorecard(scores, results);
    }
}
