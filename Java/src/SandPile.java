public class SandPile {

    /**
     * Simule l'algorithme du tas de sable (Sandpile model)
     * @param pile la grille initiale du tas de sable
     * @param n le nombre d'itérations à effectuer
     * @return la grille après n itérations
     */
    public static int[][] sandPile(int[][] pile, int n) {
        if (pile == null || pile.length == 0) {
            return pile;
        }
        
        int rows = pile.length;
        int cols = pile[0].length;
        
        // Effectuer n itérations
        for (int iteration = 0; iteration < n; iteration++) {
            boolean hasToppled = false;
            int[][] newPile = copyGrid(pile);
            
            // Trouver et traiter toutes les cellules instables (>= 4)
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    if (pile[i][j] >= 4) {
                        hasToppled = true;
                        toppleCell(pile, newPile, i, j, rows, cols);
                    }
                }
            }
            
            // Mettre à jour la pile
            pile = newPile;
            
            // Si aucun éboulement n'a eu lieu, on peut arrêter
            if (!hasToppled) {
                break;
            }
        }
        
        return pile;
    }
    
    /**
     * Copie une grille 2D
     */
    private static int[][] copyGrid(int[][] source) {
        int rows = source.length;
        int cols = source[0].length;
        int[][] copy = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            System.arraycopy(source[i], 0, copy[i], 0, cols);
        }
        return copy;
    }
    
    /**
     * Effectue l'éboulement d'une cellule
     */
    private static void toppleCell(int[][] pile, int[][] newPile, int i, int j, int rows, int cols) {
        int grains = pile[i][j];
        int distributed = grains / 4;
        
        // Réduire la cellule actuelle
        newPile[i][j] -= distributed * 4;
        
        // Distribuer aux voisins
        if (i > 0) {
            newPile[i - 1][j] += distributed;
        }
        if (i < rows - 1) {
            newPile[i + 1][j] += distributed;
        }
        if (j > 0) {
            newPile[i][j - 1] += distributed;
        }
        if (j < cols - 1) {
            newPile[i][j + 1] += distributed;
        }
    }
}
