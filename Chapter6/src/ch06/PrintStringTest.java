package ch06;

// 함수를 변수처럼 사용하는 람다식
// 변수는
// 1. 특정 자료형으로 변수를 선언한 후 값을 대입한다.
// 2. 매개 변수로 전달하여 사용 가능하다.
// 3. 메서드의 반환 값으로써 반환 가능하다.
// 는 특징을 가진다.
// 람다식을 사용함으로써 함수를 변수처럼 사용할 수 있게 된다.
public class PrintStringTest {

  interface PrintString {
    void showString(String str);
  }

  public static void showMyString(PrintString s) {
    s.showString("Hello World! This is LAMBDA!!");
  }

  public static PrintString returnString() {
    return s -> System.out.println(s + "World! This is LAMBDA!!!");
  }

  public static void main(String[] args) {
    // 람다식을 변수에 대입
    PrintString lambda = s -> System.out.println(s);
    lambda.showString("Hello World! This is LAMBDA!");

    // 람다식을 매개변수로 전달
    showMyString(lambda);

    // 람다식을 반환 값으로 사용
    PrintString reStr = returnString();
    reStr.showString("Hello ");
  }

}