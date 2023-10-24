public class Main {
    public static void main(String[] args) {
      Car car1 = new Car();
      System.out.println(car1);
      Car car2 = new Car(2020);
      System.out.println(car2);
      Car car3 = new Car(1956, 41.5);
      System.out.println(car3);
      Car car4 = new Car(2021, 110.0, 1500);
      System.out.println(car4);
      Car car5 = new Car(2007, 120.5, 1400, "red");
      System.out.println(car5);
    }

}
