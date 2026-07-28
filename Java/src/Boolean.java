import java.util.concurrent.ForkJoinPool;

public class Boolean {
    public static void main(String[] args) {
        System.out.println(a(-1,2));
        int threadCount = ForkJoinPool.getCommonPoolParallelism();
        System.out.println("Number of threads: " + threadCount);
    }

    public static boolean a(int i, int j) {
//        var sum = i + j;
//        return sum == 1 || (i == 1 || j == 1);
        return i == 1 || j == 1 || (i + j) == 1;
    }
}
