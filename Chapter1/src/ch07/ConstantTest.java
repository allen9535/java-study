package ch07;

public class ConstantTest {

  public static void main(String[] args) {

    // 상수란 변하지 않는 수를 말한다.
    // 원주율(3.14), 1년(12개월) 등 변경되지 않을 값에 사용한다.
    // 여러 곳에서 사용되더라도 선언한 부분만 변경하면 되므로 편리하다.
    final int MAX_NUM = 100;
    final int MIN_NUM;

    MIN_NUM = 0;

    System.out.println(MAX_NUM);
    System.out.println(MIN_NUM);

    // 한 번 선언된 다음 다시 값을 대입할 수 없다.
    //    MAX_NUM = 1000;

  }

}