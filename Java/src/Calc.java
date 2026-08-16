public class Calc {

    static void main() {
        int[] array = {1, 2, 3, 4, 5};
        int n1 = 1;
        int n2 = 3;
        int result = calc(array, n1, n2);
        System.out.println("Sum of elements from index " + n1 + " to " + n2 + " is: " + result);
    }

    public static int calc(int[] array, int n1, int n2) {
        // doit retourner la sommes des elements du tableau compris entre les indices n1 et n2 inclus
        if (n1 < 0 || n2 >= array.length || n1 > n2) {
            throw new IllegalArgumentException("Invalid indices");
        }
        int sum = 0;
        for (int i = n1; i <= n2; i++) {
            sum += array[i];
        }
        return sum;
    }


}
