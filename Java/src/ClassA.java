import java.math.BigInteger;

public class ClassA {

    /**
     * Retourne la valeur de la cellule (l, c) du triangle de Pascal, c'est-à-dire
     * le coefficient binomial C(l, c) ("l parmi c") :
     *
     *        c: 0  1  2  3  4  5
     *   l=0 :   1
     *   l=1 :   1  1
     *   l=2 :   1  2  1
     *   l=3 :   1  3  3  1
     *   l=4 :   1  4  6  4  1
     *   l=5 :   1  5 10 10  5  1
     *
     * Chaque valeur est la somme des deux valeurs du dessus : C(l, c) = C(l-1, c-1) + C(l-1, c).
     *
     * Contraintes : 0 <= c <= l <= 10000. Les résultats peuvent dépasser 64 bits,
     * on utilise donc BigInteger et on renvoie le nombre sous forme de chaîne.
     *
     * Le calcul utilise la formule multiplicative avec k = min(c, l - c) afin de
     * limiter le nombre d'itérations et la taille des nombres manipulés :
     *   C(l, c) = produit_{i=1..k} (l - k + i) / i
     * La division est toujours exacte à chaque étape (produit de i entiers consécutifs
     * divisible par i!), ce qui garde des entiers exacts sans arrondi.
     *
     * Exemple : get(67, 34) retourne "14226520737620288370".
     *
     * @param l le numéro de ligne (0 <= l <= 10000)
     * @param c le numéro de colonne (0 <= c <= l)
     * @return la valeur C(l, c) de la cellule, sous forme de chaîne
     */
    public String get(int l, int c) {
        if (l < 0 || c < 0 || c > l) {
            throw new IllegalArgumentException("On attend 0 <= c <= l");
        }
        int k = Math.min(c, l - c);
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= k; i++) {
            result = result
                    .multiply(BigInteger.valueOf(l - k + i))
                    .divide(BigInteger.valueOf(i));
        }
        return result.toString();
    }
}
