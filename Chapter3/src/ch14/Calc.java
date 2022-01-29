package ch14;

// 인터페이스(interface)
// 모든 메서드가 추상 메서드로 선언된다.(public abstract)
// 메서드 선언만 존재하고 구현이 없다.
// 모든 변수는 상수로 선언된다.(public abstract final)
// * 자바 8부터 디폴트 메서드(default method)와 정적 메서드(static method) 기능 제공으로 인해,
//   일부 구현되는 메서드가 있다.

// 인터페이스 사용 이유
// 클래스나 프로그램이 제공하는 기능을 명시적으로 선언한다.
// 일종의 클라이언트 코드와의 약속이며, 클래스나 프로그램이 제공하는 명세(specification)이다.
// 클라이언트 프로그램은 인터페이스에 선언된 메서드 명세만 보고도 이를 구현한 클래스를 사용할 수 있다.
// 어떤 객체가 하나의 인터페이스 타입이라는 것은 그 인터페이스가 제공하는 모든 메서드를 구현했다는 의미이다.
// 인터페이스를 구현한 다양한 객체를 사용한다 = 다형성    (예. JDBC 인터페이스)
public interface Calc {

  double PI = 3.14;
  int ERROR = -99999999;

  int add(int num1, int num2);
  int substract(int num1, int num2);
  int times(int num1, int num2);
  int divide(int num1, int num2);

}