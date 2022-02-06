package ch04;

public class StringBuilderTest {

  public static void main(String[] args) {
    String java = new String("java");
    String android = new String("android");

    // StringBuilder
    // 내부적으로 가변적인 char[]를 멤버 변수로 가지기 때문에
    // 일반적으로 String을 사용하는 것과는 달리 수정이나 변경이 가능하다.
    // 문자열을 여러 번 연결하거나 변경할 때 새로운 인스턴스를 생성하지 않고 char[]를 변경한다.

    // StringBuilder와 StringBuffer의 차이점
    // StringBuffer는 멀티 스레드 프로그래밍에서 동기화(synchronization)를 보장한다.
    // 단일 스레드 프로그래밍에서는 StringBuilder 사용을 권장한다.
    StringBuilder buffer = new StringBuilder(java);
    System.out.println("--------------- java 문자열이 들어간 buffer의 주소 값 ---------------");
    System.out.println(System.identityHashCode(buffer));
    // buffer에 문자열 "android"를 붙인다.
    buffer.append("android");
    System.out.println("--------------- android 문자열을 연결한 buffer의 주소 값 ---------------");
    System.out.println(System.identityHashCode(buffer));
    // buffer의 문자열을 String으로 사용하고 싶을 경우
    // toString() 메서드로 String을 반환할 수 있다.
    String test = buffer.toString();
  }

}