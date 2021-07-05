package guru.qa;

public class Car {

    static String firstCreationDate = "1888";

    String color;
    boolean isUsed = false;
    char category = 'a';
    int power;

    public Car(String color, char category, int power) {
        this.color = color;
        this.category = category;
        this.power = power;
    }

    public Car() {
    }

    String getColor() {
        return color;
    }

    void setPower(int power) {
        this.power = power;
    }

    static void sayCreationDateForAllCars() {
        System.out.println(firstCreationDate);
    }

}
