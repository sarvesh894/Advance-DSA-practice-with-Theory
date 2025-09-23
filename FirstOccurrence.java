public class FirstOccurrence {
    public static void main(String[] args) {
        int[] arr = {5, 3, 7, 3, 9, 3, 2};
        int target = 3;
        int index = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            System.out.println("First occurrence of " + target + " is at index: " + index);
        } else {
            System.out.println("Element not found.");
        }
    }
}