package ch18;

// 인터페이스의 상속
// 인터페이스 사이에서도 상속을 사용할 수 있다.
// 인터페이스는 다중 상속이 가능하다.
// 구현 코드의 상속이 아니기 때문에 타입 상속이 된다.
public interface MyInterface extends X, Y {

  void myMethod();

}