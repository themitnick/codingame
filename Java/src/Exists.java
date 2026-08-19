import java.util.Arrays;

public class Exists {

    public static void main(String[] args) {
        int[] ints = {1, 2, 3, 4, 5};
        int k = 3;
        System.out.println(exists(ints, k));
    }

    static boolean exists(int[] ints, int k) {
        //Check if k exists in ints return true otherwise false
        //ints est trié par ordre croissant -> recherche binaire en O(log n)
        return Arrays.binarySearch(ints, k) >= 0;
    }
}
