public class Main {
    public static void main(String[] args) {
        // 1. Примеры всех типов данных
        int intVar = 10; // Целое число
        double doubleVar = 10.5; // Дробное число
        char charVar = 'A'; // Символ
        boolean booleanVar = true; // Логическое значение
        String stringVar = "Hello, World!"; // Строка
        int nullIntVar = 0; // Нулевое значение для целого числа
        double nullDoubleVar = 0.0; // Нулевое значение для дробного числа
        char nullCharVar = '\u0000'; // Нулевое значение для символа
        boolean nullBooleanVar = false; // Нулевое значение для логического

        // 2. Печать имени в консоли с помощью символов Unicode
        System.out.println("\u004B\u0072\u0069\u0073\u0074\u0069\u006E\u0061"); // Выводит "Kristina"

        // 3. Анализ кода с переменными a, b и c
        int a = 1;
        {
            int b = 2; // b объявлена в локальной области видимости
        }
        // int c = a + b; // Эта строка вызовет ошибку компиляции, так как b не доступна здесь
        // Объяснение: Переменная b имеет локальную область видимости и недоступна вне фигурных скобок.

        // 4. Использование перегруженного оператора + с объектами типа String
        String strVar = "Число: ";
        int number = 5;
        String result = strVar + number; // Конкатенация строки и числа
        System.out.println(result); // Выводит "Число: 5"

        // 5. Примеры арифметических операций с переменными различных типов
        int intValue = 10;
        double doubleValue = 5.5;
        double mixedResult = intValue + doubleValue; // int + double -> результат будет double
        System.out.println("Результат смешанной арифметики: " + mixedResult); // 15.5
        // Объяснение: При смешивании типов, результатом будет тип с более высоким масштабом, т.е. double.

        // 6. Примеры сужающего преобразования типов
        double doubleNumber = 123.45;
        int intNumber = (int) doubleNumber; // Сужающее преобразование: дробная часть отбрасывается
        System.out.println("Сужающее преобразование: " + intNumber); // 123

        // 7. Анализ кода с переменными b, c и d
        int a2 = 120;
        byte b2 = (byte) (a2 + 10); // Операция выполняется перед присвоением, результат в пределах границ byte
        byte c2 = (byte) (a2 + 10); // Принудительное приведение, результат будет 130, но в byte это -126
        byte d2 = (byte) (a2 + 1); // То же самое, 120 + 1 = 121, без проблем
        System.out.println("b2: " + b2 + ", c2: " + c2 + ", d2: " + d2); // b2: -126, c2: -126, d2: 121
        // Объяснение: b и c имеют отрицательное значение, так как int число выходит за пределы byte.

        // 8. Пример интерфейса типов и использование var
        var list = new java.util.ArrayList<String>(); // Используем var для уменьшения шаблонного кода
        list.add("Пример использования var");
        System.out.println(list.get(0)); // Выводит: Пример использования var
    }
}