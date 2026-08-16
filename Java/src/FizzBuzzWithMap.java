import java.util.Map;
import java.util.TreeMap;

public class FizzBuzzWithMap {

    static void main() {
        FizzBuzzWithMap app = new FizzBuzzWithMap();
        Map<Integer, String> map = Map.of(
                2, "Two",
                3, "Fizz",
                5, "Buzz",
                7, "Bazz",
                11, "Bang"
        );

        int[] tests = {1, 2, 3, 5, 6, 7, 11, 14, 15, 21, 22, 30, 35, 42, 77, 97};
        for (int n : tests) {
            System.out.println(n + " -> " + app.fizzBuzz(n, map));
        }
    }

    public String fizzBuzz(int number, Map<Integer, String> map) {
        StringBuilder result = new StringBuilder();

        for (Map.Entry<Integer, String> entry : new TreeMap<>(map).entrySet()) {
            int divisor = entry.getKey();
            if (divisor != 0 && number % divisor == 0) {
                result.append(entry.getValue());
            }
        }

        return result.isEmpty() ? String.valueOf(number) : result.toString();
    }
}
