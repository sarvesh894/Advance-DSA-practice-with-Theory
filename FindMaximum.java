public class FindMaximum {
    public static int findMax(int[] arr) {
        int low = 0, high = arr.length - 1;

        while (low < high) {
            int mid = (low + high) / 2;

            if (arr[mid] > arr[high]) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }

        return arr[(low - 1 + arr.length) % arr.length];
    }

    public static void main(String[] args) {
        int[] arr = {6, 7, 8, 9, 1, 2, 3, 4, 5};
        int max = findMax(arr);
        System.out.println("Maximum element is: " + max);
    }
}