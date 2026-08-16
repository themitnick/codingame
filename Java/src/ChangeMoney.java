import java.util.logging.Logger;

public class ChangeMoney {
    private static final Logger logger = Logger.getLogger(ChangeMoney.class.getName());

    static void main() {
        long[] tests = {
                -5,   // negatif -> null
                0,    // aucune piece
                1,    // impossible
                2,    // 1 x 2
                3,    // impossible
                5,    // 1 x 5
                6,    // 3 x 2
                10,   // 1 x 10
                12,   // 1 x 10 + 1 x 2
                14,   // 1 x 10 + 2 x 2
                15,   // 1 x 10 + 1 x 5
                16,   // 1 x 10 + 3 x 2
                25,   // 2 x 10 + 1 x 5
                Long.MAX_VALUE
        };

        ChangeMoney app = new ChangeMoney();
        for (long s : tests) {
            Change c = app.optimalChange(s);
            if (c == null) {
                logger.info("s=" + s + " -> impossible (null)");
                continue;
            }
            long sum = c.coin2 * 2 + c.bill5 * 5 + c.bill10 * 10;
            boolean valid = sum == s;
            logger.info("s=" + s + " -> " + c
                    + " | somme=" + sum
                    + " | pieces=" + (c.coin2 + c.bill5 + c.bill10)
                    + " | " + (valid ? "OK" : "ERREUR"));
        }
    }

    public Change optimalChange(long s) {
        if (s < 0) {
            return null;
        }

        long bill5 = 0;
        long remaining = s;

        if (s % 2 != 0) {
            if (s < 5) {
                return null;
            }
            bill5 = 1;
            remaining = s - 5;
        }

        long bill10 = remaining / 10;
        long coin2 = (remaining % 10) / 2;

        return new Change(coin2, bill5, bill10);
    }

    public static class Change {

        public final long coin2;
        public final long bill5;
        public final long bill10;

        public Change(long coin2, long bill5, long bill10) {
            this.coin2 = coin2;
            this.bill5 = bill5;
            this.bill10 = bill10;
        }

        @Override
        public String toString() {
            return "coin2=" + coin2 + ", bill5=" + bill5 + ", bill10=" + bill10;
        }
    }
}
