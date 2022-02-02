package ch11;

// 이 클래스는 상위 클래스의 메서드를 모두 구현했다.
// 만약 이 클래스를 추상 클래스로 변경한다면, 상속을 위해 사용할 것이라는 뜻이 된다.
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
  public void turnOn() {
    System.out.println("Desktop 기동");
  }

  @Override
  public void turnOff() {
    System.out.println("Desktop 종료");
  }

}