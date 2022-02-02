package ch19;

public class BookArrayTest {

  // 기본 자료형 배열은 선언과 동시에 배열의 크기만큼 메모리가 할당되나,
  // 객체 배열의 경우 요소가 될 객체의 주소가 들어가는 메모리(4바이트, 8바이트)만 할당되고,(null 값으로 채운다.)
  // 각 객체를 생성하고 요소로 저장해야 한다.
  public static void main(String[] args) {
    Book[] library = new Book[5];

    // 배열은 생성되었지만 요소가 없으므로 null 값이 나온다.
    for (int i = 0; i < library.length; i++) {
      System.out.println(library[i]);
    }

    // 객체를 생성한 다음 각 배열의 요소로 저장해야 한다.
    library[0] = new Book("태백산맥1", "조정래");
    library[1] = new Book("태백산맥2", "조정래");
    library[2] = new Book("태백산맥3", "조정래");
    library[3] = new Book("태백산맥4", "조정래");
    library[4] = new Book("태백산맥5", "조정래");

    for (int i = 0; i < library.length; i++) {
      System.out.println(library[i]);
      library[i].showBookInfo();
    }

    // 또는 for문을 다음과 같이 간단하게 돌릴 수 있다.
    for (Book b: library) {
      System.out.println(b);
      b.showBookInfo();
    }
  }

}