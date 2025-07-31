public class NumberChecker {
    public static int countDigits(int num) {
        int count = 0;
        num = Math.abs(num);
        while (num > 0) {
            num /= 10;
            count++;
        }
        return count;
    }

    public static int[] digitsArray(int num) {
        int length = countDigits(num);
        int[] digits = new int[length];
        num = Math.abs(num);
        for (int i = length - 1; i >= 0; i--) {
            digits[i] = num % 10;
            num /= 10;
        }
        return digits;
    }

    public static boolean isDuckNumber(int[] digits) {
        for (int d : digits) {
            if (d != 0) return true;
        }
        return false;
    }

    public static boolean isArmstrong(int num, int[] digits) {
        int n = digits.length;
        int sum = 0;
        for (int d : digits) {
            int power = 1;
            for (int i = 0; i < n; i++) {
                power *= d;
            }
            sum += power;
        }
        return sum == Math.abs(num);
    }

    public static int[] largestTwo(int[] digits) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int d : digits) {
            if (d > largest) {
                secondLargest = largest;
                largest = d;
            } else if (d > secondLargest && d != largest) {
                secondLargest = d;
            }
        }
        return new int[]{largest, secondLargest};
    }

    public static int[] smallestTwo(int[] digits) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        for (int d : digits) {
            if (d < smallest) {
                secondSmallest = smallest;
                smallest = d;
            } else if (d < secondSmallest && d != smallest) {
                secondSmallest = d;
            }
        }
        return new int[]{smallest, secondSmallest};
    }

    public static void main(String[] args) {
        int number = 153;

        int count = countDigits(number);
        int[] digits = digitsArray(number);
        boolean duck = isDuckNumber(digits);
        boolean armstrong = isArmstrong(number, digits);
        int[] largest = largestTwo(digits);
        int[] smallest = smallestTwo(digits);

        System.out.println("Number: " + number);
        System.out.println("Count of digits: " + count);

        System.out.print("Digits: ");
        for (int d : digits) System.out.print(d + " ");
        System.out.println();

        System.out.println("Is Duck Number: " + duck);
        System.out.println("Is Armstrong Number: " + armstrong);

        System.out.println("Largest digit: " + largest[0]);
        System.out.println("Second Largest digit: " + (largest[1] == Integer.MIN_VALUE ? "None" : largest[1]));

        System.out.println("Smallest digit: " + smallest[0]);
        System.out.println("Second Smallest digit: " + (smallest[1] == Integer.MAX_VALUE ? "None" : smallest[1]));
    }
}
