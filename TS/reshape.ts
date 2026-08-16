// Retourne la chaine formatee en lignes de n caracteres maximum (mots non coupes)
function reshape(n: number, str: string): string {
  if (n <= 0) {
    throw new Error("n must be greater than 0");
  }

  const words = str.split(" ");
  const lines: string[] = [];
  let line = "";

  for (const word of words) {
    if (line.length + word.length + 1 > n) {
      lines.push(line.trim());
      line = "";
    }
    line += word + " ";
  }
  if (line.length > 0) {
    lines.push(line.trim());
  }

  return lines.join("\n");
}

export { reshape };
