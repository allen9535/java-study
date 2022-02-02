package ch04;

public class DoubleTest2 {

  public static void main(String[] args) {

    // 자바에서 실수는 부동소수점 방식으로 표현하기 때문에 오차가 발생하기도 한다.
    double dNum = 1;

    for (int i = 0; i < 10000; i++) {
      dNum = dNum + 0.1;
    }

    System.out.println(dNum);

  }

}