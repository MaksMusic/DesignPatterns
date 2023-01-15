package Singleton;

public class Main {
    public static void main(String[] args) {
        SingletonObject singletonObject = SingletonObject.getSingletonObject();
        SingletonObject singletonObject1 = SingletonObject.getSingletonObject();

        System.out.println(singletonObject);
        System.out.println(singletonObject1);
    }
}
