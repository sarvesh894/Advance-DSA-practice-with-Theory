public class TotalOccurrence {
    public static void main(String[] args) {
        int[] arr = {5, 3, 7, 3, 9, 3, 2};
        int target = 3;
        int count = 0;

        for (int num : arr) {
            if (num == target) {
                count++;
            }
        }

        System.out.println("Total occurrences of " + target + ": " + count);
    }
}