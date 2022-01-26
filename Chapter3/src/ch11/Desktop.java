package ch11;

public class Desktop extends Computer {

  @Override
  void display() {
    System.out.println("Desktop 디스플레이");
  }

  @Override
  void typing() {
    System.out.println("Desktop 타이핑");
  }

  @Override
  public void turnOff() {
    System.out.println("Desktop 종료");
  }

}