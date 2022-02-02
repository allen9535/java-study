package ch12;

public class CarTest {

  public static void main(String[] args) {
    Car hCar = new ManualCar();
    hCar.run();

    System.out.println("------------------------------");

    Car aiCar = new AICar();
    aiCar.run();
  }

}