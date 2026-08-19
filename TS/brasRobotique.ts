// Seuils definis par le sujet
const VOLUME_MAX = 1_000_000; // cm3
const DIMENSION_MAX = 150; // cm
const MASSE_MAX = 20; // kg

/**
 * Determine le tas ou placer le colis.
 *
 * @param width  largeur en cm
 * @param height hauteur en cm
 * @param length profondeur en cm
 * @param mass   masse en kg
 * @returns le nom du tas : STANDARD, SPECIAL ou REJECTED
 */
function sort(
  width: number,
  height: number,
  length: number,
  mass: number
): string {
  // Un colis est encombrant si son volume est >= 1 000 000 cm3
  // ou si l'une de ses dimensions est >= 150 cm.
  const volume = width * height * length;
  const bulky =
    volume >= VOLUME_MAX ||
    width >= DIMENSION_MAX ||
    height >= DIMENSION_MAX ||
    length >= DIMENSION_MAX;

  // Un colis est lourd si sa masse est >= 20 kg.
  const heavy = mass >= MASSE_MAX;

  if (bulky && heavy) {
    return "REJECTED";
  }
  if (bulky || heavy) {
    return "SPECIAL";
  }
  return "STANDARD";
}

export { sort };
