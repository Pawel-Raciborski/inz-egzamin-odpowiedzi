# Podstawowe elementy klasy

### Klasa
Jest to struktura, która pozwala na definiowanie nowych typów danych. Na podstawie tego wzorca, tworzona jest instancja(obiekt w pamięci).

#### Podstawowe elementy klasy
Składniki klasy:
- **pola** (statyczne, instancyjne) , inaczej zwane cechami:
    - przechowują wartości obiektu
- **metody** (statyczne, instancyjne), zwane też zachowaniem
    - odpowiadają za przeprowadzanie operacji obliczeniowych
- **konstruktory**
    - opisują to jak obiekt ma zostać stworzony
    - może być ich więcej jak jeden o różnej sygnaturze
    - klasa posiada zawsze konstruktor domyślny
- klasy zagnieżdżone
    - są to klasy wewnątrz innej klasy

```java
package ans_33.podstawowe_elementy_klasy;

public class Car {
  // pola instancyjne - należą do instancji obiektu
  private String model;
  private String color;
  private int capacity;

  // pola statyczne - należą one do klasy
  private static String str;

  {
    // blok inicjalizacyjny
    // Uruchamiany jest raz przed konstruktorem, który wywołaliśmy
    System.out.println("Init block");
    this.model = "Mercedes";
    this.color = "Red";
  }

  static {
    // blok kodu uruchamiany tylko raz podczas pierwszego użycia klasy
    System.out.println("Calls ony once");
  }

  public Car() {
    System.out.println("Default constructor public Car()");
  }

  public Car(String model, String color) {
    System.out.println("Constructor public Car(String model, String color)");
    this.model = model;
    this.color = color;
  }

  // metoda instancyjna - należy do obiektu
  public void method() {
    System.out.println("Method1");
  }

  // metoda statyczna - należy do klasy
  public static void staticMethod() {
    System.out.println("Static method");
  }

  // gettery i settery - odpowiadają za ustawienie/pobieranie wartości pól
  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public int getCapacity() {
    return capacity;
  }

  public void setCapacity(int capacity) {
    this.capacity = capacity;
  }

  // klasy zagnieżdżone
  public static class NestedClass {
    private Integer integer;
  }
}

```