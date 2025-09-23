public class RotationCount {
    public static int countRotations(int[] arr) {
        int low = 0, high = arr.length - 1;

        while (low < high) {
            int mid = (low + high) / 2;

            if (arr[mid] > arr[high]) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }

        return low;
    }

    public static void main(String[] args) {
        int[] arr = {6, 7, 8, 9, 1, 2, 3, 4, 5};
        int rotations = countRotations(arr);
        System.out.println("Array has been rotated " + rotations + " times.");
    }
}