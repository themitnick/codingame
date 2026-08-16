function maxMin(ints: number[]): Record<string, number> {
  return {
    Min: Math.min(...ints),
    Max: Math.max(...ints),
  };
}

export { maxMin };
