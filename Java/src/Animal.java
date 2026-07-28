abstract class Animal {
    String name;
    Animal(String name) {
        this.name = name;
    }
    String getName() {
        return this.name;
    }
}

class Dog extends Animal {
    Dog(String name) {
        super(name);
    }
}

class Cat extends Animal {
    Cat(String name) {
        super(name);
    }
}

class Application {
    // return the name of the given animal
    public static String getAnimalName(Animal animal) {
        return animal.getName();
    }
}
