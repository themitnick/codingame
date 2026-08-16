function findWord(combinations: string[]): string {
  const edgeMap = new Map<string, string>();
  const destinations = new Set<string>();

  for (const combo of combinations) {
    const from = combo.charAt(0);
    const to = combo.charAt(2);
    edgeMap.set(from, to);
    destinations.add(to);
  }

  let start = "";
  for (const combo of combinations) {
    const candidate = combo.charAt(0);
    if (!destinations.has(candidate)) {
      start = candidate;
      break;
    }
  }

  let word = "";
  let current: string | undefined = start;
  while (current) {
    word += current;
    current = edgeMap.get(current);
  }

  return word;
}

export { findWord };
