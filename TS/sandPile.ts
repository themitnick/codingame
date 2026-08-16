// Simule l'algorithme du tas de sable (Sandpile model)
function sandPile(pile: number[][], n: number): number[][] {
  if (pile == null || pile.length === 0) {
    return pile;
  }

  const rows = pile.length;
  const cols = pile[0].length;
  let current = pile;

  for (let iteration = 0; iteration < n; iteration++) {
    let hasToppled = false;
    const newPile = current.map(row => [...row]);

    for (let i = 0; i < rows; i++) {
      for (let j = 0; j < cols; j++) {
        if (current[i][j] >= 4) {
          hasToppled = true;
          const distributed = Math.floor(current[i][j] / 4);
          newPile[i][j] -= distributed * 4;
          if (i > 0) newPile[i - 1][j] += distributed;
          if (i < rows - 1) newPile[i + 1][j] += distributed;
          if (j > 0) newPile[i][j - 1] += distributed;
          if (j < cols - 1) newPile[i][j + 1] += distributed;
        }
      }
    }

    current = newPile;

    if (!hasToppled) {
      break;
    }
  }

  return current;
}

export { sandPile };
