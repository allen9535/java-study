package ch17;

public class CarFactory {

  private CarFactory() {}

  private static CarFactory instance = new CarFactory();
  private static int carNum = 10001;

  public static CarFactory getInstance() {
    return instance;
  }

  public Car createCar() {

    Car car = new Car();
    car.setCarNum(carNum++);

    return car;

  }

}