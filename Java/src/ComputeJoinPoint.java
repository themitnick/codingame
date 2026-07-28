import java.util.function.IntUnaryOperator;

public class ComputeJoinPoint {

    public static void main(String[] args) {
        int seq1 = 471;
        int seq2 = 480;
        int result = computeJoinPoint(seq1, seq2);
        System.out.println(result);
    }

    public static int computeJoinPoint(int seq1, int seq2) {
        IntUnaryOperator sumDigits = n -> {
            int sum = 0;
            while (n > 0) {
                sum += n % 10;
                n /= 10;
            }
            return sum;
        };

        int a = seq1;
        int b = seq2;
        while (a != b) {
            if (a < b) {
                a += sumDigits.applyAsInt(a);
            } else {
                b += sumDigits.applyAsInt(b);
            }
        }
        return a;
    }
}
