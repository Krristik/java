import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        // Создаем объект Scanner для чтения ввода с консоли
        Scanner scanner = new Scanner(System.in);

        // Просим пользователя ввести имя
        System.out.print("Введите ваше имя: ");
        String name = scanner.nextLine();

        // Выводим приветственное сообщение
        System.out.println("Привет, " + name);

        // Закрываем Scanner
        scanner.close();
    }
}
