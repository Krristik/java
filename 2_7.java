public class InfiniteLoopExamples {
    public static void main(String[] args) {
        // 1) Пример бесконечного цикла while
        System.out.println("Бесконечный цикл while:");
        int a = 0;
        while (true) {
            System.out.println("a = " + a);
            a++;  // Увеличиваем a

            // Для демонстрации прервем цикл после 10 итераций
            if (a >= 10) {
                System.out.println("Выход из while, a >= 10");
                break; // Использование break для выхода из цикла
            }
        }

        // 2) Пример бесконечного цикла do-while
        System.out.println("\nБесконечный цикл do-while:");
        int b = 0;
        do {
            System.out.println("b = " + b);
            b++;  // Увеличиваем b

            // Для демонстрации прервем цикл после 10 итераций
            if (b >= 10) {
                System.out.println("Выход из do-while, b >= 10");
                break; // Использование break для выхода из цикла
            }
        } while (true);

        // 3) Пример использования операторов break и continue с циклом for
        System.out.println("\nПример с break и continue в цикле for:");
        for (int c = 0; c < 10; c++) {
            if (c == 3) {
                System.out.println("Continue на c = " + c);
                continue; // Пропускаем текущую итерацию, когда c = 3
            }
            if (c == 8) {
                System.out.println("Break на c = " + c);
                break; // Прерываем цикл, когда c = 8
            }
            System.out.println("c = " + c);
        }
    }
}
