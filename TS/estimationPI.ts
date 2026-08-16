// Estime la valeur de PI par la methode de Monte Carlo
function approx(pts: number[][]): number {
  let pointsInside = 0;

  for (const [x, y] of pts) {
    if (x * x + y * y <= 1) {
      pointsInside += 1;
    }
  }

  return (4.0 * pointsInside) / pts.length;
}

export { approx };
