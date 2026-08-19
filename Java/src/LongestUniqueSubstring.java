import java.util.HashMap;
import java.util.Map;

public class LongestUniqueSubstring {

    static void main() {
        LongestUniqueSubstring app = new LongestUniqueSubstring();
        String test = "abcabcbb";
        System.out.println(app.longestUniqueSubstring(test));
    }

    public static int longestUniqueSubstring(String s) {
        Map<Character, Integer> lastSeen = new HashMap<>();

        int left = 0;
        int maxLength = 0;

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);

            if (lastSeen.containsKey(c)) {
                left = Math.max(left, lastSeen.get(c) + 1);
            }

            lastSeen.put(c, right);
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}
