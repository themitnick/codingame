function calc(array: number[], n1: number, n2: number): number {
  // Validation des paramètres
  if (n1 < 0 || n2 >= array.length || n1 > n2) {
    throw new Error("Invalid interval parameters");
  }

  // Calcul de la somme des éléments dans l'intervalle [n1, n2]
  let sum = 0;
  for (let i = n1; i <= n2; i++) {
    sum += array[i];
  }
  return sum;
}





