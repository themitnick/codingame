import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-fruit',
  standalone: true,
  template: `<p>You have selected the {{ fruitName }}</p>`,
})
export class FruitComponent implements OnInit {
  fruitName: string = '';

  constructor(private route: ActivatedRoute) {}

  ngOnInit() {
    this.route.paramMap.subscribe((params) => {
      this.fruitName = params.get('name') || '';
    });
  }
}
