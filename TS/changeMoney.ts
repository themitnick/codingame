class Change {
  constructor(
    public readonly coin2: number,
    public readonly bill5: number,
    public readonly bill10: number
  ) {}

  toString(): string {
    return `coin2=${this.coin2}, bill5=${this.bill5}, bill10=${this.bill10}`;
  }
}

function optimalChange(s: number): Change | null {
  if (s < 0) {
    return null;
  }

  let bill5 = 0;
  let remaining = s;

  if (s % 2 !== 0) {
    if (s < 5) {
      return null;
    }
    bill5 = 1;
    remaining = s - 5;
  }

  const bill10 = Math.floor(remaining / 10);
  const coin2 = Math.floor((remaining % 10) / 2);

  return new Change(coin2, bill5, bill10);
}

export { Change, optimalChange };
