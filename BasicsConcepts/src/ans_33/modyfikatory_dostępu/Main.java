package ans_33.modyfikatory_dostępu;

public class Main {
    public static void main(String[] args) {
//        Car car1 = new Car(); // wyrzuca błąd ponieważ modyfikator dostępu jest prywatny
        Car car2 = new Car("M4"); // modyfikator dostępu `public`, możemy użyć tego konstruktora

        System.out.println(car2.capacity); // `protected`
        System.out.println(car2.productionYear); // public - dostęp z każdego poziomu projektu
    }
}
