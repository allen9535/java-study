package ch19;

public class ObjectCopy {

  // 얕은 복사: 객체 주소만 복사하므로 한 쪽의 배열 요소를 수정하면 나머지 요소도 함께 수정된다.
  // 두 배열이 같은 객체를 가리키게 된다.
  public static void main(String[] args) {
    Book[] library = new Book[5];
    Book[] copyLibrary = new Book[5];

    library[0] = new Book("태백산맥1", "조정래");
    library[1] = new Book("태백산맥2", "조정래");
    library[2] = new Book("태백산맥3", "조정래");
    library[3] = new Book("태백산맥4", "조정래");
    library[4] = new Book("태백산맥5", "조정래");

    // System.arraycopy(src, srcPos, dest, destPos, length): 자바에서 제공하는 배열을 복사하는 메서드
    // 객체의 주소만 복사하는 메서드이다.
    // src: 원본 배열 | srcPos: 원본 배열의 몇 번째 요소에서부터 복사할 것인가
    // dest: src가 복사될 배열 | destPost: 복사될 배열의 몇 번째 요소에서부터 복사할 것인가
    // length: 몇 개의 요소를 복사할 것인가(길이)
    System.arraycopy(library, 0, copyLibrary, 0, 5);

    System.out.println("---------- library ----------");
    for (Book b: library) {
      b.showBookInfo();
    }

    System.out.println("---------- copyLibrary ----------");
    for (Book b: copyLibrary) {
      b.showBookInfo();
    }

    library[0].setTitle("나목");
    library[0].setAuthor("박완서");

    System.out.println("---------- library ----------");
    for (Book b: library) {
      b.showBookInfo();
    }

    System.out.println("---------- copyLibrary ----------");
    for (Book b: copyLibrary) {
      b.showBookInfo();
    }
  }

}