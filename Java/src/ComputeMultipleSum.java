import java.util.stream.IntStream;

public class ComputeMultipleSum {
    public static void main(String[] args) {
        System.out.println(computeMultipleSum(1000)); // Example usage
    }

    public static int computeMultipleSum(int n) {
        if (n <= 0 || n > 1000) {
            throw new IllegalArgumentException("n must be greater than 0 and less than or equal to 1000");
        }

        return IntStream.rangeClosed(1, n)
                .filter(i -> i % 3 == 0 || i % 5 == 0 || i % 7 == 0)
                .sum();
    }
}
