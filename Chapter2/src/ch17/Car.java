package ch17;

public class Car {

  private static int serialNum = 10001;
  private int carNum;

  public Car() {
    carNum = serialNum++;
  }

  public int getCarNum() {
    return carNum;
  }

  public void setCarNum(int carNum) {
    this.carNum = carNum;
  }

}