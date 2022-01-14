package ch21;

import java.util.ArrayList;

public class ArrayListTest {

  // 배열과 관련해, 기존에는 배열의 길이를 정해 선언하고
  // 요소의 갯수가 배열의 길이보다 커지면 재할당 후 복사하는 등의 작업이 필요했다.
  // 또 요소가 추가되거나 삭제되면 다른 요소들의 이동에 관한 부분도 고려해야 했다.
  // ArrayList는 객체 배열을 좀 더 효율적으로 관리하기 위해 자바에서 제공되는 서비스이다.
  // 많은 메서드들이 최적의 알고리즘으로 구현되어 있기 때문에 유용하다.
  public static void main(String[] args) {
    // ArrayList의 주요 메서드
    // boolean add(E e): 요소 하나를 배열에 추가한다. E는 자료형을 뜻한다.
    // int size(): 배열에 존재하는 요소 전체 갯수를 반환한다.
    // E get(int index): 배열의 index 위치에 있는 요소를 반환한다.
    // E remove(int index): 배열의 index 위치에 있는 요소를 삭제한 후 그 값을 반환한다.
    // boolean isEmpty(): 배열이 비어있는지 확인한다.
    ArrayList<Book> library = new ArrayList<Book>();

    library.add(new Book("태백산맥1", "조정래"));
    library.add(new Book("태백산맥2", "조정래"));
    library.add(new Book("태백산맥3", "조정래"));
    library.add(new Book("태백산맥4", "조정래"));
    library.add(new Book("태백산맥5", "조정래"));

    for (int i = 0; i < library.size(); i++) {
      library.get(i).showBookInfo();
    }
  }

}