interface Reader {
  read(): number; // code du caractere, ou -1 en fin de flux
  close(): void;
}

// Version robuste : le flux est ferme dans tous les cas, l'exception est propagee a l'appelant
function print(reader: Reader | null): void {
  if (reader == null) {
    throw new Error("Reader cannot be null");
  }
  try {
    let code: number;
    while ((code = reader.read()) !== -1) {
      console.log(String.fromCharCode(code));
    }
  } finally {
    reader.close();
  }
}

export { Reader, print };
