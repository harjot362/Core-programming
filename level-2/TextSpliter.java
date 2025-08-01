import java.util.Scanner;

public class TextSplitter {
    public static int getLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (Exception e) {
        }
        return count;
    }

    public static String[] mySplit(String str) {
        int len = getLength(str);
        int wordCount = 1; 

        for (int i = 0; i < len; i++) {
            if (str.charAt(i) == ' ') {
                wordCount++;
            }
        }

        String[] words = new String[wordCount];
        String word = "";
        int index = 0;

        for (int i = 0; i < len; i++) {
            char ch = str.charAt(i);
            if (ch == ' ') {
                words[index++] = word;
                word = "";
            } else {
                word += ch;
            }
        }

        words[index] = word; 
        return words;
    }

    public static boolean compareArrays(String[] a, String[] b) {
        if (a.length != b.length) return false;

        for (int i = 0; i < a.length; i++) {
            if (!a[i].equals(b[i])) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();

        String[] builtIn = input.split(" ");
        String[] custom = mySplit(input);

        boolean same = compareArrays(builtIn, custom);


        System.out.println("Built-in split():");
        for (String word : builtIn) {
            System.out.println(word);
        }

        System.out.println("Custom split:");
        for (String word : custom) {
            System.out.println(word);
        }

        System.out.println("Are both splits equal? " + same);
    }
}
