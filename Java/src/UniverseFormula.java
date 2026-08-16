import java.io.File;

public class UniverseFormula {

    static String locateUniverseFormula() {
        return getFile("/tmp/documents", "universe-formula");
    }

    private static String getFile(String path, String name) {
        File[] files = new File(path).listFiles();
        if (files == null) {
            return null;
        }
        for (File f : files) {
            if (f.isFile()) {
                if (f.getName().equals(name)) {
                    return f.getAbsolutePath();
                }
            } else if (f.isDirectory()) {
                String found = getFile(f.getAbsolutePath(), name);
                if (found != null) {
                    return found;
                }
            }
        }
        return null;
    }
}
