package ch07;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

// ArrayList에 문자열 자료를 넣고 이에 대한 연산을 수행한다.
public class ArrayListStreamTest {

  public static void main(String[] args) {
    List<String> sList = new ArrayList<>();
    sList.add("First");
    sList.add("Second");
    sList.add("Third");

    Stream<String> stream = sList.stream();
    stream.forEach(s -> System.out.println(s));
    System.out.println();

    // 아래의 연산들은 스트림이 관리하는 자료를 하나씩 소모하면서 수행된다.
    // 최종 연산이 호출될 때 중간 연산이 수행되고 결과가 생성되며,
    // 최종 연산 후에는 더 이상 다른 연산을 적용할 수 없다.

    // sorted()가 중간 연산, forEach()가 최종 연산
    // sorted(): 요소를 오름차순으로 정렬한다.
    // forEach(): 요소를 하나씩 꺼낸다.
    sList.stream().sorted().forEach(s -> System.out.println(s));
    // map()이 중간 연산, forEach()가 최종 연산
    // map(): 요소를 원하는 값으로 변환한다.
    sList.stream().map(s -> s.length()).forEach(n -> System.out.println(n));
    // filter()가 중간 연산, forEach()가 최종 연산
    // filter(): 요소들 중 조건에 맞는 값을 추출한다.
    sList.stream().filter(s -> s.length() >= 5).forEach(s -> System.out.println(s));
  }

}