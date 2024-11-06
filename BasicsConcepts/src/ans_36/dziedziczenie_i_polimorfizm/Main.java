package ans_36.dziedziczenie_i_polimorfizm;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Fafik",2020,"brown");
        System.out.println(dog);

        Dog dog1 = new Dog("Black");

        Animal animal = new Animal();
        animal.voice(); // wypisze "Animal voice"

        Animal a = new Dog("red");
        a.voice(); // wypisze "Dog voice"
    }
}
