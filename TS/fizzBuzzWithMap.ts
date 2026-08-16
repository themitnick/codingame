function fizzBuzz(n: number, map: Map<number, string>): string {
  const sortedKeys = [...map.keys()].sort((a, b) => a - b);

  let result = "";
  for (const divisor of sortedKeys) {
    if (divisor !== 0 && n % divisor === 0) {
      result += map.get(divisor);
    }
  }

  return result.length === 0 ? String(n) : result;
}

export { fizzBuzz };
