public class FootballHeights {

    public static int[] generateHeights(int size) {
        int[] heights = new int[size];

        for (int i = 0; i < size; i++) {
            heights[i] = (int)(Math.random() * 101) + 150;
        }
        return heights;
    }

    public static int findSum(int[] heights) {
        int sum = 0;
        for (int h : heights) {
            sum += h;
        }
        return sum;
    }

    public static double findMean(int[] heights) {
        return (double) findSum(heights) / heights.length;
    }

    public static int findShortest(int[] heights) {
        int min = heights[0];
        for (int h : heights) {
            if (h < min) min = h;
        }
        return min;
    }

    public static int findTallest(int[] heights) {
        int max = heights[0];
        for (int h : heights) {
            if (h > max) max = h;
        }
        return max;
    }

    public static void main(String[] args) {

        int teamSize = 11;
        int[] heights = generateHeights(teamSize);

        System.out.println(" FOOTBALL TEAM HEIGHT ANALYZER");

        System.out.println("\nPlayer Heights:");

        for (int i = 0; i < heights.length; i++) {
            System.out.println("Player " + (i + 1) + " : " + heights[i] + " cm");
        }

        int sum = findSum(heights);
        double mean = findMean(heights);
        int shortest = findShortest(heights);
        int tallest = findTallest(heights);

        System.out.println("              RESULTS");

        System.out.println("Total Height  : " + sum + " cm");
        System.out.printf("Mean Height   : %.2f cm\n", mean);
        System.out.println("Shortest      : " + shortest + " cm");
        System.out.println("Tallest       : " + tallest + " cm");

        System.out.println("\nThank you for using Height Analyzer ");
    }
}
