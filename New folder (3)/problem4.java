import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MultipleCounts {
    public static Map<Integer, Integer> multipleCounts(int[] numbers) {
        Map<Integer, Integer> result = new HashMap<>();

        for (int i = 1; i <= 9; i++) {
            int count = 0;
            for (int num : numbers) {
                if (num % i == 0) {
                    count++;
                }
            }
            result.put(i, count);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] inputArray = {1, 2, 8, 9, 12, 46, 76, 82, 15, 20, 30};
        Map<Integer, Integer> output = multipleCounts(inputArray);
        System.out.println(output);
    }
}
