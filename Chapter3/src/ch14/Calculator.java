package ch14;

// 인터페이스를 구현한 클래스
// 인터페이스를 구현한 클래스의 경우, 인터페이스 형으로 선언된 변수로 형 변환 할 수 있다.
// Calc --> implements --> Calculator --> extends --> CompleteCalc
// 상속에서의 형 변환과 동일한 의미이다.
// 다만, 상속과는 달리 구현 코드가 없으므로 여러 인터페이스를 구현할 수 있다.
// 형 변환되는 경우 인터페이스에서 선언된 메서드만 사용 가능하다.
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