import java.util.Scanner;

public class CharArrayComparison {

    public static char[] CharArray(String str) {
        char[] chars = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            chars[i] = str.charAt(i);
        }
        return chars;
    }

    public static boolean ArraysEqual(char[] a, char[] b) {
        if (a.length != b.length) return false;

        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.next();

        char[] custom = CharArray(input);
        char[] builtIn = input.toCharArray();

        boolean same = ArraysEqual(custom, builtIn);

        System.out.println("Custom method: " + java.util.Arrays.toString(custom));
        System.out.println("Built-in method: " + java.util.Arrays.toString(builtIn));
        System.out.println("Are both arrays equal? " + same);
    }
}
