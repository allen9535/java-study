package ch04;

public class AboutInheritanceAndUpcasting {

  // 상속에서의 인스턴스 메모리 상태
  // 항상 상위 클래스의 인스턴스가 먼저 생성되고, 그 다음 하위 클래스의 인스턴스가 생성된다.

  // 형 변환(업 캐스팅)
  // 상위 클래스로 변수를 선언한 다음 하위 클래스의 생성자로 인스턴스를 생성한다.
  // 예) Customer lee = new VIPCustomer();
  // 상위 클래스 타입의 변수에 하위 클래스 변수를 대입한다.
  // 예) VIPCustomer vCustomer = new VIPCustomer();
  // int addCustomer(Customer customer) {};
  // addCustomer(vCustomer);
  // 하위 클래스는 상위 클래스의 타입을 내포하고 있으므로, 상위 클래스로의 묵시적 형 변환이 가능하다.
  // 상속 관계에서 모든 하위 클래스는 상위 클래스로 형 변환(업 캐스팅) 된다.(역은 성립하지 않는다.)

  // 형 변환과 메모리
  // Customer vc = new VIPCustomer(); 에서 vc가 가리키는 것은 무엇인가?
  // VIPCustomer() 생성자에 의해 VIPCustomer에 대한 모든 멤버 변수는 생성되었으나,
  // 변수 타입이 Customer 이므로 실제 접근 가능한 변수와 메서드는 Customer의 변수와 메서드이다.

  // 클래스의 계층 구조가 여러 단계일 경우
  // 예를 들어, Mammal 클래스가 가장 상위 클래스이고, 그 하위 클래스로 Tiger와 Primate이 있으며,
  // Primate의 하위 클래스로 Human이 있다고 가정해보자.
  // 이 경우 Human은 Primate과 Mammal 타입을 모두 내포하게 된다.
  // 따라서 다음과 같이 사용할 수 있다.
  // Primate human = new Human(); Mammal human = new Human();

}