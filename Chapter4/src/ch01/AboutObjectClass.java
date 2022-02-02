package ch01;

public class AboutObjectClass {

  // java.lang 패키지
  // 프로그래밍 시 따로 import 하지 않아도 자동으로 import 된다.
  // 예) import java.lang.*;
  // 많이 사용되는 기본 클래스들이 포함된 패키지이다.
  // 예) String, Integer, System ...

  // java.lang.Object 클래스
  // 모든 클래스는 Object 클래스를 상속 받는다.
  // 따라서 Object 클래스는 모든 클래스의 최상위 클래스가 된다.
  // 모든 클래스는 Object를 상속받으며, Object 클래스의 메서드 중 일부를 재정의하여 사용할 수 있다.
  // (재정의 불가능한 메서드들의 경우 final로 선언되어 있다.)
  // 따로 명시하지 않아도 컴파일러가 extends Object를 추가하게 된다.
  // 예) class Student > class Student extends Object

}