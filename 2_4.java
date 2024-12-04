public class Main {
    public static void main(String[] args) {
        
        // 1) Примеры использования метода decode()
        String str = "123";
        Integer decodedValue = Integer.decode(str); // Декодирование строки в число
        System.out.println("Decoded value: " + decodedValue); // 123
        
        String hexStr = "0x1F";
        Integer decodedHexValue = Integer.decode(hexStr); // Декодирование строки в шестнадцатиричное число
        System.out.println("Decoded hex value: " + decodedHexValue); // 31
        
        String octalStr = "017";
        Integer decodedOctalValue = Integer.decode(octalStr); // Декодирование строки в восьмеричное число
        System.out.println("Decoded octal value: " + decodedOctalValue); // 15
        
        // 2) Способы создания экземпляра класса Boolean
        Boolean bool1 = Boolean.valueOf("true"); // Использование метода valueOf
        Boolean bool2 = Boolean.valueOf("false");
        Boolean bool3 = Boolean.TRUE; // Использование предустановленного значения TRUE
        Boolean bool4 = Boolean.FALSE; // Использование предустановленного значения FALSE
        Boolean bool5 = new Boolean("true"); // Конструктор (не рекомендуется, так как устарел)

        System.out.println("bool1: " + bool1);
        System.out.println("bool2: " + bool2);
        System.out.println("bool3: " + bool3);
        System.out.println("bool4: " + bool4);
        System.out.println("bool5: " + bool5);

        // 3) Пример исключения NullPointerException при автоупаковке/автораспаковке
        Integer nullInteger = null;
        try {
            int primitive = nullInteger; // Преобразование null в примитив вызывает NullPointerException
        } catch (NullPointerException e) {
            System.out.println("Exception: " + e);
        }
        
        // 4) Анализ кода с Integer
        int i1 = 128;
        Integer a1 = i1; // Автоупаковка
        Integer b1 = i1; // Автоупаковка
        System.out.println("a1==i1 " + (a1 == i1)); // false
        System.out.println("b1==i1 " + (b1 == i1)); // false
        System.out.println("a1==b1 " + (a1 == b1)); // false
        System.out.println("a1.equals(i1) -> " + a1.equals(i1)); // true
        System.out.println("b1.equals(i1) -> " + b1.equals(i1)); // true
        System.out.println("a1.equals(b1) -> " + a1.equals(b1)); // true

        int i2 = 127;
        Integer a2 = i2; // Автоупаковка
        Integer b2 = i2; // Автоупаковка
        System.out.println("a2==i2 " + (a2 == i2)); // true
        System.out.println("b2==i2 " + (b2 == i2)); // true
        System.out.println("a2==b2 " + (a2 == b2)); // true
        System.out.println("a2.equals(i2) -> " + a2.equals(i2)); // true
        System.out.println("b2.equals(i2) -> " + b2.equals(i2)); // true
        System.out.println("a2.equals(b2) -> " + a2.equals(b2)); // true

        // Объяснение полученного результата
        // Результат зависит от того, попадает ли значение в кэш Integer. Класс Integer использует кэш значений
        // от -128 до 127. Если значение выходит за этот диапазон, то создается новый объект Integer, и операторы сравнения
        // ссылок (==) не могут быть истинными для разных объектов.

        // Класс IntegerCache используется для оптимизации памяти, чтобы избежать создания множества объектов
        // Integer для часто используемых значений в диапазоне от -128 до 127.
    }
}
