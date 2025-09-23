public class LastOccurrence {
    public static void main(String[] args) {
        int[] arr = {5, 3, 7, 3, 9, 3, 2};
        int target = 3;
        int index = -1;

        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == target) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            System.out.println("Last occurrence of " + target + " is at index: " + index);
        } else {
            System.out.println("Element not found.");
        }
    }
}