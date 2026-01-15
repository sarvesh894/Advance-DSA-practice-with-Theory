public class SuffixSumArray {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10};
        int n = arr.length;
        int[] suffixSum = new int[n];

        suffixSum[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            suffixSum[i] = arr[i] + suffixSum[i + 1];
        }

        System.out.println("Original Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        System.out.println("\nSuffix Sum Array:");
        for (int num : suffixSum) {
            System.out.print(num + " ");
        }
    }
}