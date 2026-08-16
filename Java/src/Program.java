import java.util.HashMap;
import java.util.Map;

interface Command {
    String name();

    String execute(String text);
}

class CountWords implements Command {
    @Override
    public String name() {
        return "CountWords";
    }

    @Override
    public String execute(String text) {
        return WordCounter.count(text);
    }
}

class Program {

    private final Map<String, Command> commands = new HashMap<>();

    void register(Command command) {
        commands.put(command.name(), command);
    }

    String exec(String command, String text) { // keep this method
        Command handler = commands.get(command);
        if (handler == null) {
            throw new IllegalArgumentException(command);
        }
        return handler.execute(text);
    }
}

class WordCounter {
    static String count(String text) {
        if (text == null || text.isBlank()) {
            return "0";
        }
        return String.valueOf(text.trim().split("\\s+").length);
    }
}

class ProgramTester {

    Program p;

    void init() {
        p = new Program();
        p.register(new CountWords());
    }

    void testCountWords() {
        String r = p.exec("CountWords", "Yes we code");
        assert r.equals("3");
    }
}
