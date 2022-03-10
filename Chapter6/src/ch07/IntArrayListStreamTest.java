package ch07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 정수 자료에 대한 여러가지 연산
public class IntArrayListStreamTest {

  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5};
    Arrays.stream(arr).forEach(n -> System.out.println(n + "\t"));
    System.out.println();

    int sum = Arrays.stream(arr).sum();
    System.out.printf("sum: %d\n", sum);

    List<Integer> list = new ArrayList<>();
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(5);

    // 요소를 정수 값으로 변환하고(n.intValue()),
    // 스트림을 정수형 스트림으로 변환한 다음(mapToInt()),
    // 합계를 구한다.(sum())
    int sum2 = list.stream().mapToInt(n -> n.intValue()).sum();
    System.out.println(sum2);
  }

}