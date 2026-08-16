const GLYPHS: Record<string, string[]> = {
  A: [" # ", "# #", "###", "# #"],
  B: ["## ", "# #", "## ", "###"],
  C: ["###", "#  ", "#  ", "###"],
  D: ["## ", "# #", "# #", "## "],
  E: ["###", "#  ", "## ", "###"],
  F: ["###", "#  ", "## ", "#  "],
  G: ["###", "#  ", "# #", "###"],
  H: ["# #", "###", "# #", "# #"],
  I: ["###", " # ", " # ", "###"],
  J: ["###", " # ", " # ", "## "],
  K: ["# #", "## ", "# #", "# #"],
  L: ["#  ", "#  ", "#  ", "###"],
  M: ["# #", "###", "###", "# #"],
  N: ["###", "# #", "# #", "# #"],
  O: ["###", "# #", "# #", "###"],
  P: ["###", "# #", "###", "#  "],
  Q: ["###", "# #", "###", "  #"],
  R: ["###", "# #", "## ", "# #"],
  S: ["###", "#  ", " # ", "###"],
  T: ["###", " # ", " # ", " # "],
  U: ["# #", "# #", "# #", "###"],
  V: ["# #", "# #", "# #", " # "],
  W: ["# #", "# #", "###", "# #"],
  X: ["# #", " # ", " # ", "# #"],
  Y: ["# #", "# #", " # ", " # "],
  Z: ["###", "  #", " # ", "###"],
};

function printChar(c: string): string {
  const lines = GLYPHS[c];
  if (!lines) {
    return "";
  }
  return lines.map(line => line + "\n").join("");
}

function scanChar(s: string): string {
  for (const c of Object.keys(GLYPHS)) {
    if (s === printChar(c)) {
      return c;
    }
  }
  return "?";
}

// Variante iterative equivalente
function scanChar2(s: string): string {
  return scanChar(s);
}

export { printChar, scanChar, scanChar2 };
