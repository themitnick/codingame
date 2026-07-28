import java.util.Arrays;

public class FindClosestToZero {
    public static void main(String[] args) {

        int[] testValue = {5,11,-6,10,5,-2,-15,-7,9,258,-96,14,98,-5,-6,-8,-87,-10,125,74,96,-836,147,2};
        int result = closestToZero(testValue);
        System.out.println(result);

    }
    public static int closestToZero(int[] temps) {
        if (temps == null || temps.length == 0 || temps.length > 10000) {
            return 0;
        }

        return Arrays.stream(temps)
                .boxed()
                .min((a, b) -> {
                    int compareAbs = Integer.compare(Math.abs(a), Math.abs(b));
                    return compareAbs != 0 ? compareAbs : Integer.compare(b, a);
                })
                .orElse(0);
    }
}
