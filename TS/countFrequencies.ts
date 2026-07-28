function countFrequencies(arr: string[]): number[] {
  const frequencyMap: Record<string, number> = {};

  for (const str of arr) {
    frequencyMap[str] = (frequencyMap[str] || 0) + 1;
  }

  return Object.values(frequencyMap);
}

var inputArray: string[] = [
  "apple",
  "banana",
  "apple",
  "orange",
  "banana",
  "apple",
];
var frequencies: number[] = countFrequencies(inputArray);
console.log(frequencies); // Output: [3, 2, 1] for "
