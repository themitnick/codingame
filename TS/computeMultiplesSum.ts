/**
 * Calcule la somme de tous les multiples de 3, 5 ou 7 inférieurs à n
 * @param n Le nombre limite supérieur (exclusif), doit être entre 0 et 1000
 * @returns La somme des multiples
 * @throws Error si n n'est pas un nombre positif ou si n >= 1000
 */
function computeMultiplesSum(n: number): number {
  // Validation du paramètre
  if (!Number.isInteger(n) || n <= 0 || n >= 1000) {
    throw new Error(
      "Le paramètre n doit être un entier positif inférieur à 1000"
    );
  }

  // Utilisation d'un Set pour éviter les doublons
  const multiples = new Set<number>();

  // Optimisation : on peut calculer directement les multiples
  for (const divisor of [3, 5, 7]) {
    for (let multiple = divisor; multiple < n; multiple += divisor) {
      multiples.add(multiple);
    }
  }

  // Calculer la somme des multiples uniques
  return Array.from(multiples).reduce((sum, num) => sum + num, 0);
}

// Tests avec différentes valeurs
function runTests() {
  const testCases = [
    { input: 10, expected: 23 },
    { input: 20, expected: 63 },
    { input: 30, expected: 195 },
  ];

  for (const test of testCases) {
    const result = computeMultiplesSum(test.input);
    console.log(`Test avec n = ${test.input}:`);
    console.log(`Résultat: ${result}`);
    console.log(`Test ${result === test.expected ? "réussi ✓" : "échoué ✗"}\n`);
  }
}

runTests();
