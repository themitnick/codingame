function filterWords(words: string[], letter: string): string[] {
  return words.filter(word => word.includes(letter));
}