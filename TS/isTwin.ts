function isTwin(a1: string, a2: string): boolean {
  if (a1.length !== a2.length) {
    return false;
  }

  const sortedA = a1.split("").sort().join("");

  const sortedB = a2.split("").sort().join("");

  return sortedA === sortedB;
}
