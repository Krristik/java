// Объявляем класс как final
final class FinalClass {
    public void displayMessage() {
        System.out.println("Это метод из final-класса FinalClass");
    }
}

// Попытка унаследовать final-класс
/*
class ChildClass extends FinalClass {
    // Этот код вызовет ошибку компиляции:
    // "Cannot inherit from final 'FinalClass'"
}
*/

public class FinalClassExample {
    public static void main(String[] args) {
        FinalClass finalClass = new FinalClass();
        finalClass.displayMessage();
        
        // ChildClass child = new ChildClass(); // Невозможно, так как наследование запрещено
    }
}
