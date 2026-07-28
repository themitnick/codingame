export function functionSimple(params: { stocks: string[], prices: number[][] }): string[] {
  // Calculer la moyenne pour chaque action
  const stockAverages: { stock: string; average: number }[] = params.stocks.map((stock, index) => {
    const prices = params.prices[index];
    const sum = prices.reduce((acc, price) => acc + price, 0);
    const average = sum / prices.length;
    return { stock, average };
  });

  // Trier par moyenne décroissante
  stockAverages.sort((a, b) => b.average - a.average);

  // Retourner les 3 premières actions
  return stockAverages.slice(0, 3).map(item => item.stock);
}
