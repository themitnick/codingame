function sumRange(start: number, end: number): number {
  let sum = 0;
  for (let i = start; i <= end; i++) {
    sum += i;
  }
  return sum;
}

export { sumRange };