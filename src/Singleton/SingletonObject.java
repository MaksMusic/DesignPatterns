package Singleton;

public class SingletonObject {

    private static  SingletonObject singletonObject;

    private SingletonObject() {
    }

    public static SingletonObject getSingletonObject(){
        if (singletonObject == null){
            singletonObject = new SingletonObject();
        }
        return singletonObject;
    }

}
