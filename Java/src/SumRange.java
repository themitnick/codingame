import java.util.Arrays;

public class SumRange {
    public static void main(String[] args) {
        int[] ints = {1,20,3,10,100,-2,110};
        int result = sunRange(ints);
        System.out.println(result);

    }

    public static int sunRange(int[] ints) {

        return Arrays.stream(ints)
                .filter(n -> n >= 10 && n <= 100)
                .sum();
    }
}
