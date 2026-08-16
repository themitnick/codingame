function findSmallestInterval(numbers: number[]): number {
  const NO_RANGE_FOUND = -1;
  if (numbers == null || numbers.length < 2 || numbers.length > 100000) {
    return NO_RANGE_FOUND;
  }

  const sorted = [...numbers].sort((x, y) => x - y);
  let min = Number.POSITIVE_INFINITY;
  for (let i = 0; i < sorted.length - 1; i++) {
    min = Math.min(min, sorted[i + 1] - sorted[i]);
  }
  return min;
}

export { findSmallestInterval };
