import java.util.Arrays;

public class FilterWords {
    public static void main(String[] args) {

        String[] wordsValue = {"the", "dog", "got", "a", "bone", "manière", "end"};
        String letters = "ad";
        String[] result = filterWords(wordsValue, letters);
        System.out.println(Arrays.toString(result));
    }

    public static String[] filterWords(String[] words, String letters) {
        return Arrays.stream(words)
                .filter(word -> letters.chars()
                        .mapToObj(c -> String.valueOf((char) c))
                        .anyMatch(word::contains))
                .toArray(String[]::new);
    }
}
