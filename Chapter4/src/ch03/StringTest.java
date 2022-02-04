package ch03;

public class StringTest {

  public static void main(String[] args) {
    // String 선언
    // 힙 메모리에 인스턴스로 생성되는 경우
    String str1 = new String("abc");
    String str2 = new String("abc");
    // 상수 풀(constant pool)에 있는 주소를 참조하는 경우
    String str3 = "abc";
    String str4 = "abc";

    // 힙 메모리는 생성될 때 마다 다른 주소 값을 가진다.
    System.out.println("--------------- str1 == str2 ---------------");
    System.out.println(str1 == str2);
    // 상수 풀의 문자열은 모두 같은 주소 값을 가진다.
    System.out.println("--------------- str3 == str4 ---------------");
    System.out.println(str3 == str4);
  }

}