import java.util.Scanner;

public class LowerCaseCompare {
    public static String LowerCase(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char)(ch + 32); 
            }
            result += ch;
        }
        return result;
    }

    public static boolean compareStrings(String a, String b) {
        if (a.length() != b.length()) return false;

        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter text: ");
        String input = scanner.nextLine();

        String customLower = LowerCase(input);
        String builtInLower = input.toLowerCase();

        boolean isSame = compareStrings(customLower, builtInLower);

        System.out.println("Built-in toLowerCase(): " + builtInLower);
        System.out.println("Custom toLowerCase():   " + customLower);
        System.out.println("Are both results equal? " + isSame);
    }
}
