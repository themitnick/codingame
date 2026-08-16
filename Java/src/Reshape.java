public class Reshape {

    static void main() {
        String str = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.";
        int n = 20;
        String reshapedStr = reshape(n, str);
        System.out.println(reshapedStr);
    }

    /***
     * la methode reshape doit retourner la chaîne str sans les espaces et formattée en lignes
     * de n caractères maximum
     * @param n
     * @param str
     * @return
     */
    public static String reshape(int n, String str) {
        if (n <= 0) {
            throw new IllegalArgumentException("n must be greater than 0");
        }
        StringBuilder result = new StringBuilder();
        String[] words = str.split(" ");
        StringBuilder line = new StringBuilder();

        for (String word : words) {
            if (line.length() + word.length() + 1 > n) {
                result.append(line.toString().trim()).append("\n");
                line.setLength(0);
            }
            line.append(word).append(" ");
        }
        if (line.length() > 0) {
            result.append(line.toString().trim());
        }

        return result.toString();
    }
}
