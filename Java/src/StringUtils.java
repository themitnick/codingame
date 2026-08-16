public class StringUtils {

    static void main() {

        String[] strings = {"foo", "t", "ba", "ll", "!"};
        String result = concat(strings);
        System.out.println(result);
    }

    static String concat(String[] strings) {
        StringBuilder sb = new StringBuilder();
        for (String s : strings) {
            sb.append(s);
        }
        return sb.toString();
    }
}
