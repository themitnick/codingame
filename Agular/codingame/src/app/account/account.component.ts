import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { AccountingService } from './accounting.service';

@Component({
  selector: 'account-component',
  standalone: true,
  imports: [CommonModule, FormsModule],
  templateUrl: './account.component.html',
  styleUrl: './account.component.scss',
})
export class AccountComponent {
  createAccountName: string = '';
  topupAccountName: string = '';
  topupAmount: number = 0;
  message: string = '';

  constructor(private readonly accountingService: AccountingService) {}

  createAccount(): void {
    const success = this.accountingService.createAccount(this.createAccountName, 0);
    if (success) {
      this.message = 'Successfully added account';
      this.createAccountName = '';
    }
  }

  topupAccount(): void {
    if (this.topupAmount <= 0) {
      this.message = 'INVALID_INPUT';
      return;
    }

    const newBalance = this.accountingService.topupAccount(
      this.topupAccountName,
      this.topupAmount
    );

    if (newBalance !== null) {
      this.message = `Current balance: ${newBalance}`;
      this.topupAccountName = '';
      this.topupAmount = 0;
    }
  }
}
