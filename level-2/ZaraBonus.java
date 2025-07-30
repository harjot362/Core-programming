import java.util.Scanner;

public class ZaraBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 10;
        double[] salary = new double[n];
        double[] years = new double[n];
        double[] bonus = new double[n];
        double[] newSalary = new double[n];

        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Enter salary for employee " + (i + 1) + ": ");
            salary[i] = sc.nextDouble();

            System.out.print("Enter years of service for employee " + (i + 1) + ": ");
            years[i] = sc.nextDouble();
        }

            if (years[i] > 5) {
                bonus[i] = salary[i] * 0.05;  
            } else {
                bonus[i] = salary[i] * 0.02;  
            }
            newSalary[i] = salary[i] + bonus[i];

            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }


        System.out.println("\nEmployee Bonus Details:");
        for (int i = 0; i < n; i++) {
            System.out.println("Employee " + (i + 1) + ": Old Salary = " + salary[i] + 
                               ", Bonus = " + bonus[i] + 
                               ", New Salary = " + newSalary[i]);
        }

        System.out.println("\nTotal Bonus Payout = " + totalBonus);
        System.out.println("Total Old Salary = " + totalOldSalary);
        System.out.println("Total New Salary = " + totalNewSalary);
    }
}
