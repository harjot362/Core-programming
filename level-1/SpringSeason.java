import java.util.Scanner;

public class SpringSeason {

    public static boolean isSpringSeason(int month, int day) {
        // March
        if (month == 3 && day >= 20 && day <= 31) {
            return true;
        }
        // April
        else if (month == 4 && day >= 1 && day <= 30) {
            return true;
        }
        // May
        else if (month == 5 && day >= 1 && day <= 31) {
            return true;
        }
        // June
        else if (month == 6 && day >= 1 && day <= 20) {
            return true;
        }
        // not spring
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter month (1-12): ");
        int month = scanner.nextInt();

        System.out.print("Enter day (1-31): ");
        int day = scanner.nextInt();

        if (isSpringSeason(month, day)) {
            System.out.println("It's a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
    }
}
