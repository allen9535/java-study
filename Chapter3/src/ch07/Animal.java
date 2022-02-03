package ch07;

// 다형성(polymorphism)
// 다형성이란 하나의 코드가 여러 자료형으로 구현되어 실행되는 것이다.
// 정보 은닉, 상속과 함께 객체지향 프로그래밍의 가장 큰 특징 중 하나이다.
// 다형성을 잘 활용하면 유연하고 확장성이 있으며 유지 보수가 편리한 프로그램을 만들 수 있다.
public class Animal {

  // 다형성을 사용하는 이유
  // 상속과 메서드 재정의를 통해 확장성 있는 프로그램을 만들 수 있다.
  // 다형성을 활용하지 않으면 수없이 많은 if-else if문을 구현해야 하고,
  // 이는 곧 코드 유지 보수의 난이함을 뜻한다.
  // 상위 클래스에서는 공통되는 부분을 제공, 하위 클래스에서는 각 클래스에 맞는 기능 구현
  // 여러 클래스를 하나의 상위 클래스 타입으로 핸들링 할 수 있다.

  public void move() {
    System.out.println("동물이 움직인다.");
  }

  public void eating() {}

}