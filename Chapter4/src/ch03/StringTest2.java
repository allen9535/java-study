package ch03;

public class StringTest2 {

  public static void main(String[] args) {
    String java = new String("java");
    String android = new String("android");

    System.out.println("--------------- java 문자열의 해시 주소 값 ---------------");
    System.out.println(System.identityHashCode(java));
    System.out.println("--------------- android 문자열의 주소 값 ---------------");
    System.out.println(System.identityHashCode(android));

    // java 문자열 뒤에 android 문자열을 연결
    java = java.concat(android);

    // 인스턴스 생성을 통한 문자열 생성이던, 또는 상수 풀을 참조한 문자열 생성이던
    // 한 번 생성된 String은 불변성(immutable)을 갖는다.(수정할 수 없다.)
    // 위와 같이 concat() 메서드를 통해 String을 연결한다고 하더라도
    // 기존의 String에 연결되는 것이 아니라 두 문자열이 연결된 새로운 문자열이 생성된다.
    // 경우에 따라서는 메모리 낭비가 발생할 수 있다.
    System.out.println("--------------- javaandroid 문자열의 주소 값 ---------------");
    System.out.println(java);
    System.out.println(System.identityHashCode(java));
  }

}