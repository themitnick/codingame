package kotlin

abstract class Animal(val name: String) {
    fun getName(): String = name
}

class Dog(name: String) : Animal(name)

class Cat(name: String) : Animal(name)

object Application {
    // return the name of the given animal
    fun getAnimalName(animal: Animal): String {
        return animal.getName()
    }
}

