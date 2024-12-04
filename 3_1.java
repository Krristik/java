package mypackage;

class AccessModifiersExample {
    
    // public: доступен в любом месте
    public int publicVar = 10;
    
    // protected: доступен в том же пакете и в подклассах
    protected int protectedVar = 20;
    
    // default (package-private): доступен только в том же пакете
    int defaultVar = 30;
    
    // private: доступен только в этом классе
    private int privateVar = 40;

    // public метод
    public void publicMethod() {
        System.out.println("Это публичный метод.");
    }

    // protected метод
    protected void protectedMethod() {
        System.out.println("Это защищенный метод.");
    }

    // default (package-private) метод
    void defaultMethod() {
        System.out.println("Это метод с доступом по умолчанию.");
    }

    // private метод
    private void privateMethod() {
        System.out.println("Это приватный метод.");
    }

    // Метод для доступа к privateVar
    public void accessPrivateVar() {
        System.out.println("Доступ к privateVar: " + privateVar);
    }
}

class AccessTest {

    public static void main(String[] args) {
        AccessModifiersExample obj = new AccessModifiersExample();

        // Доступ к переменным и методам в пределах одного пакета

        // Доступ к public переменной и методу
        System.out.println("publicVar: " + obj.publicVar);
        obj.publicMethod();

        // Доступ к protected переменной и методу
        System.out.println("protectedVar: " + obj.protectedVar);
        obj.protectedMethod();

        // Доступ к default переменной и методу (в том же пакете)
        System.out.println("defaultVar: " + obj.defaultVar);
        obj.defaultMethod();

        // Доступ к private переменной и методу через публичный метод
        obj.accessPrivateVar();
        
        // Попытка доступа к private переменной напрямую вызовет ошибку
        // System.out.println("privateVar: " + obj.privateVar); // Ошибка компиляции
        // obj.privateMethod(); // Ошибка компиляции
    }
}
