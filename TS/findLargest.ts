function findLargest(numbers: number[]): number {
  if (numbers == null || numbers.length === 0) {
    return 0;
  }

  return Math.max(...numbers);
}

export { findLargest };
