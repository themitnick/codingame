import java.util.Arrays;

public class FindLargest {

    public static void main(String[] args) {
        int [] numbers = {25,3, 5, 7, 2, 8, -1, 4,85};
        System.out.println(findLargest(numbers)); // Example usage
    }

    static int findLargest(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            return 0;
        }

        return Arrays.stream(numbers).max().getAsInt();
    }
}
