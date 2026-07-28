import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'stock-component',
  standalone: true,
  imports: [CommonModule, FormsModule],
  templateUrl: './stock.component.html',
  styleUrl: './stock.component.scss',
})
export class StockComponent {
  stocks: string[] = [];
  prices: number[][] = [];
  result: string[] = [];
  
  stockInput: string = '';
  priceInput: string = '';

  addStock(): void {
    if (this.stockInput && this.priceInput) {
      this.stocks.push(this.stockInput);
      const pricesArray = this.priceInput.split(',').map(p => Number.parseFloat(p.trim()));
      this.prices.push(pricesArray);
      this.stockInput = '';
      this.priceInput = '';
    }
  }

  calculateTopStocks(): void {
    this.result = this.functionSimple({ stocks: this.stocks, prices: this.prices });
  }

  reset(): void {
    this.stocks = [];
    this.prices = [];
    this.result = [];
  }

  functionSimple(params: { stocks: string[], prices: number[][] }): string[] {
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
}
