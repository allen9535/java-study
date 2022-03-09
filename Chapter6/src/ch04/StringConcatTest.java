package ch04;

// 객체지향 프로그래밍과 람다식 비교
// 아래는 두 방식을 테스트하는 내용이다.
public class StringConcatTest {

  public static void main(String[] args) {
    String s1 = "Hello";
    String s2 = "World";

    StringConcatOOP oop = new StringConcatOOP();
    oop.makeString(s1, s2);

    StringConcat lambda = (s, v) -> System.out.println(s + ", " + v);
    lambda.makeString(s1, s2);
  }

}