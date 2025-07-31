import java.util.Random;

public class FootballTeamHeights{
    public static void main(String[] args) {
        int[] heights = new int[11];
        Random rand = new Random();

        for (int i = 0; i < heights.length; i++) {
            heights[i] = rand.nextInt(101) + 150;
        }

        int sum = 0;
        int shortest = heights[0];
        int tallest = heights[0];

        for (int h : heights) {
            sum += h;
            if (h < shortest) shortest = h;
            if (h > tallest) tallest = h;
        }

        double mean = (double) sum / heights.length;

        System.out.print("Player heights: ");
        for (int h : heights) {
            System.out.print(h + " ");
        }
        System.out.println();

        System.out.println("Sum of heights: " + sum);
        System.out.println("Mean height: " + mean);
        System.out.println("Shortest height: " + shortest);
        System.out.println("Tallest height: " + tallest);
    }
}
