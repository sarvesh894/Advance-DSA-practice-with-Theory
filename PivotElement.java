public class PivotElement {
    public static int findPivot(int[] arr) {
        int totalSum = 0;
        for (int i = 0; i < arr.length; i++) {
            totalSum += arr[i];
        }
        int leftSum = 0;
        for (int i = 0; i < arr.length; i++) {
            int rightSum = totalSum - leftSum - arr[i];
            if (leftSum == rightSum) {
                return i;
            }
            leftSum += arr[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 7, 3, 6, 5, 6};
        int pivotIndex = findPivot(arr);
        if (pivotIndex != -1) {
            System.out.println("Pivot element is " + arr[pivotIndex] + " at index " + pivotIndex);
        } else {
            System.out.println("No pivot element found");
        }
    }
}