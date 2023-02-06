public class Singleton {
    private static Singleton instance;          //приватное поле для хранения объекта класса

    private Singleton() {}                     //приватный конструктор
    public static Singleton getInstance() {     //публичный метод - глобальная точка доступа к объекту
        if (instance == null) {                 //если объект не был создан, то создаем
            instance = new Singleton();
        }
        return instance;                        //возвращаем объект
    }
    int calculate() {
        return 5;
    }

}
