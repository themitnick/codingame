import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MaxMin {

    public static void main(String[] args) {
        int[] valueArray = {85,1,9,952,-45};
        Map<String, Integer> result = maxMin(valueArray);
        System.out.println(result);
    }

    public static Map<String, Integer> maxMin(int[] ints) {
        Map<String, Integer> values = new HashMap<>();

        var min = Arrays.stream(ints).min().getAsInt();
        var max = Arrays.stream(ints).max().getAsInt();
        values.put("Min", min);
        values.put("Max", max);

        return values;
    }
}
