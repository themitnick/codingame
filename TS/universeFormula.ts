// Declarations minimales pour utiliser les modules Node sans dependance @types/node
declare function require(module: string): any;
const fs: {
  readdirSync(path: string): string[];
  statSync(path: string): { isFile(): boolean; isDirectory(): boolean };
} = require("fs");
const path: { join(...parts: string[]): string } = require("path");

function locateUniverseFormula(): string | null {
  return getFile("/tmp/documents", "universe-formula");
}

// Recherche recursive du fichier dans toute l'arborescence
function getFile(dir: string, name: string): string | null {
  let entries: string[];
  try {
    entries = fs.readdirSync(dir);
  } catch {
    return null;
  }

  for (const entry of entries) {
    const full = path.join(dir, entry);
    const stat = fs.statSync(full);
    if (stat.isFile()) {
      if (entry === name) {
        return full;
      }
    } else if (stat.isDirectory()) {
      const found = getFile(full, name);
      if (found != null) {
        return found;
      }
    }
  }
  return null;
}

export { locateUniverseFormula };
