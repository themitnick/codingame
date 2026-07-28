import java.util.HashMap;
import java.util.Map;

public class CountFrequencies {
    public static void main(String[] args) {
        String[] words = {"apple", "banana", "apple", "orange", "banana", "apple"};
        countFrequencies(words);
    }

    public static void countFrequencies(String[] word) {
        Map<String, Integer> frequencyMap = new HashMap<>();

        for (String w : word) {
            frequencyMap.put(w, frequencyMap.getOrDefault(w, 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

    }
}
