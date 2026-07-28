import { Component, Input, Output, EventEmitter, OnDestroy } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'counter-component',
  standalone: true,
  imports: [CommonModule, FormsModule],
  templateUrl: './counter.component.html',
  styleUrl: './counter.component.scss',
})
export class CounterComponent implements OnDestroy {
  @Input() message: string = '';
  @Output() tick = new EventEmitter<string>();

  intervalValue: number = 1000;
  private intervalId: any = null;

  setInterval(): void {
    // Clear any existing interval
    if (this.intervalId) {
      clearInterval(this.intervalId);
    }

    // Set up new interval
    this.intervalId = setInterval(() => {
      this.tick.emit(this.message);
    }, this.intervalValue);
  }

  ngOnDestroy(): void {
    // Clean up interval when component is destroyed
    if (this.intervalId) {
      clearInterval(this.intervalId);
    }
  }
}
