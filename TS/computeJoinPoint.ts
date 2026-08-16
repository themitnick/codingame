function sumDigits(n: number): number {
  let sum = 0;
  while (n > 0) {
    sum += n % 10;
    n = Math.floor(n / 10);
  }
  return sum;
}

function computeJoinPoint(seq1: number, seq2: number): number {
  let a = seq1;
  let b = seq2;
  while (a !== b) {
    if (a < b) {
      a += sumDigits(a);
    } else {
      b += sumDigits(b);
    }
  }
  return a;
}

export { computeJoinPoint };
