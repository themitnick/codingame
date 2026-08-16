public class Foo {

    static void main() {
        System.out.println(isFood("fo0"));
    }

    static boolean isFood(String param) {
        return "foo".equals(param);
    }
}
