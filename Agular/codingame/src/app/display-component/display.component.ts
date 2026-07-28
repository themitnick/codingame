import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { VoterComponent } from './voter.component';

@Component({
  selector: 'display-component',
  standalone: true,
  imports: [CommonModule, VoterComponent],
  templateUrl: './display.component.html',
  styleUrl: './display.component.scss',
})
export class DisplayComponent {
  public question: string = 'Do you like Angular?';
  public yesAnswer: string = 'Yes, I love it!';
  public noAnswer: string = 'No, I prefer other frameworks';
  public lastVote: string = '';

  onVote(result: boolean): void {
    this.lastVote = result ? this.yesAnswer : this.noAnswer;
  }
}
