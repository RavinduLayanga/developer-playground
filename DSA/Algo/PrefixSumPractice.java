import java.util.Arrays;
import java.util.HashMap;

public class PrefixSumPractice {

    public static void main(String[] args) {

        // 1. ORIGINAL DATA
        int[] nums = { 10, 20, 30, 40, 50 };
        System.out.println("Original Array (Daily Earnings): " + Arrays.toString(nums));

        // ==========================================
        // METHOD 1: THE ARRAY WAY (For finding Sums)
        // ==========================================

        // THE SETUP PHASE - O(N) Time
        int[] prefix = new int[nums.length];
        prefix[0] = nums[0];

        for (int i = 1; i < nums.length; i++) {
            prefix[i] = prefix[i - 1] + nums[i];
        }

        System.out.println("Prefix Array :   " + Arrays.toString(prefix));
        System.out.println("--------------------------------------------------");

        // THE QUERY PHASE - O(1) Time
        int sumA = getRangeSum(prefix, 1, 3);
        System.out.println("Sum between Index 1 and 3: " + sumA);

        int sumB = getRangeSum(prefix, 0, 2);
        System.out.println("Sum between Index 0 and 2: " + sumB);
        System.out.println("--------------------------------------------------");

        // ==========================================
        // METHOD 2: THE HASHMAP WAY (For finding Target K)
        // ==========================================

        int[] numbers = { 10, 20, 30, 40, 50 };
        // Look for a target sum of 30
        subArraySum(numbers, 30);
    }

    /**
     * Helper method to instantly calculate the sum of a specific range using a
     * Prefix Array.
     * Time Complexity: O(1)
     */
    public static int getRangeSum(int[] prefix, int left, int right) {
        if (left == 0) {
            return prefix[right];
        } else {
            return prefix[right] - prefix[left - 1];
        }
    }

    /**
     * Helper method to instantly find which contiguous days equal a target sum 'k'.
     * Time Complexity: O(N)
     */
    public static void subArraySum(int[] numbers, int k) {
        // Map stores: { Running_Sum : Day_Index }
        HashMap<Integer, Integer> map = new HashMap<>();

        // Base case: Before day 0, running total was 0
        map.put(0, -1);

        int runningSum = 0;

        for (int i = 0; i < numbers.length; i++) {

            // 1. Add today's money to running total
            runningSum = runningSum + numbers[i];

            // 2. What past sum do need to chop off?
            int targetPastSum = runningSum - k;

            // 3. Have ever seen this past sum?
            if (map.containsKey(targetPastSum)) {
                // found it! Calculate the correct start and end days
                int startDay = map.get(targetPastSum) + 1;
                int endDay = i;
                System.out.println("Found a match! Days " + startDay + " to " + endDay + " equal " + k);
            }

            // 4. Save today's running total into history for future loops
            map.put(runningSum, i);
        }
    }
}