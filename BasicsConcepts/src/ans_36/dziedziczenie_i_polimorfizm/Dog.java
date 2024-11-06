package ans_36.dziedziczenie_i_polimorfizm;

public class Dog extends Animal{
    private String color;

    public Dog(String name, Integer birthYear, String color) {
        super(name, birthYear);
        this.color = color;
    }

    public Dog(String color) {
        System.out.println("Dog constructor called");
        this.color = color;
    }

    @Override
    public void voice() {
        System.out.println("Dog voice");
    }
}
