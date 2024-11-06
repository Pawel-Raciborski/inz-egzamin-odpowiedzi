package ans_36.dziedziczenie_i_polimorfizm;

public class Animal {
    private String name;
    private Integer birthYear;

    public Animal() {
        System.out.println("Default constructor called");
    }

    public Animal(String name, Integer birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }

    public void voice(){
        System.out.println("Animal voice");
    }
}
