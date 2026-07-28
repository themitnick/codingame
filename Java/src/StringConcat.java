public class StringConcat {

    static String concat(String[] String ) {
        StringBuilder result = new StringBuilder();
        for (String str : String) {
            if (str != null && !str.isEmpty()) {
                result.append(str);
            }
        }
        return result.toString();
    }
    
}
