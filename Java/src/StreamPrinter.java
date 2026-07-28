import java.io.IOException;
import java.io.Reader;

public class StreamPrinter {

    void print(Reader reader) throws IOException {
        if (reader == null) {
            throw new IllegalArgumentException("Reader cannot be null");
        }
        try (Reader r = reader) {
            int code;
            while ((code = r.read()) != -1) {
                System.out.println((char) code);
            }
        }
    }
}
