import java.util.HashMap;
import java.util.Map;

public class FirstUniqueIndex {

    static void main() {
        FirstUniqueIndex app = new FirstUniqueIndex();
        String test = "abcabcx";
        System.out.println(app.firstUniqueIndex(test));
    }

    public int firstUniqueIndex(String s) {
        Map<Character, Integer> counts = new HashMap<>();

        for (char c : s.toCharArray()) {
            counts.merge(c, 1, Integer::sum);
        }

        for (int i = 0; i < s.length(); i++) {
            if (counts.get(s.charAt(i)) == 1) {
                return i;
            }
        }

        return -1;
    }
}
