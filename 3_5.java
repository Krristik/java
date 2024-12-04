public class VarargsExample {

    // Метод, принимающий одно или несколько целых чисел
    public void printNumbers(int... numbers) {
        System.out.println("Вывод чисел:");
        for (int num : numbers) {
            System.out.println(num);
        }
    }

    // Перегрузка метода, принимающая строку с переменным числом параметров
    public void printStrings(String... strings) {
        System.out.println("Вывод строк:");
        for (String str : strings) {
            System.out.println(str);
        }
    }

    // Перегрузка метода, принимающая одно или несколько чисел и строк
    public void printData(int number, String... strings) {
        System.out.println("Число: " + number);
        System.out.println("Вывод строк:");
        for (String str : strings) {
            System.out.println(str);
        }
    }

    public static void main(String[] args) {
        VarargsExample example = new VarargsExample();

        // Вызов метода с переменным числом целых чисел
        example.printNumbers(1, 2, 3, 4, 5);

        // Вызов метода с переменным числом строк
        example.printStrings("Java", "Python", "C++");

        // Вызов перегруженного метода с числом и строками
        example.printData(10, "Java", "Python", "C++");
    }
}
