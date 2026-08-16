abstract class Animal {
  constructor(public name: string) {}

  getName(): string {
    return this.name;
  }
}

class Dog extends Animal {}

class Cat extends Animal {}

// retourne le nom de l'animal donne
function getAnimalName(animal: Animal): string {
  return animal.getName();
}

export { Animal, Dog, Cat, getAnimalName };
