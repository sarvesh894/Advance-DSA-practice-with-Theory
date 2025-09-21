public class SquareRootBinary {
    public static void main(String[] args) {
        double number = 49;
        double precision = 0.0001;

        double sqrt = findSquareRoot(number, precision);
        System.out.println("Square root of " + number + " is: " + sqrt);
    }

    public static double findSquareRoot(double num, double precision) {
        if (num < 0) return -1;

        double low = 0;
        double high = num;
        double mid;

        while ((high - low) > precision) {
            mid = (low + high) / 2;
            if (mid * mid > num) {
                high = mid;
            } else {
                low = mid;
            }
        }

        return (low + high) / 2;
    }
}