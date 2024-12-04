class Calculator {
    
    // Перегрузка метода add для сложения двух целых чисел
    public int add(int a, int b) {
        return a + b;
    }

    // Перегрузка метода add для сложения двух чисел с плавающей точкой
    public double add(double a, double b) {
        return a + b;
    }

    // Перегрузка метода add для сложения трех целых чисел
    public int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        // Вызов перегруженных методов
        System.out.println("Сложение двух целых чисел: " + calculator.add(3, 4)); // int
        System.out.println("Сложение двух чисел с плавающей точкой: " + calculator.add(3.5, 4.5)); // double
        System.out.println("Сложение трех целых чисел: " + calculator.add(1, 2, 3)); // int
    }
}
