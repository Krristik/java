// Суперкласс с final-методом
class Parent {
    // Объявляем метод final, чтобы запретить его переопределение
    public final void displayMessage() {
        System.out.println("Это сообщение из класса Parent");
    }
}

// Подкласс, пытающийся переопределить final-метод
class Child extends Parent {
    // Попытка переопределить метод
    /*
    @Override
    public void displayMessage() {
        System.out.println("Это сообщение из класса Child");
    }
    */
    // Закомментированный код выше вызовет ошибку компиляции:
    // "Cannot override the final method from Parent"
}

public class FinalMethodExample {
    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.displayMessage();

        Child child = new Child();
        child.displayMessage(); // Вызовется метод суперкласса, т.к. переопределение запрещено
    }
}