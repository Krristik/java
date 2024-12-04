public class Main {
    public static void main(String[] args) {
        // 1) Что произойдет в результате выполнения следующего кода?
        int[] a1 = {1, 2, 3, 4, 5};
        int[] a2 = {6, 7, 8, 9, 10};
        
        a1 = a2;  // Присваиваем a2 ссылке a1

        // Выводим элементы массивов
        System.out.println("a1 после присваивания a2:");
        for (int i : a1) {
            System.out.print(i + " ");  // Выведет элементы массива a2
        }
        System.out.println();

        System.out.println("a2:");
        for (int i : a2) {
            System.out.print(i + " ");  // Выведет элементы массива a2
        }
        System.out.println();

        // a1 теперь указывает на тот же массив, что и a2, так что они оба содержат {6, 7, 8, 9, 10}
    }
}
