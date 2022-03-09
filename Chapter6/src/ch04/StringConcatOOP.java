package ch04;

// 객체지향 프로그래밍과 람다식 비교
// 아래는 객체 지향 프로그래밍으로 구현하기 위해,
// 인터페이스를 구현한 클래스를 만든 것이다.
public class StringConcatOOP implements StringConcat {

  @Override
  public void makeString(String s1, String s2) {
    System.out.println(s1 + ", " + s2);
  }

}