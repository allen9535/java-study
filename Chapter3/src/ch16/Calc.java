package ch16;

public interface Calc {

  // 상수
  // 모든 변수는 상수로 변환된다.(public static final)
  double PI = 3.14;
  int ERROR = -9999999;

  // 추상 메서드
  // 선언된 모든 메서드는 추상 메서드가 된다.(public abstract)
  int add(int num1, int num2);
  int substract(int num1, int num2);
  int times(int num1, int num2);
  int divide(int num1, int num2);

  // 디폴트 메서드(자바 8 이후)
  // 구현부를 가지는 메서드로, 인터페이스를 구현하는 클래스에서 공통으로 사용할 수 있는 기본 메서드이다.
  // 인터페이스를 구현하는 클래스에서 재정의 할 수 있다.
  default void description() {
    System.out.println("Calc 인터페이스의 default method");
    myMethod();
  }

  // 정적 메서드(자바 8 이후)
  // 인스턴스 생성과 상관 없이 인터페이스 타입으로 사용할 수 있는 메서드이다.
  // 즉, 만약 인터페이스를 구현한 클래스가 없다 하더라도 이 정적 메서드는 사용할 수 있게 된다.
  static int total(int[] arr) {
    int total = 0;

    for (int no: arr) {
      total += no;
    }

    mystaticMethod();

    return total;
  }

  // private 메서드(자바 9 이후)
  // 인터페이스를 구현한 클래스에서 사용하거나 재정의 할 수 없다.
  // 인터페이스 내부에서만 사용하기 위해 구현하는 메서드로,
  // default 메서드나 static 메서드에서 사용하기 위한 메서드이다.
  private void myMethod() {
    System.out.println("Calc 인터페이스의 private method");
  }

  private static void mystaticMethod() {
    System.out.println("Calc 인터페이스의 private static method");
  }

}