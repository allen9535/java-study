package ch02;

public class FunctionTest {

  // 함수(function): 하나의 기능을 수행하는 일련의 코드
  // 구현(정의)된 함수는 호출하여 사용하고, 기능이 끝나면 제어가 반환된다.
  // 여러 곳에서 동일한 방식으로 호출되어 사용할 수 있다.
  // 함수가 사용할 지역 변수들이 사용할 메모리 공간이 스택에 생성된다.
  // 사용이 끝나면 메모리를 해제한다.
  // 메서드라고도 한다: 객체의 기능을 구현하기 위해 클래스 내부에 구현하는 함수
  public static int addNum(int num1, int num2) {
    int result;

    result = num1 + num2;

    return result;
  }

  public static void sayHello(String greeting) {
    System.out.println(greeting);
  }

  public static int calcSum() {
    int sum = 0;
    int i;

    for (i = 0; i <= 100; i++) {
      sum += i;
    }

    return sum;
  }

  // 프로그램을 실행시키면 제일 먼저 main() 함수가 사용할 메모리 공간이 스택에 생성된다.
  public static void main(String[] args) {
    int n1 = 10;
    int n2 = 20;

    int total = addNum(n1, n2);

    sayHello("안녕하세요!");

    int num = calcSum();

    System.out.println(total);
    System.out.println(num);
  }

}