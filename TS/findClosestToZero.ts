function closestToZero(temps: number[]): number {
  if (temps == null || temps.length === 0 || temps.length > 10000) {
    return 0;
  }

  return temps.reduce((best, current) => {
    const compareAbs = Math.abs(current) - Math.abs(best);
    if (compareAbs < 0) {
      return current;
    }
    if (compareAbs === 0) {
      return Math.max(current, best);
    }
    return best;
  });
}

export { closestToZero };
