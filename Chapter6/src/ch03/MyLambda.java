package ch03;

// 함수형 인터페이스
// 람다식을 선언하기 위한 인터페이스
// 익명 함수와 매개 변수만으로 구현되므로 인터페이스에서는 단 하나의 메서드만 선언해야 한다.

// @FunctionalInterface 애노테이션(Annotation)
// 함수형 인터페이스라는 의미로, 내부에 여러 개의 메서드를 선언하면 에러가 발생한다.
@FunctionalInterface
public interface MyLambda {

  int getMax(int num1, int num2);
  // 두 번째 메서드를 선언하면 에러 발생!
  // int add(int x, int y);

}