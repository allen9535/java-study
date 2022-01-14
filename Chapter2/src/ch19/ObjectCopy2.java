package ch19;

public class ObjectCopy2 {

  // 깊은 복사: 생성된 원본 객체의 값을 복사하되,
  // 복사된 객체와 복사한 객체가 서로 다른 객체를 가리키도록 한다.
  public static void main(String[] args) {
    Book[] library = new Book[5];
    Book[] copyLibrary = new Book[5];

    library[0] = new Book("태백산맥1", "조정래");
    library[1] = new Book("태백산맥2", "조정래");
    library[2] = new Book("태백산맥3", "조정래");
    library[3] = new Book("태백산맥4", "조정래");
    library[4] = new Book("태백산맥5", "조정래");

    // 원본이 복사될 배열의 객체를 각각 따로 만든다.
    copyLibrary[0] = new Book();
    copyLibrary[1] = new Book();
    copyLibrary[2] = new Book();
    copyLibrary[3] = new Book();
    copyLibrary[4] = new Book();

    // library의 객체를 copyLibrary의 객체에 복사한다.
    for (int i = 0; i < library.length; i++) {
      copyLibrary[i].setTitle(library[i].getTitle());
      copyLibrary[i].setAuthor(library[i].getAuthor());
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