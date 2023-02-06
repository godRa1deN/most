public class Main {
    public static void main(String[] args) {
        Singleton a = Singleton.getInstance();                    //создаем объект класса Singleton
        System.out.println(a.calculate());
    }
}