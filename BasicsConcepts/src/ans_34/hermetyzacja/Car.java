package ans_34.hermetyzacja;

public class Car {
    private final String brand;

    private final String model;

    private final Integer productionYear;
    private final String color;
    public Car(String brand, String model, Integer productionYear, String color) {
        this.brand = brand;
        this.model = model;
        this.productionYear = productionYear;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public Integer getProductionYear() {
        return productionYear;
    }

    public String getColor() {
        return color;
    }
}

