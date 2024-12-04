public class A {
    public static int a = 1;
    public static int b;

    public static void printVars() {
        System.out.println(a);
        System.out.println(b);
    }
}

public class Main {
    public static void main(String[] args) {
        // 1. Вызов через имя класса
        System.out.println("Вызов через имя класса:");
        A.printVars();

        // 2. Вызов через объект 
        System.out.println("\nВызов через объект:");
        A obj = new A();
        obj.printVars();

        // 3. Вызов в другом классе
        System.out.println("\nВызов из другого класса:");
        AnotherClass.callPrintVars();

        // 4. Вызов внутри статического блока
        System.out.println("\nВызов внутри статического блока:");
        StaticBlockExample.printVarsInStaticBlock();
    }
}

class AnotherClass {
    public static void callPrintVars() {
        System.out.println("\nВызов из другого класса:");
        A.printVars();
    }
}

class StaticBlockExample {
    static {
        System.out.println("\nСтатический блок:");
        A.printVars();
    }

    public static void printVarsInStaticBlock() {
        // Этот метод уже вызовет printVars() из статического блока
    }
}
