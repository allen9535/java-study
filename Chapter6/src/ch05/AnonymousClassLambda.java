package ch05;

// 익명 객체를 생성하는 람다식
// 자바에서는 객체 없이 메서드를 호출할 수 없다.
// 람다식을 구현하게 되면 익명 내부 클래스가 만들어지게 되고, 이를 통해 익명 객체를 생성할 수 있다.
// 익명 내부 클래스와 마찬가지로, 람다식 내부에서 람다식 외부의 지역 변수 값을 변경하면 오류가 발생한다.
public class AnonymousClassLambda {

  public static void main(String[] args) {
    String s1 = "Hello";
    String s2 = "World";

    StringConcat concat = new StringConcat() {
      @Override
      public void makeString(String s1, String s2) {
        System.out.println(s1 + ", " + s2);
      }
    };

    concat.makeString(s1, s2);
  }

}