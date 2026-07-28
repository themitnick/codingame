import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'pi-estimation-component',
  standalone: true,
  imports: [CommonModule, FormsModule],
  templateUrl: './pi-estimation.component.html',
  styleUrl: './pi-estimation.component.scss',
})
export class PiEstimationComponent {
  numberOfPoints: number = 1000;
  estimatedPi: number = 0;
  points: { x: number; y: number; inside: boolean }[] = [];

  calculatePi(): void {
    const pts: number[][] = [];
    
    // Générer des points aléatoires
    for (let i = 0; i < this.numberOfPoints; i++) {
      const x = Math.random();
      const y = Math.random();
      pts.push([x, y]);
    }

    this.estimatedPi = this.approx(pts);
    
    // Stocker quelques points pour la visualisation (max 100)
    this.points = pts.slice(0, 100).map(pt => ({
      x: pt[0],
      y: pt[1],
      inside: (pt[0] * pt[0] + pt[1] * pt[1]) <= 1
    }));
  }

  approx(pts: number[][]): number {
    let insideCount = 0;
    
    for (const pt of pts) {
      const x = pt[0];
      const y = pt[1];
      
      // Vérifier si le point est à l'intérieur du quart de disque
      if (x * x + y * y <= 1) {
        insideCount++;
      }
    }
    
    // La probabilité qu'un point soit dans le quart de disque est π/4
    // Donc π ≈ 4 * (points à l'intérieur / total des points)
    return 4 * (insideCount / pts.length);
  }

  reset(): void {
    this.estimatedPi = 0;
    this.points = [];
  }
}
