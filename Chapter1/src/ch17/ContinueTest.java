package ch17;

public class ContinueTest {

  public static void main(String[] args) {

    int num;

    for (num = 1; num <= 100; num++) {
      if ((num % 3) != 0) {
        // continue의 경우, continue 이후의 실행되어야 할 반복문 내용을 실행하지 않고
        // 반복문의 시작 부분으로 돌아가 조건 검증부터 다시 시작한다.(카운트는 올라간다.)
        continue;
      }

      System.out.println(num);
    }

  }

}