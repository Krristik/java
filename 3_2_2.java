// Родительский класс
class Animal {
    // Метод, который будет переопределен в подклассе
    public void sound() {
        System.out.println("Животное издает звук");
    }
}

// Подкласс
class Dog extends Animal {
    // Переопределение метода sound() в подклассе Dog
    @Override
    public void sound() {
        System.out.println("Собака лает");
    }
}

// Подкласс
class Cat extends Animal {
    // Переопределение метода sound() в подклассе Cat
    @Override
    public void sound() {
        System.out.println("Кошка мяукает");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();

        // Вызовы переопределенных методов
        animal.sound();  // Животное издает звук
        dog.sound();     // Собака лает
        cat.sound();     // Кошка мяукает
    }
}