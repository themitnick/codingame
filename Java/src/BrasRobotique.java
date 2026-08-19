public class BrasRobotique {

    // Seuils definis par le sujet
    private static final int VOLUME_MAX = 1_000_000; // cm3
    private static final int DIMENSION_MAX = 150;     // cm
    private static final int MASSE_MAX = 20;          // kg

    public static void main(String[] args) {
        // width, height, length en cm ; mass en kg
        System.out.println(sort(20, 20, 20, 10));    // STANDARD
        System.out.println(sort(200, 20, 20, 10));   // SPECIAL (dimension >= 150)
        System.out.println(sort(20, 20, 20, 25));    // SPECIAL (masse >= 20)
        System.out.println(sort(100, 100, 100, 30)); // REJECTED (encombrant + lourd)
    }

    /**
     * Determine le tas ou placer le colis.
     *
     * @param width  largeur en cm
     * @param height hauteur en cm
     * @param length profondeur en cm
     * @param mass   masse en kg
     * @return le nom du tas : STANDARD, SPECIAL ou REJECTED
     */
    public static String sort(int width, int height, int length, int mass) {
        // Un colis est encombrant si son volume est >= 1 000 000 cm3
        // ou si l'une de ses dimensions est >= 150 cm.
        long volume = (long) width * height * length;
        boolean bulky = volume >= VOLUME_MAX
                || width >= DIMENSION_MAX
                || height >= DIMENSION_MAX
                || length >= DIMENSION_MAX;

        // Un colis est lourd si sa masse est >= 20 kg.
        boolean heavy = mass >= MASSE_MAX;

        if (bulky && heavy) {
            return "REJECTED";
        }
        if (bulky || heavy) {
            return "SPECIAL";
        }
        return "STANDARD";
    }
}
