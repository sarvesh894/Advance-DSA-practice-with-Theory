public class SquareRoot {
    public static int sqrt(int x) {
        if (x == 0 || x == 1) return x;

        int low = 1, high = x, ans = 0;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (mid <= x / mid) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int number = 25;
        int result = sqrt(number);
        System.out.println("Square root of " + number + " is: " + result);
    }
}