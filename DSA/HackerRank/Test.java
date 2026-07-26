public class Test {
    public static void main(String[] args) {
        int[][] arr = new int[6][6];
        int maxSum = Integer.MIN_VALUE;
        for (int r = 0; r <= 3; r++) {
            for (int c = 0; c <= 3; c++) {
                int currentSum = arr[r][c] + arr[r][c + 1] + arr[r][c + 2] +
                        arr[r + 1][c + 1] + arr[r + 2][c] + arr[r + 2][c + 1] + arr[r + 2][c + 2];

                if (currentSum > maxSum) {
                    maxSum = currentSum;
                }

            }
        }
    }

}
