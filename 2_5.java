public class Main {
    public static void main(String[] args) {
        int a = 2; // Пример значения для переменной a
        int i = (a == 1) ? 1 : ((a == 2) ? 2 : 3);
        System.out.println("i = " + i); // Выведет: i = 2
    }
}