package ch12;

public class AICar extends Car {

  @Override
  public void drive() {
    System.out.println("자율 주행 차량");
    System.out.println("차량이 자동으로 주행한다.");
  }

  @Override
  public void stop() {
    System.out.println("차량이 자동으로 정지한다.");
  }

}