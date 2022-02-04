package ch04;

public class StringBuilderTest {

  public static void main(String[] args) {
    String java = new String("java");
    String android = new String("android");

    // StringBuilder
    // 내부적으로 가변적인 char[]를 멤버 변수로 가진다.
    // 문자열을 여러 번 연결하거나 변경할 때 새로운 인스턴스를 생성하지 않고 char[]를 변경한다.
    // StringBuffer는 멀티 스레드 프로그래밍에서 동기화(synchronization)를 보장한다.
    // 단인 스레드 프로그램에서는 StringBuilder 사용을 권장한다.
    StringBuilder buffer = new StringBuilder(java);
    System.out.println("--------------- java 문자열이 들어간 buffer의 주소 값 ---------------");
    System.out.println(System.identityHashCode(buffer));
    buffer.append("android");
    System.out.println("--------------- android 문자열을 연결한 buffer의 주소 값 ---------------");
    System.out.println(System.identityHashCode(buffer));
    // toString() 메서드로 String을 반환
    java = buffer.toString();
  }

}