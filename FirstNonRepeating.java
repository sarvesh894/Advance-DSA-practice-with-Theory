import java.util.HashMap;

public class FirstNonRepeating {
    public static void main(String[] args) {
        int[] arr = {9, 4, 9, 6, 7, 4};

        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        for (int num : arr) {
            if (freq.get(num) == 1) {
                System.out.println("First non-repeating element: " + num);
                break;
            }
        }
    }
}