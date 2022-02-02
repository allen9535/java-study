package ch17;

public class BreakTest {

  public static void main(String[] args) {

    int sum = 0;
    int num;

    for (num = 1; ; num++) {
      sum += num;

      if (sum >= 100) {
        // break는 가장 가까이에 있는 반복문을 탈출한다.
        // 모든 반복문을 전부 탈출하는 것이 아니다.
        break;
      }
    }

    System.out.println(sum);
    System.out.println(num);

  }

}