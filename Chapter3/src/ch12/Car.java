package ch12;

// 템플릿 메서드 패턴
// 프레임워크에서 많이 사용되는 설계 패턴이다.
// 추상 클래스로 선언된 상위 클래스에서 템플릿 메서드를 활용하여 전체 흐름을 정의하고
// 하위 클래스에서 다르게 구현되어야 하는 부분은 추상 메서드로 선언하여 하위 클래스에서 구현하도록 한다.
public abstract class Car {

  public abstract void drive();
  public abstract void stop();

  public void startCar() {
    System.out.println("시동을 켠다.");
  }

  public void turnOff() {
    System.out.println("시동을 끈다.");
  }

  //템플릿 메서드
  //추상 메서드나 구현된 메서드를 활용해 코드의 흐름(시나리오)을 정의하는 메서드
  //final로 선언하여 하위 클래스에서 재정의 할 수 없게 한다.
  final public void run() {
    startCar();
    drive();
    stop();
    turnOff();
  }

}