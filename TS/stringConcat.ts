function concat(strings: string[]): string {
  let result = "";
  for (const str of strings) {
    if (str != null && str.length > 0) {
      result += str;
    }
  }
  return result;
}

export { concat };
