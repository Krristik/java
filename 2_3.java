public class Main {
    public static void main(String[] args) {
        // Пример 1: Операторы с операндами базовых типов
        int a = 5;
        int b = 3;
        double x = 5.5;
        double y = 2.2;

        // Операторы арифметические
        System.out.println("a + b = " + (a + b)); // 8
        System.out.println("x - y = " + (x - y)); // 3.3
        System.out.println("a * b = " + (a * b)); // 15
        System.out.println("x / y = " + (x / y)); // 2.5

        // Операторы инкремента и декремента
        System.out.println("a++ = " + a++); // 5 (постфиксная форма)
        System.out.println("++a = " + ++a); // 7 (префиксная форма)
        System.out.println("b-- = " + b--); // 3 (постфиксная форма)
        System.out.println("--b = " + --b); // 2 (префиксная форма)

        // Операторы сравнения
        System.out.println("a == b: " + (a == b)); // false
        System.out.println("x != y: " + (x != y)); // true
        System.out.println("a > b: " + (a > b)); // true

        // Операторы логические
        boolean isTrue = true;
        boolean isFalse = false;
        System.out.println("isTrue && isFalse: " + (isTrue && isFalse)); // false
        System.out.println("isTrue || isFalse: " + (isTrue || isFalse)); // true

        // Операторы побитовые
        int bitwiseAnd = a & b; // побитовое И
        int bitwiseOr = a | b; // побитовое ИЛИ
        System.out.println("a & b = " + bitwiseAnd); // 6
        System.out.println("a | b = " + bitwiseOr); // 7

        // Операторы присваивания
        a += b; // a = a + b
        System.out.println("a += b: " + a); // 9

        // Пример 2: Операторы с операндами типа String
        String str1 = "Hello";
        String str2 = "World";
        
        // Операторы сложения строк
        String result = str1 + " " + str2; // Сложение строк
        System.out.println("str1 + str2: " + result); // Hello World

        // Оператор сравнения строк
        System.out.println("str1 == str2: " + (str1 == str2)); // false
        System.out.println("str1.equals(str2): " + str1.equals(str2)); // false

        // Оператор инкремента и декремента с String (не поддерживаются напрямую)
        // String не поддерживает инкремент, но можно сделать что-то аналогичное через конкатенацию:
        str1 += " Java"; // str1 = str1 + " Java"
        System.out.println("str1 после инкремента: " + str1); // Hello Java

        // Пример 3: Использование оператора instanceof
        Object obj1 = "Hello";
        Object obj2 = 123;

        // Проверка типа с помощью instanceof
        System.out.println("obj1 instanceof String: " + (obj1 instanceof String)); // true
        System.out.println("obj2 instanceof String: " + (obj2 instanceof String)); // false

        // Пример с null
        Object obj3 = null;
        System.out.println("obj3 instanceof String: " + (obj3 instanceof String)); // false

        // Проверка с конкретным классом
        if (obj1 instanceof String) {
            String strObj = (String) obj1; // Преобразование типа
            System.out.println("obj1 is a String with value: " + strObj); // obj1 is a String with value: Hello
        }
    }
}
