public final class Person {

    private final String name;
    private final String birth_day;

    public Person(String name, String birth_day) {
        this.name = name;
        this.birth_day = birth_day;
    }

    public String getName() {
        return name;
    }

    public String getBirth_day() {
        return birth_day;
    }
}
