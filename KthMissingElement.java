public class KthMissingElement {
    public static int findKthMissing(int[] arr, int k) {
        int missingCount = 0;
        int expected = arr[0];

        for (int i = 0; i < arr.length; i++) {
            while (expected < arr[i]) {
                missingCount++;
                if (missingCount == k) return expected;
                expected++;
            }
            expected = arr[i] + 1;
        }

        while (missingCount < k) {
            missingCount++;
            if (missingCount == k) return expected;
            expected++;
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 7, 10};
        int k = 5;
        System.out.println(findKthMissing(arr, k));
    }
}