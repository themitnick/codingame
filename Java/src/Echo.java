import java.util.Arrays;

public class Echo {
    static void main(String[] args) {
        Arrays.stream(args).forEach(System.out::println);

    }
}
