package ch11;

// 추상 클래스(Abstract Class)
// 구체적 클래스(Concrete Class)의 반대 개념
// 구현 코드 없이 선언만 있는 추상 메서드(abstract method)를 포함한 클래스를 말한다.
// abstract 예약어를 사용한다.
// 추상 클래스는 new를 사용해 인스턴스화 할 수 없다.
// 결과적으로, 상속을 위해 만드는 클래스이다.

// 메서드 선언: 반환 타입, 메서드 이름, 매개 변수로 구성
// 메서드 정의: 메서드 구현(implementation)과 동일한 의미, 구현부(body)를 가진다.({})
// 예) int add(int x, int y);    // 선언은 되어 있지만 정의가 되어 있지 않음, 추상 메서드
// 예) int add(int x, int y) {}  // 선언도 되어 있고 정의도 되어 있음, 추상 메서드가 아님.
public abstract class Computer {

  // 메서드에 구현 코드가 없으면 abstract로 선언한다.
  // 이와 같이 abstract가 선언된 메서드가 있다면 해당 메서드를 가진 클래스도 abstract를 선언한다.
  // 설령 모든 메서드가 구현이 되어있는 클래스라 하더라도, abstract로 선언되면 추상 클래스가 된다.
  // 즉, 인스턴스화 할 수 없다.
  // 추상 클래스 내 추상 메서드는 하위 클래스에서 상속하여 구현해야 한다.
  abstract void display();
  abstract void typing();

  // 추상 클래스 내의 구현 되어있는 메서드
  // 하위 클래스에서도 공통적으로 사용할 메서드이다.
  // 필요에 따라 하위 클래스에서 재정의 될 수 있다.
  public void turnOn() {
    System.out.println("전원을 켠다.");
  }

  public void turnOff() {
    System.out.println("전원을 끈다.");
  }

}