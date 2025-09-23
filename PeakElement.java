public class PeakElement {
    public static void main(String[] args) {
        int[] arr = {1, 3, 20, 4, 1, 0};
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            boolean isPeak = false;

            if (i == 0 && arr[i] >= arr[i + 1]) {
                isPeak = true;
            } else if (i == n - 1 && arr[i] >= arr[i - 1]) {
                isPeak = true;
            } else if (i > 0 && i < n - 1 && arr[i] >= arr[i - 1] && arr[i] >= arr[i + 1]) {
                isPeak = true;
            }

            if (isPeak) {
                System.out.println("Peak element found: " + arr[i] + " at index " + i);
                break; 
            }
        }
    }
}