package ch14;

// 인터페이스를 구현한 클래스를 상속받은 클래스
// 상위 클래스인 Calculator에서 일부 메서드를 구현했으므로, 구현되지 않은 메서드만 구현하면 된다.

// 이 클래스는 Calc 인터페이스를 구현했기 때문에, Calc 타입이 구현되어 있다.
// 따라서 인터페이스를 구현한 클래스로 변수를 만들 때, 인터페이스 타입으로 형 변환 할 수 있다.
// 이를 타입 상속 했다고 표현한다.(구현 코드를 받는 구현 상속과는 다르다.)
// 상속에서의 형 변환과 동일한 의미이다.
// 다만, 상속과는 달리 구현 코드가 없으므로 여러 인터페이스를 구현할 수 있다.(모호성이 없으므로)
// 형 변환되는 경우 인터페이스에서 선언된 메서드만 사용 가능하다.
public class CompleteCalc extends Calculator {

  @Override
  public int times(int num1, int num2) {
    return num1 * num2;
  }

  @Override
  public int divide(int num1, int num2) {
    if (num2 == 0) {
      return ERROR;
    } else {
      return num1 / num2;
    }
  }

  // 상위 클래스에 없던 메서드를 만들어도 된다.
  public void showInfo() {
    System.out.println("구현 완료!");
  }

}