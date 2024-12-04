import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // 2) Пример использования методов класса java.util.Arrays

        // Массив для примеров
        int[] arr = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5};

        // Метод 1: Arrays.toString(...) - Преобразует массив в строку
        System.out.println("Arrays.toString(arr): " + Arrays.toString(arr));

        // Метод 2: Arrays.binarySearch(...) - Поиск элемента в отсортированном массиве
        // Для бинарного поиска массив должен быть отсортирован
        Arrays.sort(arr);  // Сортируем массив
        int index = Arrays.binarySearch(arr, 5);  // Ищем элемент 5
        System.out.println("Индекс элемента 5 после сортировки: " + index);

        // Метод 3: Arrays.equals(...) - Проверка на равенство двух массивов
        int[] arr2 = {1, 2, 3};
        int[] arr3 = {1, 2, 3};
        boolean areEqual = Arrays.equals(arr2, arr3);  // Сравниваем два массива
        System.out.println("arr2 и arr3 равны: " + areEqual);

        // Метод 4: Arrays.compare(...) - Сравнение двух массивов
        int[] arr4 = {1, 2, 3};
        int[] arr5 = {1, 2, 4};
        int comparisonResult = Arrays.compare(arr4, arr5);  // Сравниваем два массива
        System.out.println("Результат сравнения arr4 и arr5: " + comparisonResult);

        // Метод 5: Arrays.sort(...) - Сортировка массива
        System.out.println("Массив до сортировки: " + Arrays.toString(arr));
        Arrays.sort(arr);  // Сортируем массив
        System.out.println("Массив после сортировки: " + Arrays.toString(arr));
    }
}