import java.util.Scanner;

public class YoungestFriends {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("age of Amar: ");
        int ageAmar = sc.nextInt();
        System.out.print("height of Amar: ");
        int heightAmar = sc.nextInt();

        System.out.print("age of Akbar: ");
        int ageAkbar = sc.nextInt();
        System.out.print("height of Akbar: ");
        int heightAkbar = sc.nextInt();

        System.out.print("age of Anthony: ");
        int ageAnthony = sc.nextInt();
        System.out.print("height of Anthony: ");
        int heightAnthony = sc.nextInt();


        if (ageAmar <= ageAkbar && ageAmar <= ageAnthony) {
            System.out.println("Youngest friend is Amar");
        } else if (ageAkbar <= ageAmar && ageAkbar <= ageAnthony) {
            System.out.println("Youngest friend is Akbar");
        } else {
            System.out.println("Youngest friend is Anthony");
        }


        if (heightAmar >= heightAkbar && heightAmar >= heightAnthony) {
            System.out.println("Tallest friend is Amar");
        } else if (heightAkbar >= heightAmar && heightAkbar >= heightAnthony) {
            System.out.println("Tallest friend is Akbar");
        } else {
            System.out.println("Tallest friend is Anthony");
        }
    }
}
