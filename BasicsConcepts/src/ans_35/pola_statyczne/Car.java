package ans_35.pola_statyczne;

public class Car {
    public static Integer counter = 0;
    private String brand;

    private String model;

    private Integer productionYear;
    private String color;

    public Car(String brand, String model, Integer productionYear, String color) {
        counter++;
        this.brand = brand;
        this.model = model;
        this.productionYear = productionYear;
        this.color = color;
    }


    public static void staticMethod(){
        //this.brand = "dada"; // wyrzuca błąd `Cannot be referenced from a static context`
    }
}
