package com.example;

/**
 * Класс для демонстрации использования Javadoc.
 */
public class Calculator {

    /**
     * Суммирует два целых числа.
     *
     * @param a первое число для суммы
     * @param b второе число для суммы
     * @return сумма двух чисел
     */
    public int add(int a, int b) {
        return a + b;
    }

    /**
     * Вычитает второе целое число из первого.
     *
     * @param a первое число
     * @param b второе число, которое будет вычтено
     * @return разность первого и второго числа
     * @throws IllegalArgumentException если b больше a
     */
    public int subtract(int a, int b) {
        if (b > a) {
            throw new IllegalArgumentException("b не может быть больше a");
        }
        return a - b;
    }

    /**
     * Основной метод для тестирования операций.
     *
     * @param args аргументы командной строки
     */
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("10 + 5 = " + calculator.add(10, 5));
        System.out.println("10 - 5 = " + calculator.subtract(10, 5));
    }
}