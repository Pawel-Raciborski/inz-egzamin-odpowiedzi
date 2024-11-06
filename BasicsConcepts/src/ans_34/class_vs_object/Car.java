package ans_34.class_vs_object;

import java.util.Objects;

// Klasa
public class Car {
    private String brand;

    private String model;

    private Integer productionYear;
    private String color;
    public Car(String brand, String model, Integer productionYear, String color) {
        this.brand = brand;
        this.model = model;
        this.productionYear = productionYear;
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (!Objects.equals(model, car.model)) return false;
        if (!Objects.equals(productionYear, car.productionYear))
            return false;
        return Objects.equals(color, car.color);
    }

    @Override
    public int hashCode() {
        int result = model != null ? model.hashCode() : 0;
        result = 31 * result + (productionYear != null ? productionYear.hashCode() : 0);
        result = 31 * result + (color != null ? color.hashCode() : 0);
        return result;
    }
}
