function exists(ints: number[], k: number): boolean {
  // ints est trié par ordre croissant -> recherche binaire en O(log n)
  let low = 0;
  let high = ints.length - 1;

  while (low <= high) {
    const mid = (low + high) >>> 1;
    if (ints[mid] === k) {
      return true;
    }
    if (ints[mid] < k) {
      low = mid + 1;
    } else {
      high = mid - 1;
    }
  }

  return false;
}

export { exists };
