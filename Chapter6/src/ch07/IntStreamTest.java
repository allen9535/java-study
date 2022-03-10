package ch07;

import java.util.Arrays;

// 정수 배열에 스트림을 생성하고 연산을 수행한다.
public class IntStreamTest {

  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5};

    // 합계를 구함
    int sum = Arrays.stream(arr).sum();
    // 갯수를 구함
    long count = Arrays.stream(arr).count();

    System.out.println(sum);
    System.out.println(count);
  }

}