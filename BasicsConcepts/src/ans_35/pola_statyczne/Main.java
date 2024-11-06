package ans_35.pola_statyczne;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("BMW","M4",2020,"RED");
        System.out.println(Car.counter); // 1
        Car car2 = new Car("Mercedes","S-Class",2022,"BLACK");
        System.out.println(car2.counter); // 2
    }
}
