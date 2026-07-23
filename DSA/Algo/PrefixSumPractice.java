import java.util.Arrays;

public class PrefixSumPractice {

    public static void main(String[] args) {

        // 1. ORIGINAL DATA
        int[] nums = { 10, 20, 30, 40, 50 };
        System.out.println("Original Array (Daily Earnings): " + Arrays.toString(nums));

        // 2. THE SETUP PHASE - O(N) Time
        // Create an array of the exact same size to hold the running totals
        int[] prefix = new int[nums.length];

        // The first element's total is just the first element itself
        prefix[0] = nums[0];

        // Loop through the rest of the array to build the running totals
        for (int i = 1; i < nums.length; i++) {
            // Current Total = Yesterday's Total + Today's Earnings
            prefix[i] = prefix[i - 1] + nums[i];
        }

        System.out.println("Prefix Array (Running Totals):   " + Arrays.toString(prefix));
        System.out.println("--------------------------------------------------");

        // 3. THE QUERY PHASE - O(1) Time

        // Example A: Sum from index 1 to 3 (20 + 30 + 40 = 90)
        int sumA = getRangeSum(prefix, 1, 3);
        System.out.println("Sum between Index 1 and 3: " + sumA);

        // Example B: Sum from index 0 to 2 (10 + 20 + 30 = 60)
        int sumB = getRangeSum(prefix, 0, 2);
        System.out.println("Sum between Index 0 and 2 (Edge Case): " + sumB);
    }

    /**
     * Helper method to instantly calculate the sum of a specific range using a
     * Prefix Array.
     * Time Complexity: O(1)
     */
    public static int getRangeSum(int[] prefix, int left, int right) {
        // Edge Case: If the left index is 0, we don't need to subtract anything.
        // Trying to access prefix[left - 1] when left is 0 would cause an OutOfBounds
        // error.
        if (left == 0) {
            return prefix[right];
        } else {
            return prefix[right] - prefix[left - 1];
        }
    }

}