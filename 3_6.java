public class EnumExamples {

    // 1) Пример с инициализацией элементов перечисления
    public enum Day {
        MONDAY("Понеделник"),
        TUESDAY("Вторник"),
        WEDNESDAY("Среда"),
        THURSDAY("Четверг"),
        FRIDAY("Пятница"),
        SATURDAY("Суббота"),
        SUNDAY("Воскресенье");

        private String russianName;

        // Конструктор для инициализации значения
        Day(String russianName) {
            this.russianName = russianName;
        }

        // Метод для получения русского названия дня недели
        public String getRussianName() {
            return russianName;
        }
    }

    // 2) Пример реализации собственного перечисления с дополнительным методом
    public enum Color {
        RED("Красный", "#FF0000"),
        GREEN("Зеленый", "#00FF00"),
        BLUE("Синий", "#0000FF");

        private String name;
        private String hexCode;

        // Конструктор для инициализации значений
        Color(String name, String hexCode) {
            this.name = name;
            this.hexCode = hexCode;
        }

        // Метод для получения русского названия цвета
        public String getName() {
            return name;
        }

        // Метод для получения кода цвета в формате HEX
        public String getHexCode() {
            return hexCode;
        }

        // Дополнительный метод для вывода информации о цвете
        public void displayColorInfo() {
            System.out.println("Цвет: " + name + ", HEX: " + hexCode);
        }
    }

    public static void main(String[] args) {
        // Пример использования перечисления Day
        System.out.println("Дни недели на русском:");
        for (Day day : Day.values()) {
            System.out.println(day + ": " + day.getRussianName());
        }

        // Пример использования перечисления Color с дополнительным методом
        System.out.println("\nИнформация о цветах:");
        for (Color color : Color.values()) {
            color.displayColorInfo();
        }
    }
}
