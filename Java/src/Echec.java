public class Echec {

    static void main() {
        int n = 7;
        int result = count(n);
        System.out.println("Number of pairs for n = " + n + " is: " + result);
    }

    public static int count(int n) {
        return  n * (n - 1) / 2;
    }
}
