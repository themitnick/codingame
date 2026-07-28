import { Injectable } from '@angular/core';

interface Account {
  name: string;
  balance: number;
}

@Injectable({
  providedIn: 'root'
})
export class AccountingService {
  private readonly accounts: Map<string, Account> = new Map();

  createAccount(accountName: string, initialBalance: number = 0): boolean {
    if (this.accounts.has(accountName)) {
      return false;
    }
    this.accounts.set(accountName, {
      name: accountName,
      balance: initialBalance
    });
    return true;
  }

  topupAccount(accountName: string, amount: number): number | null {
    const account = this.accounts.get(accountName);
    if (!account) {
      return null;
    }
    account.balance += amount;
    return account.balance;
  }

  getAccountBalance(accountName: string): number | null {
    const account = this.accounts.get(accountName);
    return account ? account.balance : null;
  }
}
