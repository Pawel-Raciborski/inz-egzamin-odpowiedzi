package ans_33.podstawowe_elementy_klasy;

public class Car {
    private String company;
    private String model;
    private String color;
    private int capacity;

    {
        // blok inicjalizacyjny
        // Uruchamiany jest raz przed konstruktorem, który wywołaliśmy
        System.out.println("Init block");
        this.model="Mercedes";
        this.color="Red";
    }

    static {
        // blok kodu uruchamiany tylko raz podczas pierwszego użycia klasy
        System.out.println("Calls ony once");
    }

    public Car() {
        System.out.println("Default constructor public Car()");
    }

    public Car(String company, String model, String color) {
        super();
        System.out.println("Constructor public Car(String model, String color)");
        this.company = company;
        this.model = model;
        this.color = color;
    }

    public void method(){
        System.out.println("Method1");
    }

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

    public static class NestedClass{
        private Integer integer;
    }
}
