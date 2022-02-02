package ch17;

// 일반적인 클래스의 다중 상속이 안되는 이유
// 최상위 클래스 A가 있고, 그 클래스를 상속받은 클래스 B와 클래스 C가 있으며,
// B와 C를 동시에 상속받은(다중 상속받은) D가 있다고 가정하자.
// 또 클래스 A의 메서드 a가 클래스 B와 C에서 각각 서로 다른 내용으로 재정의 되었다고 가정하자.
// 상속과 무관한 다른 클래스에서 클래스 D의 a 메서드를 사용하고자 할 때,
// 어느 클래스의 a 메서드를 사용하게 되는지 알 수 없다는 문제가 발생한다.(모호함 발생)
// 이를 Diamond Problem이라 한다.
// 이와 같은 상황을 회피하기 위해 자바에서는 다중 상속을 막아 놓았다.

// 여러 인터페이스 구현
// 자바에서 인터페이스는 구현 코드가 없으므로, 하나의 클래스에서 여러 인터페이스를 구현할 수 있다.
// 만약 서로 다른 인터페이스에 같은 이름의 디폴트 메서드가 있을 경우,
// 구현하는 클래스에서 반드시 재정의 해야 한다.
// 여러 인터페이스를 구현한 클래스가 인터페이스 타입으로 형 변환될 경우
// 해당 인터페이스에 선언된 메서드만 사용 가능하다.
public class Customer implements Buy, Sell {

  @Override
  public void sell() {
    System.out.println("Customer Sell");
  }

  @Override
  public void buy() {
    System.out.println("Customer Buy");
  }

  public void greetings() {
    System.out.println("Hello!");
  }

  @Override
  public void order() {
    System.out.println("고객 주문");
  }

}