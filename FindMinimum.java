public class FindMinimum {
    public static int findMin(int[] arr) {
        int low = 0, high = arr.length - 1;

        while (low < high) {
            int mid = (low + high) / 2;

            if (arr[mid] > arr[high]) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }

        return arr[low];
    }

    public static void main(String[] args) {
        int[] arr = {6, 7, 8, 9, 1, 2, 3, 4, 5};
        int min = findMin(arr);
        System.out.println("Minimum element is: " + min);
    }
}