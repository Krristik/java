// Практика #1 и Практика #2 в одном файле
public class GenericsPractice {

    // Параметризованный класс для примера
    static class Box<T> {
        private T value;

        public Box(T value) {
            this.value = value;
        }

        public T getValue() {
            return value;
        }

        public void setValue(T value) {
            this.value = value;
        }
    }

    public static void main(String[] args) {
        // Практика #1: использование оператора instanceof с объектами параметризованных классов
        Box<Integer> integerBox = new Box<>(42);
        Box<String> stringBox = new Box<>("Hello");

        // instanceof проверяет объект на соответствие классу Box
        if (integerBox instanceof Box<?>) { // Параметр типа игнорируется
            System.out.println("integerBox является экземпляром Box<?>");
        }

        if (stringBox instanceof Box<?>) { // Параметр типа игнорируется
            System.out.println("stringBox является экземпляром Box<?>");
        }

        // Нельзя напрямую проверить параметризированный тип
        // Например: integerBox instanceof Box<Integer> - вызовет ошибку компиляции.

        // Практика #2: примеры использования <? extends T> и <? super T>

        // 1. <? extends T> - верхняя граница: принимаем объекты, которые являются T или его наследниками
        Box<? extends Number> numberBox = new Box<>(3.14); // Double наследуется от Number
        Number number = numberBox.getValue(); // Безопасно: результат гарантированно типа Number или его подкласса
        // numberBox.setValue(10); // Ошибка компиляции: неизвестный точный тип параметра

        // 2. <? super T> - нижняя граница: принимаем объекты, которые являются T или его суперклассами
        Box<? super Integer> integerSuperBox = new Box<>(100); // Object или Number также допустимы
        integerSuperBox.setValue(200); // Безопасно: Integer или его подкласс
        Object value = integerSuperBox.getValue(); // Результат может быть Object или Number

        // Зачем нужны конструкции <? extends T> и <? super T>?

        // - <? extends T>  для чтения данных из структуры
        printNumbers(numberBox);

        // - <? super T>  для записи данных в структуру
        addNumbers(integerSuperBox);
    }

    // Пример использования <? extends T>
    public static void printNumbers(Box<? extends Number> box) {
        System.out.println("Число: " + box.getValue());
    }

    // Пример использования <? super T>
    public static void addNumbers(Box<? super Integer> box) {
        box.setValue(123);
        System.out.println("Добавлено значение: 123");
    }
}
