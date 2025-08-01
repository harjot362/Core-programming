import java.util.Scanner;

public class SubstringComparison {
    public static String createSubstring(String str, int start, int end) {
        String result = "";
        for (int i = start; i < end; i++) {
            result += str.charAt(i);
        }
        return result;
    }

    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) return false;

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.next();

        System.out.print("Enter start index: ");
        int start = scanner.nextInt();

        System.out.print("Enter end index: ");
        int end = scanner.nextInt();

        String customSubstring = createSubstring(input, start, end);

        String builtinSubstring = input.substring(start, end);

        boolean areEqual = compareStrings(customSubstring, builtinSubstring);

        System.out.println("\nSubstring using charAt(): " + customSubstring);
        System.out.println("Substring using substring(): " + builtinSubstring);
        System.out.println("Are both substrings equal? " + areEqual);
    }
}
