package homework8;

public class Car {
    private int year;
    private double speed;
    private int weight;
    private String color;

    @Override
    public String toString() {
        return "homework8.Car{" +
                "year=" + year +
                ", speed=" + speed +
                ", weight=" + weight +
                ", color='" + color + '\'' +
                '}';
    }

    public Car(int year, double speed, int weight, String color) {
        this(year,speed,weight);
        this.color = color;
    }

    public Car(int year, double speed, int weight) {
        this(year,speed);
        this.weight = weight;
    }

    public Car(int year, double speed) {
        this(year);
        this.speed = speed;
    }

    public Car(int year) {
        this();
        this.year = year;
    }

    public Car() {
    }
}
