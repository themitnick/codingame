public class EstimationPI {
    
    /**
     * Estime la valeur de π en utilisant la méthode de Monte Carlo
     * @param pts tableau de points où chaque point est un tableau de 2 doubles [x,y]
     * @return une estimation de π basée sur les points fournis
     */
    public double approx(double[][] pts) {
        int pointsInside = 0;
        
        // Pour chaque point, vérifie s'il est à l'intérieur du quart de cercle
        for (double[] point : pts) {
            double x = point[0];
            double y = point[1];
            
            // Vérifie si le point est à l'intérieur du quart de cercle de rayon 1
            // en utilisant l'équation x² + y² ≤ 1
            if (x * x + y * y <= 1) {
                pointsInside++;
            }
        }
        
        // La probabilité qu'un point soit dans le quart de cercle est π/4
        // Donc π = 4 * (nombre de points dans le cercle / nombre total de points)
        return 4.0 * pointsInside / pts.length;
    }
}
