import java.util.stream.Collectors;

public class Twin {
    public static void main(String[] args) {
        String a = "Marion";
        String b = "Romain";
        boolean result = isTwin(a, b);
        System.out.println(result);
    }

    static boolean isTwin(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        }
        String sortedA = a.toLowerCase().chars()
                .sorted()
                .mapToObj(c -> String.valueOf((char) c))
                .collect(Collectors.joining());

        String sortedB = b.toLowerCase().chars()
                .sorted()
                .mapToObj(c -> String.valueOf((char) c))
                .collect(Collectors.joining());
                
        return sortedA.equals(sortedB);
    }



}
