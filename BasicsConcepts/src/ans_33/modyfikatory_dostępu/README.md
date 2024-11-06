# MODYFIKATORY DOSTĘPU
Odpowiedzialne są widoczność klas, pól, metod oraz konstruktorów. Dzięki modyfikatorom dostępu mamy możliwość kontrolowania dostępu do elementów klasy (enkapsulacja).

### Wyróżniamy 4 poziomy modyfikatorów:
- **public** – elementy dostępne z każdego poziomu w projekcie
- **protected** – element jest dostępny w tej samej klasie, klasach znajdujących się w tym samym pakiecie oraz we wszystkich klasach dziedziczących po danej klasie, nawet jeśli znajdują się w innych pakietach.
- **package-private(default)** - element o dostępie domyślnym jest dostępny tylko w obrębie tego samego pakietu.
- **private** – element jest dostępny tylko w obrębie tej samej klasy.

```java
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
    private void privateMethod() {
        System.out.println("privateMethod");
    }

    // Metoda package-private - dostępna tylko na poziomie paczki
    void packagePrivateMethod() {
        System.out.println("packagePrivateMethod");
    }

    // // Metoda publiczna - dostępna w całym projekcie
    public void publicMethod() {
        System.out.println("publicMethod");
    }
}

```