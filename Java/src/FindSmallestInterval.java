import java.util.Arrays;
import java.util.stream.IntStream;

public class FindSmallestInterval {
    public static void main(String[] args) {
        int[] intArray = {47,19,8,9,3,-6,-3};
        int result = findSmallestInterval(intArray);
        System.out.println(result);
    }

    public static int findSmallestInterval(int[] numbers) {
        final int NO_RANGE_FOUND = -1;
        if (numbers == null || numbers.length < 2 || numbers.length > 100000) {
            return NO_RANGE_FOUND;
        }

        Arrays.sort(numbers);
        return IntStream.range(0, numbers.length - 1)
                .map(i -> numbers[i + 1] - numbers[i])
                .min()
                .orElse(NO_RANGE_FOUND);
    }
}
