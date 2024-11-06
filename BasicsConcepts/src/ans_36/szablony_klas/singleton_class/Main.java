package ans_36.szablony_klas.singleton_class;

public class Main {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();

        System.out.println(instance == instance2);
    }
}
