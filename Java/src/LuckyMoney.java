public class LuckyMoney {

    /**
     * Calcule le nombre maximum de dons "chanceux" (4 ou 8) possibles
     * 
     * @param money   le budget total disponible
     * @param giftees le nombre de petits-enfants restants
     * @return le nombre maximum de dons égaux à 4 ou 8 possible
     */
    public static int luckyMoney(int money, int giftees) {
        // Cas de base : si plus d'argent ou plus de destinataires
        if (money <= 0 || giftees <= 0) {
            return 0;
        }

        int maxLuckyGifts = 0;

        // Essayer de donner 8
        if (money >= 8) {
            maxLuckyGifts = Math.max(maxLuckyGifts,
                    1 + luckyMoney(money - 8, giftees - 1));
        }

        // Essayer de donner 4
        if (money >= 4) {
            maxLuckyGifts = Math.max(maxLuckyGifts,
                    1 + luckyMoney(money - 4, giftees - 1));
        }

        // Essayer de ne rien donner à ce destinataire
        maxLuckyGifts = Math.max(maxLuckyGifts,
                luckyMoney(money, giftees - 1));

        return maxLuckyGifts;
    }
}
