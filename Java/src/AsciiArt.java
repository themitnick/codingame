import java.util.stream.IntStream;

public class AsciiArt {

    public static void main(String[] args) {
        char scan = scanChar(printChar('O'));
        System.out.println(scan);

        boolean allOk = true;
        for (char c = 'A'; c <= 'Z'; c++) {
            String art = printChar(c);
            char r1 = scanChar(art);
            char r2 = scanChar2(art);
            if (r1 != c || r2 != c) {
                allOk = false;
                System.out.println("ERREUR pour " + c + " : scanChar=" + r1 + ", scanChar2=" + r2);
            }
        }
        System.out.println("Coherence A-Z : " + (allOk ? "OK" : "ECHEC"));
        System.out.println("Art inconnu -> " + scanChar("???"));
    }

    public static char scanChar(String s) {
        return IntStream.rangeClosed('A', 'Z')
            .mapToObj(i -> (char) i)
            .filter(c -> s.equals(AsciiArt.printChar(c)))
            .findFirst()
            .orElse('?');
    }

    public static char scanChar2(String s) {
        for (char c = 'A'; c <= 'Z'; c++) {
            if (s.equals(printChar(c))) {
                return c;
            }
        }
        return '?';
    }

    public static String printChar(char c) {
        StringBuilder result = new StringBuilder();

        switch (c) {
            case 'A':
                result.append(" # \n");
                result.append("# #\n");
                result.append("###\n");
                result.append("# #\n");
                break;
            case 'B':
                result.append("## \n");
                result.append("# #\n");
                result.append("## \n");
                result.append("###\n");
                break;
            case 'C':
                result.append("###\n");
                result.append("#  \n");
                result.append("#  \n");
                result.append("###\n");
                break;
            case 'D':
                result.append("## \n");
                result.append("# #\n");
                result.append("# #\n");
                result.append("## \n");
                break;
            case 'E':
                result.append("###\n");
                result.append("#  \n");
                result.append("## \n");
                result.append("###\n");
                break;
            case 'F':
                result.append("###\n");
                result.append("#  \n");
                result.append("## \n");
                result.append("#  \n");
                break;
            case 'G':
                result.append("###\n");
                result.append("#  \n");
                result.append("# #\n");
                result.append("###\n");
                break;
            case 'H':
                result.append("# #\n");
                result.append("###\n");
                result.append("# #\n");
                result.append("# #\n");
                break;
            case 'I':
                result.append("###\n");
                result.append(" # \n");
                result.append(" # \n");
                result.append("###\n");
                break;
            case 'J':
                result.append("###\n");
                result.append(" # \n");
                result.append(" # \n");
                result.append("## \n");
                break;
            case 'K':
                result.append("# #\n");
                result.append("## \n");
                result.append("# #\n");
                result.append("# #\n");
                break;
            case 'L':
                result.append("#  \n");
                result.append("#  \n");
                result.append("#  \n");
                result.append("###\n");
                break;
            case 'M':
                result.append("# #\n");
                result.append("###\n");
                result.append("###\n");
                result.append("# #\n");
                break;
            case 'N':
                result.append("###\n");
                result.append("# #\n");
                result.append("# #\n");
                result.append("# #\n");
                break;
            case 'O':
                result.append("###\n");
                result.append("# #\n");
                result.append("# #\n");
                result.append("###\n");
                break;
            case 'P':
                result.append("###\n");
                result.append("# #\n");
                result.append("###\n");
                result.append("#  \n");
                break;
            case 'Q':
                result.append("###\n");
                result.append("# #\n");
                result.append("###\n");
                result.append("  #\n");
                break;
            case 'R':
                result.append("###\n");
                result.append("# #\n");
                result.append("## \n");
                result.append("# #\n");
                break;
            case 'S':
                result.append("###\n");
                result.append("#  \n");
                result.append(" # \n");
                result.append("###\n");
                break;
            case 'T':
                result.append("###\n");
                result.append(" # \n");
                result.append(" # \n");
                result.append(" # \n");
                break;
            case 'U':
                result.append("# #\n");
                result.append("# #\n");
                result.append("# #\n");
                result.append("###\n");
                break;
            case 'V':
                result.append("# #\n");
                result.append("# #\n");
                result.append("# #\n");
                result.append(" # \n");
                break;
            case 'W':
                result.append("# #\n");
                result.append("# #\n");
                result.append("###\n");
                result.append("# #\n");
                break;
            case 'X':
                result.append("# #\n");
                result.append(" # \n");
                result.append(" # \n");
                result.append("# #\n");
                break;
            case 'Y':
                result.append("# #\n");
                result.append("# #\n");
                result.append(" # \n");
                result.append(" # \n");
                break;
            case 'Z':
                result.append("###\n");
                result.append("  #\n");
                result.append(" # \n");
                result.append("###\n");
                break;
            default:
                return "";
        }
        return result.toString();
    }
}
