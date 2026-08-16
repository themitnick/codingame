// Retourne les 3 actions ayant la moyenne de prix la plus elevee (ordre decroissant)
function findHighestAverageStocks(stocks: string[], prices: number[][]): string[] {
  const averages: { stock: string; average: number }[] = [];

  for (let i = 0; i < stocks.length; i++) {
    const sum = prices[i].reduce((acc, price) => acc + price, 0);
    averages.push({ stock: stocks[i], average: sum / prices[i].length });
  }

  return averages
    .sort((a, b) => b.average - a.average)
    .slice(0, 3)
    .map(entry => entry.stock);
}

export { findHighestAverageStocks };
