package ans_36.szablony_klas.singleton_class;

public class Singleton {
    private static Singleton instance;

    private Singleton() {}

    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }

        return instance;
    }
}
