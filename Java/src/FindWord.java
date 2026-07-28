import java.util.*;

public class FindWord {
    public static void main(String[] args) {

        // Test cases
        List<String> test1 = Arrays.asList("P>E", "E>R", "R>U");
        System.out.println(findWord(test1)); // Should print "PERU"

        List<String> test2 = Arrays.asList("I>N", "A>I", "P>A", "S>P");
        System.out.println(findWord(test2)); // Should print "SPAIN"

        List<String> test3 = Arrays.asList("U>N", "G>A", "R>Y", "H>U", "N>G", "A>R");
        System.out.println(findWord(test3)); // Should print "HUNGARY"

        List<String> test4 = Arrays.asList("I>F", "W>I", "S>W", "F>T");
        System.out.println(findWord(test4)); // Should print "SWIFT"

        List<String> test5 = Arrays.asList("R>T", "A>L", "P>O", "O>R", "G>A", "T>U", "U>G");
        System.out.println(findWord(test5)); // Should print "PORTUGAL"

        List<String> test6 = Arrays.asList("W>I", "R>L", "T>Z", "Z>E", "S>W", "E>R", "L>A", "A>N", "N>D", "I>T");
        System.out.println(findWord(test6)); // Should print "SWITZERLAND"

        List<String> test7 = List.of("O>K");
        System.out.println(findWord(test7)); // Should print "OK"

    }

    public static String findWord(List<String> combinations) {
        // Create a map to store the edges (currentChar -> nextChar)
        Map<Character, Character> edgeMap = new HashMap<>();
        // Create a set to keep track of all destination characters
        Set<Character> destinations = new HashSet<>();

        // Populate the edge map and destination set
        for (String combo : combinations) {
            char from = combo.charAt(0);
            char to = combo.charAt(2);
            edgeMap.put(from, to);
            destinations.add(to);
        }

        // Find the starting character (the one that isn't a destination)
        char start = ' ';
        for (String combo : combinations) {
            char candidate = combo.charAt(0);
            if (!destinations.contains(candidate)) {
                start = candidate;
                break;
            }
        }

        // Reconstruct the word by following the edges
        StringBuilder word = new StringBuilder();
        char current = start;
        while (current != '\0') {
            word.append(current);
            current = edgeMap.getOrDefault(current, '\0');
        }

        return word.toString();
    }

}
