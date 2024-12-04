public class Main {
    public static void main(String[] args) {
        
        // 1) Пример с целочисленными типами (int, byte, short, char)
        
        int intVar = 2;
        switch (intVar) {
            case 1:
                System.out.println("intVar is 1 (int)");
                break;
            case 2:
                System.out.println("intVar is 2 (int)");
                break;
            default:
                System.out.println("intVar is not 1 or 2");
        }

        byte byteVar = 3;
        switch (byteVar) {
            case 1:
                System.out.println("byteVar is 1 (byte)");
                break;
            case 3:
                System.out.println("byteVar is 3 (byte)");
                break;
            default:
                System.out.println("byteVar is not 1 or 3");
        }

        short shortVar = 5;
        switch (shortVar) {
            case 5:
                System.out.println("shortVar is 5 (short)");
                break;
            default:
                System.out.println("shortVar is not 5");
        }

        char charVar = 'A';
        switch (charVar) {
            case 'A':
                System.out.println("charVar is A (char)");
                break;
            case 'B':
                System.out.println("charVar is B (char)");
                break;
            default:
                System.out.println("charVar is not A or B");
        }

        // 2) Пример с использованием String
        String stringVar = "Hello";
        switch (stringVar) {
            case "Hello":
                System.out.println("stringVar is Hello (String)");
                break;
            case "World":
                System.out.println("stringVar is World (String)");
                break;
            default:
                System.out.println("stringVar is not Hello or World");
        }

        // 3) Пример с использованием enum
        Day day = Day.MONDAY;
        switch (day) {
            case MONDAY:
                System.out.println("Day is Monday (enum)");
                break;
            case TUESDAY:
                System.out.println("Day is Tuesday (enum)");
                break;
            default:
                System.out.println("Day is neither Monday nor Tuesday");
        }

        // 4) Пример с использованием var (Java 12+)
        var varVar = 4;
        switch (varVar) {
            case 1:
                System.out.println("varVar is 1 (var)");
                break;
            case 4:
                System.out.println("varVar is 4 (var)");
                break;
            default:
                System.out.println("varVar is not 1 or 4");
        }

        // 5) Пример с отсутствием break (провал в следующий case)
        int i = 0;
        int x = 3; // Пример для case 2 (отсутствие break)
        switch (x) {
            case 1:
                i = 1;
                break;
            case 2:
                i = 2;
                // отсутствует break, поэтому выполнение продолжится в следующий case
            case 3:
                i = 3; // Этот блок будет выполнен после case 2, т.к. нет break в case 2
                break;
            default:
                i = 4;
        }
        System.out.println("Value of i after switch: " + i); // Выведет: Value of i after switch: 3
    }

    // Пример перечисления (enum)
    enum Day {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }
}
