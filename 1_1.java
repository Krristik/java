// Суперкласс
class Bird {
    public void eat() {
        System.out.println("This bird can eat.");
    }
}

// Интерфейс для летающих птиц
interface Flyable {
    void fly();
}

// Подкласс летающих птиц
class Sparrow extends Bird implements Flyable {
    @Override
    public void fly() {
        System.out.println("Sparrow is flying!");
    }
}

// Подкласс нелетающих птиц
class Penguin extends Bird {
    public void swim() {
        System.out.println("Penguin is swimming!");
    }
}

public class Main {
    public static void main(String[] args) {
        Bird bird1 = new Sparrow();
        Bird bird2 = new Penguin();

        bird1.eat();
        bird2.eat();

        if (bird1 instanceof Flyable) {
            ((Flyable) bird1).fly(); // Вывод: "Sparrow is flying!"
        }
        // Нет попыток заставить Penguin летать — LSP соблюден.
    }
}
