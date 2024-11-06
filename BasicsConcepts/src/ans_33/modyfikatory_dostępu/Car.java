package ans_33.modyfikatory_dostępu;

public class Car {
    public Integer productionYear;
    String model; // package-private(default)
    protected Integer capacity;
    private String company; // private

    // konstruktor prywatny
    private Car() {
        System.out.println("Private constructor");
    }
    public Car(String model) {
        this.model = model;
    }

    // Metoda prywatna
    private void privateMethod(){
        System.out.println("privateMethod");
    }

    // Metoda package-private - dostępna tylko na poziomie paczki
    void packagePrivateMethod(){
        System.out.println("packagePrivateMethod");
    }

    // // Metoda publiczna - dostępna w całym projekcie
    public void publicMethod(){
        System.out.println("publicMethod");
    }
}
