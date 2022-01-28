package ch14;

// 인터페이스(interface)
// 모든 메서드가 추상 메서드로 선언된다.(public abstract)
// 메서드 선언만 존재하고 구현이 없다.
// 모든 변수는 상수로 선언된다.(public abstract final)
// * 자바 8부터 디폴트 메서드(default method)와 정적 메서드(static method) 기능 제공으로 인해,
//   일부 구현되는 메서드가 있다.
public interface Calc {

  double PI = 3.14;
  int ERROR = -99999999;

  int add(int num1, int num2);
  int substract(int num1, int num2);
  int times(int num1, int num2);
  int divide(int num1, int num2);

}