public class  fibbonacci {
    static int[] dp;

    public static void main(String[] args) {
        int nums = 5;
        dp = new int[nums + 1];
        System.out.println(fib(nums));
    }

    public static int fib(int num) {
        if (num == 0 || num == 1) {
            return num;
        }

        if (dp[num] != 0) {
            return dp[num];
        }

        dp[num] = fib(num - 1) + fib(num - 2);
        return dp[num];
    }
}

