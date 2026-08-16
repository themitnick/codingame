// Nombre maximum de dons "chanceux" (4 ou 8) possibles avec le budget donne
function luckyMoney(money: number, giftees: number): number {
  if (money <= 0 || giftees <= 0) {
    return 0;
  }

  let maxLuckyGifts = 0;

  if (money >= 8) {
    maxLuckyGifts = Math.max(maxLuckyGifts, 1 + luckyMoney(money - 8, giftees - 1));
  }

  if (money >= 4) {
    maxLuckyGifts = Math.max(maxLuckyGifts, 1 + luckyMoney(money - 4, giftees - 1));
  }

  maxLuckyGifts = Math.max(maxLuckyGifts, luckyMoney(money, giftees - 1));

  return maxLuckyGifts;
}

export { luckyMoney };
