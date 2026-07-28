import { Component, Input, Output, EventEmitter } from '@angular/core';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'voter-component',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './voter.component.html',
  styleUrl: './voter.component.scss',
})
export class VoterComponent {
  @Input() question: string = '';
  @Input() yesAnswer: string = '';
  @Input() noAnswer: string = '';
  @Output() output = new EventEmitter<boolean>();

  vote(choice: boolean): void {
    this.output.emit(choice);
  }
}
