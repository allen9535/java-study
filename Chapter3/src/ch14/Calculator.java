package ch14;

// 인터페이스를 구현한 클래스
// 이 클래스의 경우, 인터페이스 Calc의 메서드를 일부만 구현했으므로, 추상 클래스가 된다.
// 인터페이스의 모든 메서드를 구현했다면 추상 클래스가 될 수 없다.
public abstract class Calculator implements Calc {

  @Override
  public int add(int num1, int num2) {
    return num1 + num2;
  }

  @Override
  public int substract(int num1, int num2) {
    return num1 - num2;
  }

}